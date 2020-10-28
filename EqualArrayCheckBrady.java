//Kabrina Brady

public class EqualArrayCheckBrady {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {1,2};
        int[] arr3 = {1,3};
        int[] arr4 = {1,2,3,4};

        System.out.println(areArraysEqual(arr1, arr2));
        System.out.println(areArraysEqual(arr1, arr3));
        System.out.println(areArraysEqual(arr1, arr4));
    }

    public static Boolean areArraysEqual(int[] arr1, int[] arr2){
        Boolean flag = false;

        if (arr1.length != arr2.length){
            return false;
        }

        for (int i = 0; i < arr1.length; i++){
            int one = arr1[i];
            int two = arr2[i];

            if (one == two){
                flag = true;
            }
            else{
                flag = false;
            }
        }

        if (flag){
            return true;
        }
        return false;
    }
}