
public class ComulativeSum {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,7,8,9};
        int[] array2 = new int[array1.length];
        array2[0] = array1[0];
        for (int i = 1; i < array2.length; i++) 
            array2[i] = array2[i-1] + array1[i];
        
        System.out.print("Initial Array : ");
        for (int i = 0; i < array1.length; i++) 
            System.out.print(array1[i]+" ");
        
        System.out.print("\nArray After Comulative Sum : ");
        for (int i = 0; i < array2.length; i++) 
            System.out.print(array2[i]+" ");
    }
}