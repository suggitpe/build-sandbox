import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Adds two ints together
 */
public class AdderUpperImpl implements AdderUpper {

    private static final Logger LOG = LoggerFactory.getLogger(AdderUpperImpl.class);

    @Override
    public int add(int first, int second) {
        LOG.debug("Adding ints [" + first + "] and [" + second + "]");
        return first + second;
    }
}
