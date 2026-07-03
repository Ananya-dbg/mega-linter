package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoodLogging {

    // ✅ PASS: Standard logger initialization
    private static final Logger log = LoggerFactory.getLogger(GoodLogging.class);

    public void processData(String data) {
        // ✅ PASS: Parameterized log statement without performance-heavy string concats
        log.info("Beginning data processing for: {}", data);

        try {
            if (data == null) {
                throw new IllegalArgumentException("Data cannot be null");
            }
            // Processing logic here
        } catch (IllegalArgumentException e) {
            // ✅ PASS: Log the exception with full context via the logger
            log.error("Failed to process data due to an invalid argument", e);
        }
    }
}
