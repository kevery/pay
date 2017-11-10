import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.DeflaterInputStream;

public class SimpleDemo {
    private static final Logger logger = LoggerFactory.getLogger(SimpleDemo.class);

    public static void main(String[] args)throws Exception {
        logger.debug("let`s do it");
        new BufferedInputStream(new DeflaterInputStream(new FileInputStream("")));

    }
}
