package inject_values_from_properties.no_xml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        // Steps to use values from properties file.
        // Step 1. Create sports.properties file
        // Step 2. Load properties file in Spring configuration by using @PropertySource annotation
        // Step 3. Reference values from properties file


        // read spring config java class
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SportConfig.class);

        // get the bean from spring container
        VolleyballCoach theCoach = context.getBean("volleyballCoach", VolleyballCoach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyTraining());

        // call our new swim coach methods .. has the props value injected
        System.out.println("email: " + theCoach.getEmail());
        System.out.println("team: " + theCoach.getTeam());
    }

}
