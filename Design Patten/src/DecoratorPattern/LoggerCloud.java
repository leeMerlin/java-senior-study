package DecoratorPattern;

public class LoggerCloud implements Logger{

    @Override
    public void log(String message) {
        System.out.println("日志输入到云平台"+ message);
    }
}
