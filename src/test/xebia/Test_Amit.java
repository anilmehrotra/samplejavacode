package test.xebia;

import java.util.ArrayList;
import java.util.List;

public class Test_Amit {
  public static void main(String[] args) {
    List<Double> ages = new ArrayList<>();
    ages.add(4.0);
    ages.add(8.0);
    ages.add(9.5);
    ages.add(10.0);
    System.out.println("Milk amount :"+getMilkAmount(ages, 13));
    System.out.println("Skin number :"+getWoolen(ages, 13));
  }
  
  private static double getMilkAmount(List<Double> ages,int numberOfDays){
    double milkAmout = 0;
    for(Double age:ages){
      if(age >= 10) continue;
      for(int i=0;i<numberOfDays;i++){
        milkAmout = milkAmout+(50-((age*100)+i)*.03);
      }
    }
    
    return milkAmout;
  }
  
  private static int getWoolen(List<Double> ages, int numberOfDays) {
    int numberOfWoolenSkin = 0 ;
    for(Double age : ages){
      if(age >= 10) continue;
      numberOfWoolenSkin = numberOfWoolenSkin + 1;
      double temp = 8 + (age*100 * 0.01);
      if(numberOfDays > (temp+1)) numberOfWoolenSkin = numberOfWoolenSkin + 1;
    }
    return numberOfWoolenSkin;
  }
}
