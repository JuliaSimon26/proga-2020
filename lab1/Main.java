/**
 * ������������ ������ ����� ����
 * 
 * @author ���� ��������
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting project"); // first task
        // second task
        byte v_byte = 12;
        short v_short = 23;
        char v_char = 'a';
        int v_int = 1;
        long v_long = 42222;
        float v_float = 8.5f;
        double v_double = 3000.3211;
        boolean v_boolean = true;

        System.out.println("This is a byte: " + v_byte);
        System.out.println("This is a short: " + v_short);
        System.out.println("This is a char: " + v_char);
        System.out.println("This is a int: " + v_int);
        System.out.println("This is a long: " + v_long);
        System.out.println("This is a float: " + v_float);
        System.out.println("This is a doudle: " + v_double);
        System.out.println("This is a boolean: " + v_boolean);

        v_byte = 120;
        v_short = 129;
        v_char = 'a'; // пропущены ковычки
        v_int = 65999;
        v_long = 4294967296l; // приведение к long_int
        v_float = 0.33333334f; // приведение к float
        v_double = 0.3333333333333333;
        v_boolean = true; // нельзя привести double к boolean
        // third task
        for (int i = 97; i <= 122; i++) {
            System.out.print("'" + (char) (i) + "'");
        }
        System.out.println();
        long begin = new java.util.Date().getTime();
        for (int i = 0; i < 100000000; i++) {
        }
        long end = new java.util.Date().getTime();
        System.out.println(end - begin);

        begin = new java.util.Date().getTime();
        for (long i = 0; i < 100000000; i++) {
        }
        end = new java.util.Date().getTime();
        System.out.println(end - begin);
        // fifth task
        int[] mas = { 12, 43, 12, -65, 778, 123, 32, 76 };
        int max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (max < mas[i])
                max = mas[i];
        }
        System.out.println("Maximum: " + max);
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) { //заполняем и выводим массив
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 10);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.print('\n');
        }

    }
}
