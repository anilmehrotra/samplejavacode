package unmodifiable.list;

public class Person {
    
    private String name;
    private String add;
    
    public Person(String name, String add) {
        super();
        this.name = name;
        this.add = add;
    }
    public String getName() {
        return name;
    }
    public String getAdd() {
        return add;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAdd(String add) {
        this.add = add;
    }
    
    @Override
    public String toString() {
        return this.name+"::"+this.add;
    }
    
    
}
