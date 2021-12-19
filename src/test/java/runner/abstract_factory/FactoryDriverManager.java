package runner.abstract_factory;

public class FactoryDriverManager {
    public static DriverManager getManager(DriverType type){
        DriverManager driverManager = null;
        switch(type){
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FirefoxDriverManager();
                break;
            default:
                System.out.println("Invalid driver");
                break;
        }
        return driverManager;
    }
}
