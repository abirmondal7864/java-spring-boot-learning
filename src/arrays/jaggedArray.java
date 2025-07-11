package arrays;

public class jaggedArray {
    public static void main(String[] args) {
        // Declare a 2D array (jagged array) with 3 rows and unknown columns for each row
        int [][]nums=new int [3][];
        //Imp***
        nums[0]=new int[3]; // First row with 3 elements
        nums[1]=new int[5];// Second row with 5 elements
        nums[2]=new int[2];// Third row with 2 elements

            // Loop through each row of the jagged array
            for(int i=0;i< nums.length;i++){
                // Loop through each column of the current row
                 for (int j=0;j< nums[i].length;j++){
                nums[i][j]=(int)(Math.random()*10);
                }
            }
        for (int[] n :nums){
            for (int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }

    }
}
