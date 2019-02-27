public class Number_Objects 
{
    static int count=0;
    String name ;
    {
    	 count++;
    }
    Number_Objects()
    {
        //count++;
    }
    
    public Number_Objects(String name){
    	this.name =name;
    	System.out.println("test");
    }
    public static void main(String[] args) 
    {
        Number_Objects obj1 = new Number_Objects();
        Number_Objects obj2 = new Number_Objects();
        Number_Objects obj3 = new Number_Objects();
        Number_Objects obj4 = new Number_Objects();
        Number_Objects obj5 = new Number_Objects("xxxx");
        System.out.println("Number of objects created:"+count);
    }
}