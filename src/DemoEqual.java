


public class DemoEqual{

    public static void main(String[] args) {
        //SpringApplication.run(DemoApiBootApplication.class, args);
        DemoEqual w  = new DemoEqual();
        DemoEqual w1 = new DemoEqual();
        System.out.println(w  == w1);
        System.out.println(w.equals(w1));
    }
}
