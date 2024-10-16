package Lavel_6

import BotState
import com.example.Strings
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList

class SixChapterOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_184_chapterTwo,
                Strings.introMessage_185_chapterTwo,
                Strings.introMessage_186_chapterTwo,
                Strings.introMessage_187_chapterTwo,
                Strings.introMessage_188_chapterTwo,
                Strings.introMessage_189_chapterTwo,
                Strings.introMessage_190_chapterTwo,
                Strings.introMessage_191_chapterTwo,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_192_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_192_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SixChapterTwoBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_193_chapterTwo,
                Strings.introMessage_194_chapterTwo,
                Strings.introMessage_195_chapterTwo,
                Strings.introMessage_196_chapterTwo,
                Strings.introMessage_197_chapterTwo,
                Strings.introMessage_198_chapterTwo,
                Strings.introMessage_199_chapterTwo,
                Strings.introMessage_200_chapterTwo,
                Strings.introMessage_201_chapterTwo,
                Strings.introMessage_202_chapterTwo,
                Strings.introMessage_203_chapterTwo,
                Strings.introMessage_204_chapterTwo,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_206_chapterTwo),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_205_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SixChapterThreeBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_207_chapterTwo,
                Strings.introMessage_208_chapterTwo,
                Strings.introMessage_209_chapterTwo,
                Strings.introMessage_210_chapterTwo,
                Strings.introMessage_211_chapterTwo,
                Strings.introMessage_212_chapterTwo,
                Strings.introMessage_213_chapterTwo,
                Strings.introMessage_214_chapterTwo,
                Strings.introMessage_215_chapterTwo,
                Strings.introMessage_216_chapterTwo,
                Strings.introMessage_217_chapterTwo,
                Strings.introMessage_218_chapterTwo,
                Strings.introMessage_219_chapterTwo,

            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_221_chapterTwo),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_220_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SixChapterFourBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_222_chapterTwo,
                Strings.introMessage_223_chapterTwo,
                Strings.introMessage_224_chapterTwo,
                Strings.introMessage_225_chapterTwo,
                Strings.introMessage_226_chapterTwo,
                ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.Glave_7),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.Glave_6_cancel,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SixChapterFourBlockGG : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_4_gg,
            ),
            bot
        )

        BotStateFactory.setActive(chatId.toString(), false)
    }
}