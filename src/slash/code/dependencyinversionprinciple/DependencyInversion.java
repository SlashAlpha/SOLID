package slash.code.dependencyinversionprinciple;

public class DependencyInversion {
    public static void main(String[] args) {
        LoggingToDB fileLogger=new LoggingToDB(new Logger());
        fileLogger.logging();
    }

}

interface Ilogger{
    public void logInformation(String logInfo);

}

class Logger implements Ilogger{
    public void logInformation(String logInfo){
        System.out.println(logInfo);
    }

}
class LoggingToDB{
    private Ilogger ilogger;

    public LoggingToDB(Ilogger ilogger) {
        this.ilogger = ilogger;
    }



    public void logging(){
        ilogger.logInformation(("Printing logs to the file..."));

    }
}
