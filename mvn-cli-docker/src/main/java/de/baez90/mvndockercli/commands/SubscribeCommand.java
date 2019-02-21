package de.baez90.mvndockercli.commands;

import picocli.CommandLine;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@CommandLine.Command(name = "subscribe", mixinStandardHelpOptions = true)
public class SubscribeCommand implements Runnable {

    @Option(names = {"-v", "--verbose"}, description = "Verbose mode")
    private boolean verbose = false;

    @Option(names = {"-u", "--username"}, description = "Username to use for the connection")
    private String username = null;

    @Parameters(arity = "1..*", paramLabel = "QUEUE", description = "Queue(s) to subscribe")
    private String[] queues;

    @Override
    public void run() {
        if(verbose) System.out.println("Running in verbose mode!");
        if (username != null) System.out.printf("Using username %s to connect to queues\n", username);

        for(var queue : queues) {
            System.out.printf("Connection to queue %s\n", queue);
        }
    }
}
