import java.util.logging.Logger;

public class DataBase {
    private static final Logger LOGGER = Logger.getLogger(DataBase.class.getName());

    public void startConnection(){
        LOGGER.info("Start Connection");
    }

    public void closeConnection(){
        LOGGER.info("Close Connection");
    }

    public void addData(Person tester){
        LOGGER.info("Add Data Test");
    }

    public void dropData(){
        LOGGER.info("Drop Data Test");
    }
}
