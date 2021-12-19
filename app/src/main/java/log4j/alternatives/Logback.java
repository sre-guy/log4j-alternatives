package log4j.alternatives;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {
    private static final Logger LOGGER = LoggerFactory.getLogger(Logback.class);

    public void exec() {
        LOGGER.info("This is an INFO level log message from Logback!");
        LOGGER.error("This is an ERROR level log message from Logback!");
    }
}
