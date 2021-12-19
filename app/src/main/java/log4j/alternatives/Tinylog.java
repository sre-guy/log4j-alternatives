package log4j.alternatives;

import org.tinylog.Logger;

public class Tinylog {
    // no need declare Logger like other logging frameworks
    public void exec() {
        String msg = "info";
        int number = 9;
        Logger.info("This is an {} log from tinylog, with number {}", msg, number);
        Logger.error("This is an {} from tinylog", "error");
    }
}
