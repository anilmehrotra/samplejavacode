package test.xebia;

import java.io.File;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ProcessXml {

  public static void main(String[] args) {
    String filePath = "D:\\spring-boot\\java\\samplejavacode\\resource\\text.xml";
    webShop(filePath, 14);
  }

  private static void webShop(String filePath, Integer days) {
    File file = new File(filePath);
    try {
      JAXBContext jaxbContext = JAXBContext.newInstance(Herd.class);
      Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
      Herd herd = (Herd) jaxbUnmarshaller.unmarshal(file);
      List<Labyak> labYakList = herd.getLabyak();
      getMilkStock(labYakList,days);
      getWoolenStock(labYakList,days);
      System.out.println("Herd:");
      for (Labyak labyak : labYakList) {
        System.out.println("\t" + labyak.getName() + " " + (Float.valueOf(labyak.getAge()) + (float)days/100) + " years old ");
      }
    } catch (JAXBException e) {
      e.printStackTrace();
    }
  }
  
  private static void getMilkStock(List<Labyak> labYakList,Integer days){
    System.out.println("In Stock:");
    double milkAmout = 0;
    for (Labyak labyak : labYakList) {
      if(Float.valueOf(labyak.getAge())<10) //***the day of LabYak dies***
      for (int i = 0; i<days; i++) {
        milkAmout = milkAmout + (50 - ((Float.valueOf(labyak.getAge()) * 100 + i) *.03));
      }
    }
    System.out.print("\t");
    System.out.printf("%.3f",milkAmout);
    System.out.println(" liters of milk");
  }
  
  private static void getWoolenStock(List<Labyak> labYakList,Integer days) {
    int numberOfWoolenSkin = 0 ;
    for(Labyak labyak : labYakList){
      if(Float.valueOf(labyak.getAge())<10) //***the day of LabYak dies***
      numberOfWoolenSkin = numberOfWoolenSkin + 1;
      double temp = 8 + (Float.valueOf(labyak.getAge())*100 * 0.01);
      if(days > (temp+1)) numberOfWoolenSkin = numberOfWoolenSkin + 1;
    }
    System.out.println("\t"+numberOfWoolenSkin+" skins of wool");
  }
}