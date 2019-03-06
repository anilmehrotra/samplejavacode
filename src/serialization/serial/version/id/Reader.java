package serialization.serial.version.id;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import test.protectd.method.TestClone;

public class Reader {
    public static void main(String[] args) throws ClassNotFoundException, IOException, CloneNotSupportedException {
        Employee employee = new Employee();
        FileInputStream fin = new FileInputStream("D://employee.obj");
        ObjectInputStream ois = new ObjectInputStream(fin);
        employee = (Employee) ois.readObject();
        ois.close();
        System.out.println(employee.whoIsThis());
        TestClone t = new TestClone();
        t.clone();
    }

}
