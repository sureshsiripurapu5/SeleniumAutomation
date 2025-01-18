package javaAdvance.flatMapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo3 {
    public static void main(String[] args) {

        List<Student> studentList1=new ArrayList<>();
        studentList1.add(new Student("suresh",101,'A'));
        studentList1.add(new Student("ramesh",102,'A'));
        studentList1.add(new Student("sharma",103,'A'));

        List<Student> studentList2=new ArrayList<>();
        studentList1.add(new Student("scott",101,'A'));
        studentList1.add(new Student("kl rahul",102,'A'));
        studentList1.add(new Student("mourya",103,'A'));

        List<List<Student>> studentList= Arrays.asList(studentList1,studentList2);

        //before java8
        /*for (List<Student> s:studentList){
            for (Student stu:s){
                System.out.println(stu.id+" "+stu.name);
            }
        }*/

        //using flatmap
        List<String>namesList=studentList.stream()
                .flatMap(x->x.stream())
                .map(n->n.name)
                .collect(Collectors.toList());
        System.out.println(namesList);


    }
}
