package arrays;

public class multiDimensionalArrays {
    public static void main(String[] args) {
        int[][] nums =new int [3][4];
        //input
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                nums[i][j]= (int) (Math.random()*10);//typecasting into int AFTER multiplication
            }
        }
        //output
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        //using enhanced for loop
        System.out.println("Using enhanced for loop");
        for(int []n:nums){
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }


    }
}
