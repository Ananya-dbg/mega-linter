package com.example;

public class BadLogging {

    public void processData(String data) {
        // ❌ FAIL: Hardcoded standard system output console printing
        System.out.println("Beginning data processing for: " + data);

        try {
            if (data == null) {
                throw new IllegalArgumentException("Data cannot be null");
            }
            // Processing logic here
        } catch (Exception e) {
            // ❌ FAIL: Writing stack trace directly to standard error output
            e.printStackTrace(); 
        }
    }
}
