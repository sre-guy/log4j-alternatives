package log4j.alternatives;

import static com.esotericsoftware.minlog.Log.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.StringWriter;
import java.io.PrintWriter;

public class Minlog {
    // Customized logger.
    static public class MyLogger extends Logger {
        public void log(int level, String category, String message, Throwable ex) {
            SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss.SSS");
            String stringDate = DateFor.format(new Date());
            StringBuilder builder = new StringBuilder(256);
            builder.append(stringDate);
            builder.append(" ");
            builder.append(message);
            if (ex != null) {
                StringWriter writer = new StringWriter(256);
                ex.printStackTrace(new PrintWriter(writer));
                builder.append("\n");
                builder.append(writer.toString().trim());
            }
            System.out.println(builder);
        }
    }

    // no need declare Logger like other logging frameworks
    public void exec() {
        setLogger(new MyLogger());
        set(LEVEL_DEBUG);
        String file = "/tmp/blah";
        info("Some message from minlog.");
        debug("Reading file reading file: " + file + ", msg from minlog");
    }
}
