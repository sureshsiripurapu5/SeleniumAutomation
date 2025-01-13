package javaAdvance.lambdaExpressions2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Employee{
    String ename;
    int salary;
    int experience;
    Employee(String ename,int salary,int experience){
        this.ename=ename;
        this.salary=salary;
        this.experience=experience;

    }
}
public class Demo2 {
    public static void main(String[] args) {
        //Ex1:
        //emp obj --> return name if sal>30k and sal>3
        Employee emp=new Employee("suresh",50000,5);
        Predicate<Employee> pr=e->(e.salary>30000 && e.experience>3);
        System.out.println(pr.test(emp));

        List<Employee> al=new ArrayList<>();
        al.add(new Employee("suresh",50000,5));
        al.add(new Employee("ramesh",20000,2));
        al.add(new Employee("rakesh",40000,1));
        al.add(new Employee("kohli",10000,4));
        al.add(new Employee("rohithSharma",25000,3));

        for(Employee e:al){
            if(pr.test(e)){
                System.out.println(e.ename+" "+e.salary);
            }
        }





    }
}
