package ws;
import ws.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {


        Endpoint.publish("http://localhost:8080/",new BanqueService());

        System.out.println("Web service déployé sur http://localhost:8080/");


    }
}