import java.util.*;

public class Strmet {
    public static void main(String[] args) {
        System.out.println("Strings");
        String Name= "AMAN";
        System.out.println(Name);
        int val=  Name.length();
        String lStr=  Name.toLowerCase();
        System.out.println(lStr);
        System.out.println(val);
        String NonTrim = "    LOl";
        System.out.println(NonTrim.trim());
        System.out.println(Name.substring(2,3));
        System.out.println(Name.replace('A', 'D'));
        System.out.println(Name.replace("AMA", "CHAMA"));
        System.out.println(Name.startsWith("AM"));
        System.out.println(Name.endsWith("AM"));
        System.out.println(Name.charAt(2));
        System.out.println(Name.equalsIgnoreCase("aman"));




    }

     
}