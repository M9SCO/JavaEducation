import java.util.Scanner;

import static java.lang.StrictMath.abs;

class Point{
    public double x;
    public double y;
}




class FirstLab {
    private static int get_factorial(int f) {
        int result = 1;

        for (int i = 1; i <= f; i++) {
            result *= i;
        }
        return result;
    }

    private static int four_quest(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += get_factorial(i);
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in_2 = new Scanner(System.in);
        int n = 0;
        double result = 0;
        while (n <= 2) {
            System.out.println("Сколько всего будет введено точек?");
            n = in.nextInt();
        }
        Point[] points = new Point[n];
        System.out.println("Введите через пробел координату точки, разделяйте точки переводом на новую строку");
        for (int i = 0; i < n; i++) {
            boolean valid = false;
            while (!valid) {
                try {
                    String point[] = in_2.nextLine().split(" ");
                    Point this_point = new Point();
                    this_point.x = Double.parseDouble(point[0]);
                    this_point.y = Double.parseDouble(point[1]);
                    points[i] = this_point;
                    valid = true;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("необходимо указать 2 числа через пробел");
                }
            }
        }

        for (int i = 0; i < n; i++) {
            int el = i != n - 1 ? i + 1 : 0;
            System.out.printf("%.0f*%.0f-%.0f*%.0f", points[i].x, points[el].y, points[el].x, points[i].y);
            System.out.println(i);
            result += (points[i].x*points[el].y)-(points[el].x*points[i].y);
            System.out.println(result);
        }
        System.out.println(abs(result/2));

    }
}

