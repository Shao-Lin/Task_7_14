import java.util.Scanner;

public class Main {
    // Функция создания массива
    public static int[] inputArr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите элементы массива ");
        String line = sc.nextLine();
        String[] lineArray = line.split(" ");
        int[] numbers = new int[lineArray.length];
        for (int i = 0; i < lineArray.length; i++) {
            numbers[i] = Integer.parseInt(lineArray[i]);
        }
        return numbers;
    }
    public static void test(){
        equalValue(test_1());
        equalValue(test_2());
        equalValue(test_3());
    }
    public static int[] test_1() {
        return new int[]{1, 1, 1, 1, 1, 1, 1};
    }
    public static int[] test_2() {
        return new int[]{2, 1, 1};
    }
    public static int[] test_3() {
        return new int[]{323,100,11,13,13};
    }
    // Функция проверки на все одинаковые элементы массива
    public static void equalValue(int[] arr) {
        int check = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                check += 1;
            else
                check+=0;
        }

        if(arr.length - 1 == check) {
            System.out.println("Такого элемента не существует");
        }
        else{
            System.out.println(sorting(arr));
        }
    }
        public static int sorting (int[] arr){
            // Определение минимального элемента массива и второго по минимальность
            int smallerElement = Integer.MAX_VALUE;
            int neededElement = Integer.MAX_VALUE;
            for (int checkSize = 0; checkSize < arr.length; checkSize++) {
                if (arr[checkSize] < smallerElement) {
                    neededElement = smallerElement;
                    smallerElement = arr[checkSize];
                } else if (arr[checkSize] == smallerElement) {
                    arr[checkSize] = smallerElement;
                } else if (arr[checkSize] < neededElement) {
                    neededElement = arr[checkSize];
                }

            }
            // Определение порядкового номера числа
            int checkElementPosition = 0;
            for (int checkSize = 0; checkSize < arr.length; checkSize++) {
                if (arr[checkSize] == neededElement) {
                    checkElementPosition = checkSize;
                }
            }
            return checkElementPosition;
        }
        // Основная функция
        public static void main (String[]args){
        test();
        equalValue(inputArr());
        }
}