package per.gff.websocket.websocket_starter;



import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



/**

 * Created by sang on 16-12-22.

 */

@Configuration

public class WebController extends WebMvcConfigurerAdapter {

    @Override

    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/index").setViewName("index");

    }

}
