package demo.api.spring.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApiBootApplication {

    public static void main(String[] args) {
        //SpringApplication.run(DemoApiBootApplication.class, args);
        DemoApiBootApplication w = new DemoApiBootApplication();
        DemoApiBootApplication w1 = new DemoApiBootApplication();
        System.out.println(w  == w1);
        System.out.println(w.equals(w1));
    }
    
    
    
    
}
