package arrayPrograms;

import java.util.*;

public class HashMaoVsHashTable {
    public static void main(String[] args) {
        Map<Integer, String> studentData = new TreeMap<>();
        studentData.put(1, "Akhil");
        studentData.put(2, "Brain");
        studentData.put(3, "Catherine");
        studentData.put(10, "Danny");
        studentData.put(5, "Eagle");
//        studentData.put(null, null);
//        studentData.put(null, null);
        studentData.put(5, "Harry");
        studentData.put(5, "Ferry");
        studentData.put(8,"Ferry");
        studentData.put(9,"hi");
        studentData.put(6,null);
        studentData.put(7,null);

        System.out.println(studentData);
        for(Map.Entry<Integer,String> map: studentData.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }

//        System.out.println("*********************************");
//
//        Map<Integer, String> studentData1 = new Hashtable<>();
//        studentData1.put(1, "Akhil");
//        studentData1.put(2, "Brain");
//        studentData1.put(3, "Catherine");
//        studentData1.put(4, "Danny");
//        studentData1.put(5, "Eagle");
//        studentData1.put(5, "Ferry");
//        studentData1.put(5, "Ferry");
//        studentData1.put(5, "Ferry");
//
//
//        System.out.println(studentData1);


    }

}
