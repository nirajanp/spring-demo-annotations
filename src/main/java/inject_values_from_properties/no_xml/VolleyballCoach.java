package inject_values_from_properties.no_xml;

import org.springframework.beans.factory.annotation.Value;

public class VolleyballCoach implements Coach{
    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public VolleyballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyTraining() {
        return "Practice shots";
    }

    @Override
    public String getFortune() {
        return "From volley coach: " + fortuneService.getFortune();
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
}
