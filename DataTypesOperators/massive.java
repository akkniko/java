import java.util.Arrays;

public class massive {
    public static void main() {
        // 1
        int a1[] = { 1, 2, 3, 4, 5 };
        int a2[] = { 6, 7, 8, 9, 10 };
        a1 = a2;
        // a1 теперь ссылается на тот же массив, что и a2,
        // массив {1,2,3,4,5} становится недоступным


        // 2
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr));

        String[] names = { "Анна", "Борис", "Виктор" };
        System.out.println(Arrays.toString(names));

        int[] arrr = { 10, 20, 30, 40, 50 };
        int index = Arrays.binarySearch(arrr, 30);
        System.out.println(index); 

        index = Arrays.binarySearch(arrr, 25);
        System.out.println(index); 

        index = Arrays.binarySearch(arrr, 1, 4, 40);
        System.out.println(index); 

        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 1, 2, 4 };

        System.out.println(Arrays.equals(arr1, arr2)); 
        System.out.println(Arrays.equals(arr1, arr3)); 

        System.out.println(arr1 == arr2); // false

        int[] arr11 = { 1, 2, 3 };
        int[] arr22 = { 1, 2, 4 };
        int[] arr33 = { 1, 2, 3 };

        System.out.println(Arrays.compare(arr11, arr22)); // -1 (arr1 < arr2)
        System.out.println(Arrays.compare(arr22, arr11)); // 1 (arr2 > arr1)
        System.out.println(Arrays.compare(arr11, arr33)); // 0 (равны)

        String[] names1 = { "Alice", "Bob" };
        String[] names2 = { "Alice", "Charlie" };
        System.out.println(Arrays.compare(names1, names2));

        int[] array = { 5, 2, 8, 1, 9 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //[1, 2, 5, 8, 9]

        int[] array2 = { 5, 2, 8, 1, 9 };
        Arrays.sort(arr2, 1, 4); 
        System.out.println(Arrays.toString(array2));

        String[] names3 = { "Виктор", "Анна", "Борис" };
        Arrays.sort(names3);
        System.out.println(Arrays.toString(names3));

    }
}
