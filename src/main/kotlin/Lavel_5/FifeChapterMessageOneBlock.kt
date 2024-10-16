package Lavel_5

import BotState
import com.example.Strings
import com.example.Strings.introMessage_140_chapterTwo
import com.example.Strings.introMessage_141_chapterTwo
import com.example.Strings.introMessage_142_chapterTwo
import com.example.Strings.introMessage_144_chapterTwo
import com.example.Strings.introMessage_145_chapterTwo
import com.example.Strings.introMessage_146_chapterTwo
import com.example.Strings.introMessage_147_chapterTwo
import com.example.Strings.introMessage_148_chapterTwo
import com.example.Strings.introMessage_149_chapterTwo
import com.example.Strings.introMessage_150_chapterTwo
import com.example.Strings.introMessage_151_chapterTwo
import com.example.Strings.introMessage_152_chapterTwo
import com.example.Strings.introMessage_153_chapterTwo
import com.example.Strings.introMessage_154_chapterTwo
import com.example.Strings.introMessage_155_chapterTwo
import com.example.Strings.introMessage_156_chapterTwo
import com.example.Strings.introMessage_157_chapterTwo
import com.example.Strings.introMessage_158_chapterTwo
import com.example.Strings.introMessage_159_chapterTwo
import com.example.Strings.introMessage_160_chapterTwo
import com.example.Strings.introMessage_161_chapterTwo
import com.example.Strings.introMessage_162_chapterTwo
import com.example.Strings.introMessage_163_chapterTwo
import com.example.Strings.introMessage_165_chapterTwo
import com.example.Strings.introMessage_166_chapterTwo
import com.example.Strings.introMessage_167_chapterTwo
import com.example.Strings.introMessage_168_chapterTwo
import com.example.Strings.introMessage_169_chapterTwo
import com.example.Strings.introMessage_170_chapterTwo
import com.example.Strings.introMessage_171_chapterTwo
import com.example.Strings.introMessage_172_chapterTwo
import com.example.Strings.introMessage_173_chapterTwo
import com.example.Strings.introMessage_174_chapterTwo
import com.example.Strings.introMessage_175_chapterTwo
import com.example.Strings.introMessage_176_chapterTwo
import com.example.Strings.introMessage_177_chapterTwo
import com.example.Strings.introMessage_178_chapterTwo
import com.example.Strings.introMessage_179_chapterTwo
import com.example.Strings.introMessage_180_chapterTwo
import com.example.Strings.introMessage_181_chapterTwo
import com.example.Strings.introMessage_182_chapterTwo
import com.example.Strings.introMessage_183_chapterTwo
import com.github.kotlintelegrambot.Bot
import com.github.kotlintelegrambot.entities.ChatId
import com.github.kotlintelegrambot.entities.ChatMember
import com.github.kotlintelegrambot.entities.KeyboardReplyMarkup
import com.github.kotlintelegrambot.entities.keyboard.KeyboardButton
import com.github.kotlintelegrambot.types.TelegramBotResult
import utils.sendMessageWithTyping
import utils.sendMessagesWithTypingList
import utils.sendPhotoWithTyping

class FifeChapterMessageOneBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage_140_chapterTwo,
                introMessage_141_chapterTwo,
                introMessage_142_chapterTwo,
                ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_143_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_143_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FifeChapterMessageTwoBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage_144_chapterTwo,
                introMessage_145_chapterTwo,
                introMessage_146_chapterTwo,
                introMessage_147_chapterTwo,
                introMessage_148_chapterTwo,
                introMessage_149_chapterTwo,
            ),
            bot
        )
        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_150_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_150_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FifeChapterMessageThreeBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage_151_chapterTwo,
                introMessage_152_chapterTwo,
                introMessage_153_chapterTwo,
                introMessage_154_chapterTwo,
                introMessage_155_chapterTwo,
                introMessage_156_chapterTwo,
                introMessage_157_chapterTwo,
                introMessage_158_chapterTwo,
                introMessage_159_chapterTwo,
                introMessage_160_chapterTwo,
                introMessage_161_chapterTwo,
                introMessage_162_chapterTwo,
                introMessage_163_chapterTwo,
            ),
            bot
        )

        sendPhotoWithTyping(
            chatId,
            "https://cloud.mail.ru/public/28iK/NY5gYnFgr",
            "",
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_164_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_164_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FifeChapterMessageFourBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage_165_chapterTwo,
                introMessage_166_chapterTwo,
                introMessage_167_chapterTwo,
                introMessage_168_chapterTwo,
                introMessage_169_chapterTwo,
                introMessage_170_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.introMessage_171_1),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.introMessage_171_chapterTwo,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}

class FifeChapterMessageFiveBlock : BotState {
    override suspend fun handleText(chatId: ChatId, text: String, bot: Bot, result: TelegramBotResult<ChatMember>) {
        if (BotStateFactory.isActive(chatId.toString())) {
            return
        }
        BotStateFactory.setActive(chatId.toString(), true)
        BotStateFactory.executingTexts = null
        sendMessagesWithTypingList(
            chatId,
            listOf(
                introMessage_172_chapterTwo,
                introMessage_173_chapterTwo,
                introMessage_174_chapterTwo,
                introMessage_175_chapterTwo,
                introMessage_176_chapterTwo,
                introMessage_177_chapterTwo,
                introMessage_178_chapterTwo,
                introMessage_179_chapterTwo,
                introMessage_180_chapterTwo,
                introMessage_181_chapterTwo,
                introMessage_182_chapterTwo,
                introMessage_183_chapterTwo,
            ),
            bot
        )

        val choiceOfAvatar = KeyboardReplyMarkup(
            keyboard = listOf(
                listOf(
                    KeyboardButton(Strings.Glave_6_start),
                ),
            ),
            resizeKeyboard = true,
            oneTimeKeyboard = true
        )
        sendMessageWithTyping(
            chatId,
            Strings.Glave_5_cancel,
            bot,
            choiceOfAvatar
        )
        BotStateFactory.setActive(chatId.toString(), false)
    }
}