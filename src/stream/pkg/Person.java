package stream.pkg;

public class Person{
	private String name ;
	private String add;
	private int age;
	
	public Person(String name, String add, int age) {
		super();
		this.name = name;
		this.add = add;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public String getAdd() {
		return add;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString(){
		return name+" :: "+add+" :: "+age;
	}
}