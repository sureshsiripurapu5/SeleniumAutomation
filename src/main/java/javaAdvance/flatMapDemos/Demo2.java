package javaAdvance.flatMapDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        List<String> teamA= Arrays.asList("scott","david","miller");
        List<String> teamB= Arrays.asList("mary","luna","tom");
        List<String> teamC= Arrays.asList("ken","jony","kitty");

        List<List<String>>playersInWorldCup=new ArrayList<>();
        playersInWorldCup.add(teamA);
        playersInWorldCup.add(teamB);
        playersInWorldCup.add(teamC);

        //before java8
//        for(List<String> team:playersInWorldCup){
//            for (String name:team){
//                System.out.println(name);
//            }
//        }

        //using streams flatMap()
        List<String>finalPlayers=playersInWorldCup.stream().flatMap(p->p.stream()).collect(Collectors.toList());
        System.out.println(finalPlayers);



    }
}
