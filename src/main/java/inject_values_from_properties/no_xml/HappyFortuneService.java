package inject_values_from_properties.no_xml;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "You have a good fortune";
    }
}
