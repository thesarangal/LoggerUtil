# LoggerUtil
The `logger()` function is a utility function that can be used to log messages with different log levels.

## Parameters
It takes three parameters:
- `tag`: A tag to identify the log source. This is an optional parameter and defaults to an empty string.
- `message`: The log message. This is also an optional parameter and defaults to an empty string.
- `type`: The type of log message, which is an enum of type `LogType`. This is an optional parameter and defaults to the `DEBUG` log level.
The function checks if the app is running in debug mode and if the log message is not blank. If both conditions are met, the function logs the message with the specified log level.

The `LogType` enum is used to specify the different log levels. It has five values:
- `VERBOSE`
- `WARNING`
- `DEBUG`
- `INFO`
- `ERROR`
- 
The tagFilter variable is used to create a tag that includes a prefix (`###`) and the tag parameter. This makes it easier to filter the logs in the Android Studio Logcat window.

Overall, this utility function can be very useful for logging messages during development and debugging. It can be used by simply calling the `logger()` function and passing in the appropriate parameters.

## Example
Here's an example of how you can use the logger() function in your code:

```bash
  class MainActivity : AppCompatActivity() {
  
      private val TAG = "MainActivity"
  
      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)
  
          // Log a debug message
          logger(tag = TAG, message = "Activity created")
  
          // Log an error message with a custom log type
          logger(tag = TAG, message = "Some error occurred", type = LogType.ERROR)
      }
  }
```

## Contributions

Contributions to this library are welcome. If you find a bug or have a feature request,
please open an issue on the [GitHub repository](https://github.com/thesarangal/LoggerUtil).

## License

This library is released under the [MIT License](https://opensource.org/licenses/MIT).