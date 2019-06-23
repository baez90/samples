package de.bae90.cliSample;

import java.lang.System.Logger.Level;

public class Main {
    public static void main(String[] args) {
        var logger = System.getLogger("default");

        System.getProperties().forEach((o, o2) -> {
            logger.log(Level.INFO, String.format("%s: %s", o, o2));
        });
    }
}
