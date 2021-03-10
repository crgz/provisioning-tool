package com.github.crgz;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConnectorDemo {

    private static final Logger logger = LogManager.getLogger(ConnectorDemo.class);

    public static void main(String[] args) {
        logger.info("consult {}",  () -> new QueryFromResources(args[0]).hasSolution() ? "succeeded" : "failed");
    }
}
