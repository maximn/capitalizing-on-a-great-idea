import com.tutorial.idea.Debugging;
import com.tutorial.idea.Lookups;
import com.tutorial.idea.StackTrace;

import java.util.logging.Logger;

public class App {
    private final static Logger LOGGER = Logger.getLogger(Lookups.class.getName());

    public static void main(String[] args) {
        int selection = 0;
        if (args.length > 0) {
            selection = Integer.parseInt(args[0]);
        }

        switch (selection) {
            case 0:
                LOGGER.info(LOGGER.getName() + " some log message");
                break;
            case 1:
                new StackTrace().firstMethod();
                break;
            case 2:
                new Debugging().start();
                break;
        }
    }
}