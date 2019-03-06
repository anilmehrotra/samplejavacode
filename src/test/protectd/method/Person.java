package test.protectd.method;

public class Person {
	private String name;
	private String add;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	
	public void testingClone() throws CloneNotSupportedException{
		TestClone t = new TestClone();
		t.clone();
	}
}
