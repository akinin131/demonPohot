
import Lavel_1.FirstChapterMessageOneBlock
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.bot
import com.github.kotlintelegrambot.dispatch
import com.github.kotlintelegrambot.dispatcher.*
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.logging.LogLevel
import com.github.kotlintelegrambot.types.TelegramBotResult
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import kotlinx.coroutines.*

fun main() {
    val myBot = MyBot()
    myBot.createBot().startPolling()
}

class MyBot {
    private var currentState: BotState = FirstChapterMessageOneBlock()
    private val botScope = CoroutineScope(Dispatchers.Default)

    fun createBot(): Bot {
        return bot {
            token = ""
            logLevel = LogLevel.Network.Body

            dispatch {
                text {
                    val text = update.message?.text
                    if (text != null) {
                        val chatId = ChatId.fromId(update.message!!.chat.id)
                        val userId = update.message!!.from?.id
                        val chatIdQroup = ChatId.fromId(-1002229947613)

                        val result = bot.getChatMember(chatIdQroup, userId!!.toLong())

                        botScope.launch {
                            handleTextAndUpdateState(chatId, text, bot, result)
                        }
                    }
                }
            }
        }
    }

    private suspend fun handleTextAndUpdateState(
        chatId: ChatId,
        text: String,
        bot: Bot,
        result: TelegramBotResult<ChatMember>
    ) {
        supervisorScope {
            val newState = BotStateFactory.getState(text)
            if (newState != null) {
                currentState = newState
            }
            println(newState)
            currentState.handleText(chatId, text, bot, result)
        }
    }
}