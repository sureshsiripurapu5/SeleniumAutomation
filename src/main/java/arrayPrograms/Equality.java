package arrayPrograms;

public class Equality {
    public static void main(String[] args) {
        String s1=new String("Suresh");
        String s2=new String("Suresh");

        String s3="Suresh";
        String s4="Suresh";

        if(s3==s4){
            System.out.println("same");
        }

        if(s3.equals(s4)){
            System.out.println("same 22");
        }

        if(s1!=s2){
            System.out.println("true");
        }
        if(s1.equals(s2)){
            System.out.println("equal");
        }
    }
}
