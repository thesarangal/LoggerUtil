import android.util.Log

/**
 * The function for implementation of Log.
 *
 * @author Rajat Sarangal
 * @since April 01, 2023
 * @link https://github.com/thesarangal/LoggerUtil
 * */

/**
 * Log Types
 * */
enum class LogType {
    VERBOSE, WARNING, DEBUG, INFO, ERROR
}

/**
 * A utility function to log messages with different log levels.
 *
 * @param tag a tag to identify the log source
 * @param message the log message
 * @param type the type of log message [LogType] (VERBOSE, WARNING, DEBUG, INFO, or ERROR)
 */
fun logger(
    tag: String = "",
    message: String = "",
    type: LogType = LogType.DEBUG
) {

    // For Better Filter
    val tagFilter = "### $tag"

    if (BuildConfig.DEBUG && message.isNotBlank()) {
        when (type) {
            LogType.VERBOSE -> Log.v(tagFilter, message)
            LogType.DEBUG -> Log.d(tagFilter, message)
            LogType.WARNING -> Log.w(tagFilter, message)
            LogType.INFO -> Log.i(tagFilter, message)
            LogType.ERROR -> Log.e(tagFilter, message)
        }
    }
}
