package Modul02;

class Tesla {
    public int largest2(int[] intArray) {
        int largest1 = intArray[0];
        int largest2 = intArray[0];
        for (int number : intArray)
            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } else if (number > largest2)
                largest2 = number;
        return largest2;
    }

    public double largest2(double[] doubleArray) {
        double largest1 = doubleArray[0];
        double largest2 = doubleArray[0];
        for (double number : doubleArray)
            if (number > largest1) {
                largest2 = largest1;
                largest1 = number;
            } else if (number > largest2)
                largest2 = number;
        return largest2;
    }

    public int sum(int[] intArray) {
        int sum = 0;
        for (int n : intArray) {
            sum += n;
        }
        return sum;
    }

    public double sum(double[] doubleArray) {
        double sum = 0;
        for (double n : doubleArray) {
            sum += n;
        }
        return sum;
    }

    public int min(int[] intArray) {
        int min = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] < min) min = intArray[i];
        }
        return min;
    }

    public double min(double[] doubleArray) {
        double min = doubleArray[0];
        for (int i = 1; i < doubleArray.length; i++) {
            if (doubleArray[i] < min) min = doubleArray[i];
        }
        return min;
    }

    public int max(int[] intArray) {
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) max = intArray[i];
        }
        return max;
    }

    public int multiplication(int[] intArray) {
        int multiplication = 1;
        for (int i : intArray) {
            multiplication *= i;
        }
        return multiplication;
    }

    public double multiplication(double[] doubleArray) {
        double multiplication = 1;
        for (double i : doubleArray) {
            multiplication *= i;
        }
        return multiplication;
    }

    public int maxPoz(int[] intArray) {
        int maxPoz = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (maxPoz < intArray[i] && intArray[i] > 0) maxPoz = intArray[i];
        }
        return maxPoz;
    }
}


