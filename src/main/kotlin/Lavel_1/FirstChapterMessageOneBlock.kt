package Lavel_1

import BotState
import BotStateFactory
import com.example.Strings
import com.example.Strings.Glave_1_cancel
import com.example.Strings.Glave_2_start
import com.example.Strings.introMessage10
import com.example.Strings.introMessage11
import com.example.Strings.introMessage12
import com.example.Strings.introMessage13
import com.example.Strings.introMessage14
import com.example.Strings.introMessage15
import com.example.Strings.introMessage16
import com.example.Strings.introMessage17
import com.example.Strings.introMessage18
import com.example.Strings.introMessage19
import com.example.Strings.introMessage20
import com.example.Strings.introMessage21
import com.example.Strings.introMessage22
import com.example.Strings.introMessage23
import com.example.Strings.introMessage24
import com.example.Strings.introMessage25
import com.example.Strings.introMessage25_1
import com.example.Strings.introMessage25_2
import com.example.Strings.introMessage26
import com.example.Strings.introMessage27
import com.example.Strings.introMessage28
import com.example.Strings.introMessage29
import com.example.Strings.introMessage3
import com.example.Strings.introMessage30
import com.example.Strings.introMessage31
import com.example.Strings.introMessage32
import com.example.Strings.introMessage33
import com.example.Strings.introMessage34
import com.example.Strings.introMessage35
import com.example.Strings.introMessage36
import com.example.Strings.introMessage37
import com.example.Strings.introMessage38
import com.example.Strings.introMessage39
import com.example.Strings.introMessage4
import com.example.Strings.introMessage40
import com.example.Strings.introMessage40_1
import com.example.Strings.introMessage40_2
import com.example.Strings.introMessage41
import com.example.Strings.introMessage42
import com.example.Strings.introMessage43
import com.example.Strings.introMessage44
import com.example.Strings.introMessage45
import com.example.Strings.introMessage46
import com.example.Strings.introMessage47
import com.example.Strings.introMessage48
import com.example.Strings.introMessage5
import com.example.Strings.introMessage6
import com.example.Strings.introMessage7
import com.example.Strings.introMessage8
import com.example.Strings.introMessage9
import com.example.Strings.introMessage9_1
import com.example.Strings.introMessage9_2
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.*
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class InitialStateLableOneT : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {}
}

class FirstChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessageWithTyping(
            chatId,
            Strings.introMessage1,
            bot,
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage2,
            bot
        )

        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage3, introMessage4, introMessage5, introMessage6,
            ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/t53M/Njx5h7x4D",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage7,
                introMessage8,
                ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(introMessage9_1),
                ),
                listOf(
                    KeyboardButton(introMessage9_2),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            introMessage9,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}


class FirstChapterMessageTwoBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage10, introMessage11, introMessage12,
                introMessage13, introMessage14, introMessage15,
                introMessage16, introMessage17, introMessage18, introMessage19, introMessage20, introMessage21, introMessage22, introMessage23, introMessage24,

            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(introMessage25_1),
                ),
                listOf(
                    KeyboardButton(introMessage25_2),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            introMessage25,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FirstChapterMessageThreeBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage26,
                introMessage27,
                introMessage28,
                introMessage29,
                introMessage30,
                introMessage31,
                introMessage32,
                introMessage33,
                introMessage34,
                introMessage35,
                introMessage36,
                introMessage37,
                introMessage38,
                introMessage39,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(introMessage40_1),
                ),
                listOf(
                    KeyboardButton(introMessage40_2),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            introMessage40,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}


class FirstChapterMessageFourlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage41,
                introMessage42,
                introMessage43,
                introMessage44,
                introMessage45,
                introMessage46,
                introMessage47,
                introMessage48,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Glave_2_start),
                ),

            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Glave_1_cancel,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

