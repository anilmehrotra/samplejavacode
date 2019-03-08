package test.xebia;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Herd {
  
  private List<Labyak> labyak;

  public List<Labyak> getLabyak() {
    return labyak;
  }

  @XmlElement
  public void setLabyak(List<Labyak> labyak) {
    this.labyak = labyak;
  }

}
