package Lavel_4

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
import utils.sendPhotoWithTyping

class FourChapterMessageOneBlock1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_99_chapterTwo,
                Strings.introMessage_100_chapterTwo,

                ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/cPJK/NzQgA5QFF",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(

                Strings.introMessage_101_chapterTwo,
                Strings.introMessage_102_chapterTwo,
                Strings.introMessage_103_chapterTwo,
                Strings.introMessage_104_chapterTwo,
                Strings.introMessage_105_chapterTwo,
                Strings.introMessage_106_chapterTwo,
                Strings.introMessage_107_chapterTwo,
                Strings.introMessage_108_chapterTwo,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_109_chapterTwo_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_109_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}


class FourChapterMessageOneBlock2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_110_chapterTwo,
                Strings.introMessage_111_chapterTwo,
                Strings.introMessage_112_chapterTwo,
                Strings.introMessage_113_chapterTwo,
                Strings.introMessage_114_chapterTwo,
                Strings.introMessage_115_chapterTwo,
                Strings.introMessage_116_chapterTwo,
                Strings.introMessage_117_chapterTwo,
                Strings.introMessage_118_chapterTwo,

                ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/NaCz/h6Be5di7F",
            "",
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_119_chapterTwo_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_119_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FourChapterMessageOneBlock3 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/hRSV/NjTxajM12",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_120_chapterTwo,
                Strings.introMessage_121_chapterTwo,
                Strings.introMessage_122_chapterTwo,
                Strings.introMessage_123_chapterTwo,
                Strings.introMessage_124_chapterTwo,
                Strings.introMessage_125_chapterTwo,
                Strings.introMessage_126_chapterTwo,
                Strings.introMessage_127_chapterTwo,
                Strings.introMessage_128_chapterTwo,


                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_128_chapterTwo_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_129_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FourChapterMessageOneBlock4 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_130_chapterTwo,
                Strings.introMessage_131_chapterTwo,
                Strings.introMessage_132_chapterTwo,
                Strings.introMessage_133_chapterTwo,
                Strings.introMessage_134_chapterTwo,
                Strings.introMessage_135_chapterTwo,
                Strings.introMessage_136_chapterTwo,
                Strings.introMessage_137_chapterTwo,
                Strings.introMessage_138_chapterTwo,
                Strings.introMessage_139_chapterTwo,
                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.Glave_5_start),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.Glave_4_cancel,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FourChapterMessageOneBlock5 : BotState {
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