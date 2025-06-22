class Logger{
    private static Logger logger;
    private Logger(){
        System.out.println("Logger Initialized");
    }
    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }
}
public class SingletonPatternExample{
    public static void main(String[] args){
        System.out.println("First Logger Trying...");
        Logger logger1 = Logger.getInstance();
        System.out.println("Second Logger Trying...");
        Logger logger2 = Logger.getInstance();

        if(logger1.equals(logger2)){
            System.out.println("Only one instance created");
        }else{
            System.out.println("Two different instances created");
        }
    }
}