package per.gff.websocket.websocket_starter;

/**
 * Hello world!
 *
 */
/**
 * Created by yangyibo on 16/12/29.
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

import static org.springframework.boot.SpringApplication.run;

@ComponentScan(basePackages ="per.gff.websocket.websocket_starter")
@SpringBootApplication
@EnableScheduling
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = run(App.class, args);
    }
}