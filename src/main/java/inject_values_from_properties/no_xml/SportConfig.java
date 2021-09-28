package inject_values_from_properties.no_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
public class SportConfig {

    // define bean for our chillFortuneService
    @Bean
    public FortuneService chillFortuneService(){
        return new ChillFortuneService();
    }

    // define bean for our volley coach and inject dependencies
    @Bean
    public Coach volleyballCoach() {
        VolleyballCoach volleyCoach = new VolleyballCoach(chillFortuneService());
        return volleyCoach;
    }
}
