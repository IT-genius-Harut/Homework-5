package task3;

public class DynamicIntegerArray {
    private int[] array = new int[6];


    public static int[] removeAt(int indexOfElement, int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == indexOfElement){
                int[] tmp1 = new int[indexOfElement];
            }
        }
        return array;

    }
    public static int[] addValueInArray(int[] array, int element) {
        int[] tmp = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        tmp[tmp.length - 1] = element;
        array = tmp;
        return array;
    }
}
