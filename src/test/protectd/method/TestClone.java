package test.protectd.method;

public class TestClone implements Cloneable{
	String tname ;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public static void main(String[] args) throws CloneNotSupportedException  {
		Person p = new Person();
		p.setName("anil");
		p.setAdd("delhi");
		System.out.println(p.getName()+"::"+p.getAdd());
		//Person p1 = (Person) p.clone();
		TestClone t = new TestClone();
		t.setTname("clone test");
		TestClone tclone = (TestClone) t.clone();
		System.out.println(tclone.getTname());
		//.out.println(p1.getName()+"--"+p.getAdd());
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
