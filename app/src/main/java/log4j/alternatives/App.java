package log4j.alternatives;

public class App {
    public static void main(String[] args) {
        new Logback().exec();
        new Tinylog().exec();
        new Minlog().exec();
    }
}
