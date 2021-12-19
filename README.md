# Alternate Java loggers

Exploring log4j alternatives, as log4j is inherehtly vulnerable by design.

In this project, we explore 3 alternate logging libraries:

- Tinylog: https://tinylog.org/v2/
- Logback: http://logback.qos.ch/
- Minlog: https://github.com/EsotericSoftware/minlog

Capabilites and features for all these loggers are demonstrated via a simple "Hello-World" style Java application.

## Run

Run the project with Gradle by running:

```console
$ gradle run

> Task :app:run
08:47:52.166 INFO  log4j.alternatives.Logback - This is an INFO level log message from Logback!
08:47:52.168 ERROR log4j.alternatives.Logback - This is an ERROR level log message from Logback!
08:47:52.248 log4j.alternatives.Tinylog.exec() INFO: This is an info log from tinylog, with number 9
08:47:52.249 log4j.alternatives.Tinylog.exec() ERROR: This is an error from tinylog
19/12/2021 08:47:52.252 Some message from minlog.
19/12/2021 08:47:52.255 Reading file reading file: /tmp/blah, msg from minlog
```
