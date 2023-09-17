// package demoproject;
public class ArrayCopyElementsofOneArrayToAnother {
    public static void main(String[] args) {
        //WAP to copy elements of an array to another array
        int[] original={67,30,45,20,12};
        int[] copy=original;
        System.out.println("Original Array is:");
        for(int i=0;i<original.length;i++){
            System.out.print(original[i]+"\t");
        }
        System.out.println("\nCopied array is:");
        {
            for(int i=0;i<copy.length;i++){
                System.out.print(original[i]+"\t");
            }
        }
    }
    
}
