package com.yeamanan.foundation;

//import java.io.File;
//import java.util.jar.JarFile;
import org.apache.log4j.Logger;

/**
 * Foundation class.
 * @author Yeam Anan (<yeamanan@gmail.com>)
 */
public class Foundation {

    /**
     * Logger variable.
     */
    private static final Logger LOGGER = Logger.getLogger(Foundation.class);

    /**
     * Main() method.
     * @param args Arguments
     */
    public static void main(final String[] args) {
        //JarFile jarFile = new JarFile(new File());
        //Properties prop = System.getProperties();
        LOGGER.info(Foundation.class.getPackage().getName());
    }

}
