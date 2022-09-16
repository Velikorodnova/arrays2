public class Main {
    public static void main(String[] args) {
        System.out.println("task 1");
        int[] arr = generateRandomArray();
        int summa = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            summa = summa + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + summa + " рублей.");
        System.out.println();
        System.out.println("task 2");
        int minSumma = 0;
        for (i = 0; i < arr.length; i++) {
            minSumma = arr[i];
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumma + " рублей.");
        int maxSumma = 100000;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > maxSumma)
                maxSumma = arr[i];
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSumma + " рублей.");
        System.out.println();
        System.out.println("task 3");
        {
            double average = 0;
            for (int i1 = 0; i1 < arr.length; i1++) {
                average = average + arr[i1];
            }
            average = average / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
            System.out.println();
            System.out.println("task 4");
        }
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i1 = 0; i1 < reverseFullName.length/2; i1++) {
            char fullName = reverseFullName[i1];
            reverseFullName[i1] = reverseFullName[reverseFullName.length - i1 - 1];
            reverseFullName[reverseFullName.length - i1 - 1] = fullName;
        }
        System.out.println(reverseFullName);
    }
    int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}



