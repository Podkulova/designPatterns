package src.creational.p00_exercises.e01_singleton;

public class Main {
    public static void main(String[] args) {

        Servers servers1 = Servers.getInstance();
        servers1.addServer("http://seznam.cz");
        servers1.addServer("https://seznam.cz");

        Servers servers2 = Servers.getInstance();
        servers2.addServer("http://idnes.cz");
        servers2.addServer("http://idos.cz");
        servers2.addServer("ftp://my.server.cz");
        servers2.addServer("https://seznam.cz"); // duplicite


        System.out.println(servers1.getHttpServers());
        System.out.println(servers1.getHttpsServers());

    }
}
