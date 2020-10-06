import java.util.Scanner;
/*
1.1 - Ввести n строк с консоли.
1.2 - Найти самую короткую строку.
1.3 - Вывести эту строку и ее длину.

2.1 - найти фактариал n
2.2 - Вывести это число в консоль
*/

public class FirstLab {
    public static int getFactorial(int f) { // Ф-нция, с 1 обязательным аргументом, числом, у тоторого берется факториал
        int result = 1;
        for (int i = 1; i <= f; i++) {      // цикл с кол-вом итераций, равным поданым аргументом
            result *= i;                    // перемножить результат на шаг итерации
        }
        return result;                      // вернуть получивщееся число
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(
                "Вводите строки\nДля завершения нажмите \"Enter\" на пустой строке.");
        String line = in.nextLine();                                // Запрашивается у пользователя ввод первой строки
        String minLine = line;                                      // И она же объявляется изначально самой короткой
        int rows_count = 0;                                         // Объявляется количество введенных строк
        while (!line.isEmpty()) {                                   // Цикл, пока не будет принята пустая страка
            if (minLine.length() > line.length()) minLine = line;   //      Если новая введенная строка короче ранее
                                                                    //        найденной короткой строки ...
            line = in.nextLine();                                   //              Перезаписывается введенная строчка
            rows_count++;                                           //              Пополняем количество введеных строк
        }

        String result = String.format("Самая короткая строка: \"%s\"\nЕё длина: %d\n\nВведено строк: %d\n%d!=%d",
                                       minLine, minLine.length(), rows_count, rows_count, getFactorial(rows_count));

        System.out.println(result);                                 // Вывод подготовленной строки
    }
}
