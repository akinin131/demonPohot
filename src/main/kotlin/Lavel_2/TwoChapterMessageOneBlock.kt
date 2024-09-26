package Lavel_2

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

class TwoChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_1_chapterTwo, Strings.introMessage_2_chapterTwo,
                Strings.introMessage_3_chapterTwo, Strings.introMessage_4_chapterTwo,
                Strings.introMessage_5_chapterTwo, Strings.introMessage_6_chapterTwo,
                Strings.introMessage_7_chapterTwo, Strings.introMessage_8_chapterTwo,
                Strings.introMessage_9_chapterTwo, Strings.introMessage_10_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_11__1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_11_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class ThreeChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_12_chapterTwo, Strings.introMessage_13_chapterTwo,
                Strings.introMessage_14_chapterTwo, Strings.introMessage_15_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.choiceOption1A),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_16_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FourChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_17_chapterTwo, Strings.introMessage_18_chapterTwo,
                Strings.introMessage_19_chapterTwo, Strings.introMessage_20_chapterTwo,
                Strings.introMessage_21_chapterTwo, Strings.introMessage_22_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_23_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_23_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FiveChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_24_chapterTwo, Strings.introMessage_25_chapterTwo,
                Strings.introMessage_26_chapterTwo, Strings.introMessage_27_chapterTwo,
                Strings.introMessage_28_chapterTwo, Strings.introMessage_29_chapterTwo,
                Strings.introMessage_30_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_31_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_31_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SixChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_32_chapterTwo, Strings.introMessage_33_chapterTwo,
                Strings.introMessage_34_chapterTwo, Strings.introMessage_35_chapterTwo,
                Strings.introMessage_36_chapterTwo, Strings.introMessage_37_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_38_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_38_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class SevenChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null

        sendMessagesWithTypingList(
            chatId,
            listOf(
                Strings.introMessage_39_chapterTwo, Strings.introMessage_40_chapterTwo,
                Strings.introMessage_41_chapterTwo, Strings.introMessage_42_chapterTwo,
                Strings.introMessage_43_chapterTwo, Strings.introMessage_44_chapterTwo,
                Strings.introMessage_45_chapterTwo, Strings.introMessage_46_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.Glave_3_start),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.Glave_2_cancel,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

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
                Strings.introMessage_4_gg
            ),
            bot
        )


        BotStateFactory.setActive(chatId.toString(), false)
    }
}