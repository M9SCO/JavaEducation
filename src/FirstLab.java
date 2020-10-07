import java.util.Scanner;

public class Main {
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
        System.out.println("Сколько всего будет введено точек?");
        n = in.nextInt();
        while (n<=0){
            System.out.println("Сколько всего будет введено точек?");
            n = in.nextInt();
        }
        double[][] x_y = new double[n][2];
        System.out.println("Введите через пробел координату точки, разделяйте точки переводом на новую строку\n");
        String line = in_2.nextLine();                                // Запрашивается у пользователя ввод первой строки
        for(int i=0;i<n;i++){
            String coords[] = line.split(" ");
            x_y[i][0] = Double.parseDouble(coords[0]);
            x_y[i][1] = Double.parseDouble(coords[1]);
            if (i+1<n) line = in_2.nextLine();
        }
        double result=0;
        for(int i=0;i<n;i++){
            result+= i!=n-1? x_y[i][0]* x_y[i+1][1]: x_y[i][0]* x_y[1][1];
            result-= i!=n-1? x_y[i+1][0]*x_y[i][1]: x_y[1][0]*x_y[i][1];
        }
        System.out.println(result);

}}

