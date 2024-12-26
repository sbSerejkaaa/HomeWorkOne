package org.example;
public class Main {
    public static void main(String[] args) {
        Main mainOne = new Main();

        //Практическое задание № 1. (Перевернуть строку и вывести на консоль).
        turnString(mainOne.string);

        // Практческое задание №2. (Удалить дубликаты из массива и вывести в консоль,без сторонних инструментов).
        getDistinctNumbers(mainOne.ints);

        // Практическое задане №3. (Найти элемент, который меньше максимума)
        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println("Практическое задание №3.");
        System.out.println(findSecondMaxElement(arr));

        // Практическое задание №4. Вывести длинну последнего слова.
        String input1 = "Hello world";                                       // Ожидаемый вывод: 5
        String input2 = "    fly me    to the moon    ";                     // Ожидаемый вывод: 4
        System.out.println("\nПрактическое задание №4.");
        System.out.println(lengthOfLastWord( input1));
        System.out.println(lengthOfLastWord(input2));

        // Практическое задание №5. Является ли строка полиндромом.
        System.out.println("\nПрактическое задание №5.");

        String stringOne =  "abc";     //false
        String stringTwo = "112233";   //false
        String stringThree = "aba";    //true
        String stringFour =  "112211"; //true
        System.out.println(isPalindrome(stringOne));
        System.out.println(isPalindrome(stringTwo));
        System.out.println(isPalindrome(stringThree));
        System.out.println(isPalindrome(stringFour));
    }

        // Практическое задание №1.
          String string = "I love Java";
        public static void turnString(String string) { // Использование класса StringBuilder и метода reverse();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string).reverse();
            System.out.println("Практическое задание №1. \n" + stringBuilder + " \n");
        }

        // Практическое задание №2.
        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};

        public static void getDistinctNumbers(int[] ints) {
            int[] resultArray = new int[ints.length];
            int count = 0;
            for (int result : ints) {
                boolean isDuplicate = false;
                for (int j = 0; j < count; j++) {
                    if (result == resultArray[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    resultArray[count] = result;
                    count++;
                }
            }
            System.out.print("Практическое задание №2. \n");
            for (int i = 0; i < count; i++) {
               System.out.print(resultArray[i] + " ");
           }
            System.out.println("\n");
        }

         // Практическое задание №3.
        public static Integer findSecondMaxElement(int[] arr) {
            int firstMaxValue = Integer.MIN_VALUE;                                 // Первое максимальное значение
            int secondMaxValue = Integer.MIN_VALUE;                                // Второе максимальное значение

            for (int element : arr) {
                if (element > firstMaxValue) {
                    secondMaxValue = firstMaxValue;
                    firstMaxValue = element;
                } else if (element > secondMaxValue && element < firstMaxValue) {
                    secondMaxValue = element;
                }
            }
            return secondMaxValue;
        }

          // Практическое задание №4.
        public static Integer lengthOfLastWord(String string) {
            string = string.trim();
            int lastSpaceIndex = string.lastIndexOf(' ');
            if (lastSpaceIndex == -1) {
                return string.length();
            }
            return string.length() - lastSpaceIndex - 1;
        }

         // Практическое задание №5.
        public static boolean isPalindrome(String string) {
            int length = string.length();
            for (int i = 0; i < length / 2; i++) {
                if (string.charAt(i) != string.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
