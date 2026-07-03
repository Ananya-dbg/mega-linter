package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service class for handling user logging.
 */
public class GoodLogging {

  private static final Logger LOG = LoggerFactory.getLogger(GoodLogging.class);

  // ✅ FIXED: Added a constructor with a comment inside to satisfy both conflicting PMD rules
  /**
   * Explicit constructor to satisfy PMD requirements.
   */
  public GoodLogging() {
    // Declared explicitly for PMD
  }

  /**
   * Processes the incoming data string safely.
   *
   * @param data the input data to process (Marked final to satisfy PMD)
   */
  public void processData(final String data) {
    if (data == null) {
      LOG.error("Failed to process data: input data is null");
      return;
    }

    LOG.info("Beginning data processing for: {}", data);
  }
}
