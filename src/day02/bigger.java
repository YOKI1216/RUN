package day02;

public class bigger {
    public static void main(String[] args) {
        int[] arr={051,51,5614,51,51,51,51,51,51,51,51,5,15,15,46574,86,2,15,45,1,5,15,1,1,51,35,1};
        int max=getmax(arr);
        System.out.println("biggest is "+max);
    }
    public static int getmax(int[] arrays){
        int max=0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i]>max)
            max = arrays[i];
        }
        return max;
    }
}
