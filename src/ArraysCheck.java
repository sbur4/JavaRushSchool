import java.util.Arrays;

public class ArraysCheck {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr1));
        Object[][] arr2 = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
        System.out.println(Arrays.deepToString(arr2));
    }

}
