// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7};
        int[] array = {20, 5, 28, -19, 19, 2, 50, -2};
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        for(int LUI = array.length - 1; LUI > 0; LUI--) {
            for (int i = 0; i < LUI; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + "\t\t");
        }
        System.out.println("\n");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t\t");
        }

    }
    public static void swap(int[] array, int x, int y) {
        if (x == y) {
            return;
        }
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;


    }
}