public class foreach {
    public static void main(String[] args) {
        int [] adi ={1,2,3,4,5,7,8};
        float [] marks= {55,66,33,22};
        // String [] student = {"Adi","vristu"};
        // System.out.println(student[1]);
        // System.out.println(adi.length);
        // System.out.println(marks[0]);
        // for (int i = 0; i < adi.length; i++){
        //     System.out.println(adi[i]);
            
        // }
        for (int i = marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
            
        }

        for(int elements:adi){
            System.out.println(elements);
        }
    }
}
