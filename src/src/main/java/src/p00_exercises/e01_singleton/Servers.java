package src.p00_exercises.e01_singleton;

import java.util.ArrayList;
import java.util.List;

/*    Create a singleton Servers of lazy type. This singleton stores the list of servers (as String).
Implement the following functionalities:
    adding a server to the list
    a method adding the server to the list should return boolean
    (true if the server has been added to the list, false if it's otherwise)
            adding is possible, if its name starts from http or https
            adding a duplicated name is impossible.
            downloading a list of servers, that names start from http.
            downloading a list of servers, that names start from https.*/
public class Servers {
    private static Servers instance;
    private final List<String> servers;

    private Servers() {
        this.servers = new ArrayList<>();
    }

    public static Servers getInstance() {
        if (instance == null) {
            instance = new Servers();
        }
        return instance;
    }

    public boolean addServer(final String server) {
        if ((server.startsWith("http") || server.startsWith("https")) && !servers.contains(server)) {
            return servers.add(server);
        }
        return false;
    }

    public List<String> getHttpServers() {
        List<String> httpServers = servers.stream().filter(server -> server.startsWith("http:"))
                .toList();
        return httpServers;
    }

    public List<String> getHttpsServers() {
         List<String> httpsServers = servers.stream().filter(server -> server.startsWith("https:"))
                .toList();
        return httpsServers;
    }


}
