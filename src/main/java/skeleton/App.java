package skeleton;

import sinetja.Action;
import sinetja.Server;

public class App {
    public static void main(String[] args) {
        Server server = new Server(8000);

        Action helloAction = (req, res) -> {
            String name = req.param("name");
            res.respondText("Hello " + name);
        };

        server
            .GET("/", (req, res) -> res.respondText("URI to Hello World: " + server.uri(helloAction, "name", "World")))
            .GET("/hello/:name", helloAction);

        server.start();
        server.stopAtShutdown();
    }
}
