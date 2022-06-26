public class TaskSixArrayTwo {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] numDays = new int[30];
        float sum = 0;
        float average;
            numDays = RandomNumber.generateRandomArray();
        for (int i = 0; i < numDays.length; i++) {
            sum += numDays[i];
        }
        System.out.println("Сумма расходов за месяц равна: " + sum + " рублей");
        System.out.println();
        System.out.println("Задача 2 ");
        // Задача 2
        int min = numDays[0];
        int max = numDays[0];
        for (int i = 1; i < numDays.length; i++) {
            if (min > numDays[i]) {
                min = numDays[i];
            } else if (max < numDays[i]) {
                max = numDays[i];
            }
        }
        System.out.println("минимальное значение:" + min);
        System.out.println("максимальное значение:" + max);
        System.out.println();
        System.out.println("Задание 3 ");
        average = sum / numDays.length;
        System.out.println("Среднее число трат за месяц " + average);
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i] + " ");
        }
    }
}




