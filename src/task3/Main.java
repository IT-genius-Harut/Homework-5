package task3;

public class Main {
    public static void main(String[] args) {
        DynamicIntegerArray dia = new DynamicIntegerArray();
        int[] array = {1, 8, 3, 82, 6, 2};
        array = dia.addValueInArray(array, 6);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
