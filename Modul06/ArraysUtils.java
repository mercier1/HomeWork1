package Modul06;

public class ArraysUtils {
    public int sum(int array[]) {
        int sum = 0;
        for (int n : array) {
            sum += n;
        }
        return sum;
    }

    public int min(int array[]) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public int max(int array[]) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public int maxPositive(int array[]) {
        int maxPoz = array[0];
        for (int i = 1; i < array.length; i++) {
            if (maxPoz < array[i] && array[i] > 0) maxPoz = array[i];
        }
        return maxPoz;
    }

    public int multiplication(int array[]) {
        int multiplication = 1;
        for (int i : array) {
            multiplication *= i;
        }
        return multiplication;
    }

    public int modulus(int array[]) {
        int in = 0;
        if (array[array.length - 1] != 0) {
            in = array[0] % array[array.length - 1];
        }
        return in;
    }

    public int secondLargest(int array[]) {
        int largest1 = array[0];
        int largest2 = array[0];
        for (int number : array)
            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } else if (number > largest2)
                largest2 = number;
        return largest2;
    }

    int[] reverse(int[] array)
    {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static int[] findEvenElements(int[] array) {
        int count = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                count++;
            }
        }
        int[] evens = new int[count];
        int index = 0;
        for (int elem : array) {
            if (elem % 2 == 0) {
                evens[index] = elem;
                index++;
            }
        }
        return evens;
    }
}