package javaAdvance.streamMethods2;

import net.bytebuddy.agent.builder.AgentBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Stu{
    String name;
    int id;
    int percentage;
    public Stu(String name,int id,int percentage){
        this.name=name;
        this.id=id;
        this.percentage=percentage;

    }

}
public class ParallelStreams {
    public static void main(String[] args) {

        List<Stu> studentDetails= Arrays.asList(
                new Stu("suresh",101,80),
                new Stu("ramesh",102,75),
                new Stu("kohli",103,65),
                new Stu("virat",106,75),
                new Stu("harsha",108,55));

        //using streams--sequential
        studentDetails.stream()
                .filter(s->s.percentage>65)
                        .forEach(s-> System.out.println("stu name:;"+s.name+"stu id::"+s.id));



        //using parallel streams
        studentDetails.parallelStream().filter(s->s.percentage>65)
                .forEach(s-> System.out.println("stu name:;"+s.name+"stu id::"+s.id));

        //using streams then changing to parrallel
        studentDetails.stream().parallel()
                .filter(s->s.percentage>65)
                .forEach(s-> System.out.println("stu name:;"+s.name+"stu id::"+s.id));

        //using parallel then converting to sequential
        studentDetails.parallelStream().sequential().filter(s->s.percentage>65)
                .forEach(s-> System.out.println("stu name:;"+s.name+"stu id::"+s.id));





    }
}
