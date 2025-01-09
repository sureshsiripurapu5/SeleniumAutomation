package javaAdvance;

public class Employee implements Cloneable {
    int id;
    String name;

    public Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1=new Employee(101,"suresh");
        Employee e2=(Employee) e1.clone();

        System.out.println("Original object values::"+e1.id+" "+e1.name);
        System.out.println("Cloneobject values::"+e2.id+" "+e2.name);
    }
}
