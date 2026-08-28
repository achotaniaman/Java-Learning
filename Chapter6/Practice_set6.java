
public class Practice_set6 {

    public static void main(String[] args) {
        // Problem 1
        //     float [] marks={22,45,65,12,31};
        //     float sum =0;

        //     for (float element: marks) {
        //           sum= sum+ element;
        //     }
        //     System.out.println(sum);
        // Problem 2
        // float [] marks={22,45,65,12,31};
        // float num=212;
        // boolean isinArray = false;
        // for(float element:marks){
        //     if(num==element){
        //         isinArray= true;
        //         break;
        //     }
        // }
        // if(isinArray){
        //     System.out.println("The num is present in array");
        // }
        // else{
        //     System.out.println("Num is not present in array");
        // }
        // Problem 3
        // float[] marks = {22, 45, 65, 12, 31};
        // float sum = 0;
        // for (float element : marks) {
        //     sum = sum + element;
        // }
        // System.out.println("The avg marks is: "+sum/marks.length);
        // Probem 4
        // int[][] mat1 = {{2, 3, 4}, {5, 6, 7}};
        // int[][] mat2 = {{2, 8, 4}, {66, 6, 1}};
        // int[][] res = {{0, 0, 0}, {0, 0, 0}};

        // for (int i = 0; i < mat1.length; i++) {
        //     for (int j = 0; j < mat1[0].length; j++) {
        //         System.out.printf("The value of i is %d and j is %d\n",i,j);
        // //         res[i][j]= mat1[i][j]+mat2[i][j];

                
        //     }

        // }

        //    for (int i = 0; i < res.length; i++) {
        //     for (int j = 0; j < res[0].length; j++) {
        //         System.out.print(res[i][j] + " ");
        //     }
        //     System.out.println();
        // }



        // Problem 5
        // int[] arr = {1,2,3,4,5,6};
        // int n= Math.floorDiv(arr.length, 2);
        // // System.out.println(a);
        // int temp;
        // int l=  arr.length;


        // for (int i = 0; i < n; i++) {

        //     temp=arr[i];
        //     arr[i]=arr[l-i-1];
        //     arr[l-i-1]=temp;


            
        // }

        // for (int elem : arr) {
        //     System.out.println(elem+"");
            
        // }


        // Problem 6
        // int[] arr = {1,2,3,664,4,5,6};
        // // int l = arr.length;
        // int max= 0;

        // for(int e:arr){
        //     if(e>max){
        //         max=e;
        //     }
        // }
        // System.out.println(max);

        // Problem 7
        //  int[] arr = {2,3,664,4,5,6};
        // int l = arr.length;
        // int min= Integer.MAX_VALUE;

        // for(int e:arr){
        //     if(e<min){
        //         min=e;
                
        //     }
        // }
        // System.out.println(min);

        // Problem 8 
        int [] arr = {1,555,2,3,4,5};

        boolean isSorted= true;

        for(int i =0; i<arr.length-1;i++){
            if (arr[i]>arr[i+1]) {
                isSorted = false;
      
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
            
        }

        else{
            System.out.println("Array is not sorted");
        }





    }
}
