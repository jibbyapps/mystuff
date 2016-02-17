package R_sender;

/**
 * Created by vitaliiromanchenko on 16.02.16.
 */
import java.io.PrintWriter;
import java.util.Scanner;
public class bulbashka
{



        public static void main(String[] args) {
            // Для считывания воспользуемся классом Scanner
            // Для вывода - классом PrintWriter
            Scanner scanner = new Scanner(System.in);
            PrintWriter printWriter = new PrintWriter(System.out);

            // Считываем размер массива,
            // который необходимо отсортировать
            int size = scanner.nextInt();

            // Создаем массив размера size
            // для хранения чисел
            int[] a = new int[size];

            // Считываем массив
            for (int i = 0; i < size; i++) {
                a[i] = scanner.nextInt();
            }

            // Внешний цикл алгоритма совершает
            // ровно size итераций
            for (int i = 0; i < size; i++) {
                // Массив просматривается с конца до
                // позиции i и "легкие элементы всплывают"
                for (int j = size - 1; j > i; j--) {
                    // Если соседние элементы расположены
                    // в неправильном порядке, то меняем
                    // их местами
                    if (a[j] < a[j - 1]) {
                        int temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                    }
                }
            }

            // Выводим отсортированный массив
            for (int i = 0; i < size; i++) {
                printWriter.print(a[i] + " ");
            }

            // После выполнения программы необходимо закрыть
            // потоки ввода и вывода
            scanner.close();
            printWriter.close();
        }
    }

