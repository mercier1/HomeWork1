public class zadanie1 {
    public static void main(String... args) {
        int[] intArray = {7, 5, 8};
        double[] doubleArray = {2.3, 4.3, 2.9};
        Tesla a = new Tesla();
        System.out.println("второе по велечине число int =" + a.largest2(intArray));
        System.out.println("второе по велечине число double =" + a.largest2(doubleArray));
        System.out.println("сумма всех чисел int=" + a.sum(intArray));
        System.out.println("сумма всех чисел double=" + a.sum(doubleArray));
        System.out.println("мин число int=" + a.min(intArray));
        System.out.println("мин число double=" + a.min(doubleArray));
        System.out.println("мах число int=" + a.max(intArray));
        System.out.println("воспроизвидение все чисел int=" + a.multiplication(intArray));
        System.out.println("воспроизвидение все чисел double =" + a.multiplication(doubleArray));
        System.out.println("модуль первого числа int=" + Math.abs(intArray[0]));
        System.out.println("модуль последнего числа double=" + Math.abs(doubleArray[2]));
        System.out.println("мах плюсовое число int =" + a.maxPoz(intArray));
    }
}