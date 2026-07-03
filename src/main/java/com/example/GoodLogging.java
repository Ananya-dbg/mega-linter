package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service class for handling user logging.
 */
public class GoodLogging {

    // ✅ FIXED: Renamed 'log' to 'LOG' (UPPERCASE) to satisfy PMD's constant naming rule
    private static final Logger LOG = LoggerFactory.getLogger(GoodLogging.class);

    // ✅ FIXED: Added an explicit default constructor to satisfy PMD's AtLeastOneConstructor rule
    /**
     * Default constructor for GoodLogging.
     */
    public GoodLogging() {
        // Empty constructor required by PMD
    }

    /**
     * Processes the incoming data string safely.
     *
     * @param data the input data to process
     */
    public void processData(String data) {
        // ✅ FIXED: Removed the try-catch exception block that PMD flagged as "Exception as Flow Control"
        // and replaced it with a standard, clean if/else statement
        if (data == null) {
            LOG.error("Failed to process data: input data is null");
            return;
        }

        LOG.info("Beginning data processing for: {}", data);
    }
}
