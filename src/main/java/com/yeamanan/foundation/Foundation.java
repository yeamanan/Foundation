package com.yeamanan.foundation;

import java.io.IOException;
import org.apache.log4j.Logger;

public class Foundation {

    static Logger logger = Logger.getLogger(Foundation.class);

    public static void main(String[] args) throws IOException {
        logger.info(Foundation.class.getPackage().getName());
    }

}
