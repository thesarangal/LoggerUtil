import android.util.Log

/**
 * The function for implementation of Log.
 *
 * @author Rajat Sarangal
 * @since March 06, 2022
 * @link https://github.com/thesarangal/LoggerUtil
 * */

/**
 * Log Types
 * */
enum class LogType {
    VERBOSE, WARNING, DEBUG, INFO, ERROR
}

/**
 * Print Logs
 *
 * @param tag TAG
 * @param message the detail message string
 * @param type Type of Log [LogType]
 * */
fun logger(tag: String = "", message: String?, type: LogType = LogType.DEBUG) {

    // For Better Filter
    val tagFilter = "### $tag"

    if (BuildConfig.DEBUG && message != null) {
        when (type) {
            LogType.VERBOSE -> Log.v(tagFilter, message)
            LogType.DEBUG -> Log.d(tagFilter, message)
            LogType.WARNING -> Log.w(tagFilter, message)
            LogType.INFO -> Log.i(tagFilter, message)
            LogType.ERROR -> Log.e(tagFilter, message)
        }
    }
}
