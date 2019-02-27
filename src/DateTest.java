import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class DateTest {
    
    public static void main(String[] args) {
        /*SimpleDateFormat sdate = new SimpleDateFormat("yyyy-mm-ddhh:mm:ss.Z");
        String date = sdate.format("Fri Jun 18 00:00:00 IST 1993");
        System.out.println("ft "+date);      // TODO Auto-generated method stub
        Map<String,String> map = new HashMap<>();
        map.put("A", "ANil");
        map.put("T", "Test");
        System.out.println(map.get("A"));
        System.out.println(map.get("D"));
        System.out.println(UUID.randomUUID().toString());*/
        Date dt = new Date();
        System.out.println(dt);
        SimpleDateFormat dateFormatter = new SimpleDateFormat(
                "yyyy-MM-dd'T'hh:mm:ss'Z'");
        //yyyy-mm-ddThh:mm:ss.nnnnnnZ
        String strUTCDate = dateFormatter.format(dt);
        System.out.println(strUTCDate);
        
        System.out.println();
        Instant instant = Instant.now();
        System.out.println("instant -> "+ instant);
        System.out.println("instant c -> "+DateTimeFormatter.ISO_INSTANT.format(instant));
        System.out.println();
        // works with ZonedDateTime 
        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zdt -> "+zdt);
        String date = "Fri Jun 18 00:00:00 IST 1993";
        //System.out.println("zdt c -> "+date.format(DateTimeFormatter.ISO_INSTANT));
        
        
        System.out.println("zdt v -> "+DateTimeFormatter.ISO_INSTANT.format(zdt));
        
    }
    
}
