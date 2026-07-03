package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Service class for handling user logging.
 */
public class GoodLogging {

  private static final Logger LOG = LoggerFactory.getLogger(GoodLogging.class);

  /**
   * Processes the incoming data string safely.
   *
   * @param data the input data to process (Marked final to satisfy PMD)
   */
  // ✅ FIXED: Parameter is final, and no unnecessary constructor is present
  public void processData(final String data) {
    if (data == null) {
      LOG.error("Failed to process data: input data is null");
      return;
    }

    LOG.info("Beginning data processing for: {}", data);
  }
}
