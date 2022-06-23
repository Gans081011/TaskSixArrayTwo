import java.util.Arrays;

public class TaskSixArrayTwo {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        {
            // Задача 1
            System.out.println("Задача 1");
            int[] numDays = new int[30];
            float sum = 0;
         float average = 0f;
            for (int i = 0; i < numDays.length; i++) {
                numDays[i] = random.nextInt(100_000) + 100_000;
                System.out.println("Сумма расходов за " + (i + 1) + " день " + numDays[i] + " рублей");
            }

            for (int i = 0; i < numDays.length; i++) {
                sum = numDays[i] + sum;
            }
            System.out.println("Сумма расходов за месяц равна: " + " " + sum + " рублей");
            System.out.println(" ");
            System.out.println("Задача 2 ");
            // Задача 2
            Arrays.sort(numDays);

            for (int i = 0; i < numDays.length; i++) {
                for (int j = 1; j < numDays.length; j++) {
                    if (numDays[i] < numDays[j]) {
                       int min =  numDays[i] ;
                    }
                    if (numDays[numDays.length-2] < numDays[numDays.length-1]) {
                       int max =  numDays[numDays.length-1] ;
                    }

                }
                System.out.println("минимальное значение:" + numDays[i]);
                System.out.println("максимальное значение:" + numDays[numDays.length-1]);
                break;
            }
            System.out.println(" ");
            System.out.println("Задание 3 ");
            average = sum/numDays.length;
            System.out.println("Среднее число трат за месяц "+ average);



            System.out.println(" ");
            System.out.println("Задание 4");
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int i = reverseFullName.length-1; i>= 0; i--) {
                System.out.print(reverseFullName[i]+" ");
            }
        }
    }
}



