import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // Читання файлу за допомогою об'єкта FileReader
        FileReader fr = new FileReader("file.txt");
        Scanner sc = new Scanner(fr);

        // Читання кожного рядка з файлу та відображення його
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.print("Введений рядок: " + line);

            System.out.println("\nРядок складається з:");
            // StringTokenizer для аналізу рядка на слова
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                try {
                    // Розібрати слово як число
                    float number = Float.parseFloat(word);
                    System.out.println(word + " - це число = " + number);
                } catch (NumberFormatException e) {
                    // Якщо слово не є числом, просто відображає його як рядок
                    System.out.println(word + " - це рядок");
                }
            }
        }

        fr.close();
    }
}
