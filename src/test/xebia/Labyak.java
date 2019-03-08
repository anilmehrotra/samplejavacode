package test.xebia;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Labyak {

  private String name; 
  
  private String age;
  
  private String sex;
  
  public String getName() {
    return name;
  }
  
  @XmlAttribute
  public void setName(String name) {
    this.name = name;
  }
  public String getAge() {
    return age;
  }
  
  @XmlAttribute
  public void setAge(String age) {
    this.age = age;
  }
  public String getSex() {
    return sex;
  }
  
  @XmlAttribute
  public void setSex(String sex) {
    this.sex = sex;
  }
}
