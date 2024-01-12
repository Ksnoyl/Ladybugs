package HeuristicServices;
import Enums.Heuristic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HeuristicOneService {

    final String description = Heuristic.ONE.getDescription();
    private static final Logger logger = LoggerFactory.getLogger(HeuristicOneService.class);

    public void testLogger() {
        logger.info("Starting logging for:", HeuristicOneService.class, description);
    }

    public static void spinnerCheck() {
    }
}
