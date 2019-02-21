package de.baez90.mvndockercli;

import de.baez90.mvndockercli.commands.SubscribeCommand;
import picocli.CommandLine;

public class App {
    public static void main(String[] args) {
        CommandLine.run(new SubscribeCommand(), args);
    }
}
