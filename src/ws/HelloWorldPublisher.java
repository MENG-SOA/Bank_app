package ws;
import javax.xml.ws.Endpoint;
public class HelloWorldPublisher {
        public static void main(String[] args) {
            String url = "http://localhost:8088/ws/bankservice";
            Endpoint.publish(url, new BankService());
            System.out.println(url); }
    }
