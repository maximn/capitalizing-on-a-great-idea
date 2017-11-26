import com.tutorial.idea.Lookups;

import java.util.logging.Logger;

public class App {
    private final static Logger LOGGER = Logger.getLogger(Lookups.class.getName());

    public static void main(String[] args) {
        LOGGER.info(LOGGER.getName() + " some log message");
    }
}