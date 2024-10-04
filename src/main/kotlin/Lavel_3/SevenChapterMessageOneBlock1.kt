package Lavel_3

import BotState
import com.example.Strings
import com.example.Strings.Glave_3_cancel
import com.example.Strings.Glave_3_start
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class SevenChapterMessageOneBlock1 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_47_chapterTwo,
                Strings.introMessage_48_chapterTwo,
                Strings.introMessage_49_chapterTwo,
                Strings.introMessage_50_chapterTwo,
                Strings.introMessage_51_chapterTwo,
                Strings.introMessage_52_chapterTwo,
                Strings.introMessage_53_chapterTwo,
                Strings.introMessage_54_chapterTwo,
                Strings.introMessage_55_chapterTwo,
                Strings.introMessage_56_chapterTwo,
                Strings.introMessage_57_chapterTwo,
                Strings.introMessage_58_chapterTwo,

                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_59_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_59_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SevenChapterMessageOneBlock2 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_60_chapterTwo,
                Strings.introMessage_61_chapterTwo,
                Strings.introMessage_62_chapterTwo,
                Strings.introMessage_63_chapterTwo,
                Strings.introMessage_64_chapterTwo,
                Strings.introMessage_65_chapterTwo,
                Strings.introMessage_66_chapterTwo,
                Strings.introMessage_67_chapterTwo,
                Strings.introMessage_68_chapterTwo,),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_69_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_69_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}


class SevenChapterMessageOneBlock3 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_70_chapterTwo,
                Strings.introMessage_71_chapterTwo,
                Strings.introMessage_72_chapterTwo,
                Strings.introMessage_73_chapterTwo,
                Strings.introMessage_74_chapterTwo,
                Strings.introMessage_75_chapterTwo,
                Strings.introMessage_76_chapterTwo,
                Strings.introMessage_77_chapterTwo,
                Strings.introMessage_78_chapterTwo,
                Strings.introMessage_79_chapterTwo,
                Strings.introMessage_80_chapterTwo,
                Strings.introMessage_81_chapterTwo,

                ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_82_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_82_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SevenChapterMessageOneBlock4 : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_83_chapterTwo,
                Strings.introMessage_84_chapterTwo,
                Strings.introMessage_85_chapterTwo,
                Strings.introMessage_86_chapterTwo,
                Strings.introMessage_87_chapterTwo,
                Strings.introMessage_88_chapterTwo,
                Strings.introMessage_89_chapterTwo,
                Strings.introMessage_90_chapterTwo,
                Strings.introMessage_91_chapterTwo,
                Strings.introMessage_92_chapterTwo,
                ),
            bot
        )
        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/6Fob/F4dgRZJt3",
            "",
            bot
        )
        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_93_chapterTwo,
                Strings.introMessage_94_chapterTwo,
                Strings.introMessage_95_chapterTwo,
                Strings.introMessage_96_chapterTwo,
                Strings.introMessage_97_chapterTwo,
                Strings.introMessage_98_chapterTwo,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.Glave_4_start),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Glave_3_cancel,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}