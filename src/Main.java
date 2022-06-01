public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

    private static void task1() {
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int j : arr) sum += j;
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task2() {
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int j : arr) {
            if (j > max)
                max = j;
            if (j < min)
                min = j;
        }
        System.out.println("min: " + min + " max: " + max);
    }


    private static void task3() {

        int[] arr = generateRandomArray();
        double sum = 0;
        for (int j : arr) sum += j;
        double monthExpenses = sum / arr.length;
        System.out.println(" Средняя сумма трат за месяц составила " + monthExpenses + " рублей ");

    }


    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.println(reverseFullName[i]);
        }

    }
}


