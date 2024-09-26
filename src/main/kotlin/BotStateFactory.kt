
import Lavel_1.*
import Lavel_2.*

import com.example.Strings

import kotlinx.coroutines.Job
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import java.util.concurrent.ConcurrentHashMap

object BotStateFactory {
    private val mutex = Mutex()
    internal var executingTexts: ConcurrentHashMap<String, Boolean>? = ConcurrentHashMap()

    private var _isActive = false
    private val activeStates = ConcurrentHashMap<String, Boolean>()
    internal val executingTextsPhoto = ConcurrentHashMap<String, Boolean>()
    private val executingJobs = ConcurrentHashMap<String, Job>()
    private val executingJobsPhoto = ConcurrentHashMap<String, Job>()

    // Геттер для активности конкретного chatId
    fun isActive(chatId: String): Boolean {
        return activeStates[chatId] ?: false
    }

    // Сеттер для активности конкретного chatId
    fun setActive(chatId: String, isActive: Boolean) {
        activeStates[chatId] = isActive
    }

    suspend fun getState(text: String): BotState? {
        if (text.contains(Regex("start"))) {
            executingTexts = null
            setExecuting(text, false)
        }
        return when {
            text.contains(Regex(Regex.escape(Strings.Glave_1))) -> FirstChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage9_1))) -> FirstChapterMessageTwoBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage9_2))) -> FirstChapterMessageTwoBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage25_1))) -> FirstChapterMessageThreeBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage25_2))) -> FirstChapterMessageThreeBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage40_1))) -> FirstChapterMessageFourlock()
            text.contains(Regex(Regex.escape(Strings.introMessage40_2))) -> FirstChapterMessageFourlock()
            text.contains(Regex(Regex.escape(Strings.Glave_2_start))) -> TwoChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage_11__1))) -> ThreeChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.choiceOption1A))) -> FourChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage_23_1))) -> FiveChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage_31_1))) -> SixChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.introMessage_38_1))) -> SevenChapterMessageOneBlock()
            text.contains(Regex(Regex.escape(Strings.Glave_3_start))) -> SevenChapterMessageOneBlock1()

            text.contains(Regex("start")) -> FirstChapterMessageOneBlock()
            else -> InitialStateLableOneT()
        }
    }

    suspend fun setExecuting(text: String, isExecuting: Boolean) {
        mutex.withLock {
            executingTexts?.set(text, isExecuting)
        }
    }

    suspend fun setExecutingPhoto(photoUrl: String, isExecuting: Boolean) {
        mutex.withLock {
            executingTextsPhoto[photoUrl] = isExecuting
        }
    }

    fun isExecutingPhoto(text: String): Boolean {
        return executingJobsPhoto[text]?.isActive == true
    }

    fun isExecuting(text: String): Boolean {
        return executingJobs[text]?.isActive == true
    }
}