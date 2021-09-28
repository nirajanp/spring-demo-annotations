package inject_values_from_properties.no_xml;

public class ChillFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "I am chill today.";
    }
}
