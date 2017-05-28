package skeleton;

import sinetja.Server;

public class App {
    public static void main(String[] args) {
        Server server = new Server(8000);

        server
                .GET("/", (req, res) ->
                        res.respondText("Hello world")
                )
                .GET("/hello/:name", (req, res) -> {
                    String name = req.param("name");
                    res.respondText("Hello " + name);
                });

        server.start();
        server.stopAtShutdown();
    }
}
