import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Excel Columns");
        StringBuilder toWrite = new StringBuilder();
        System.out.print("Number of columns: ");
        Scanner scanner = new Scanner(System.in);
        int columns = scanner.nextInt();
        columns++;
        for (int i = 1; i < columns; i++) {
            int j = i;
            StringBuilder temp = new StringBuilder();
            while (j > 0)
            {
                int k = (j - 1) % 26;
                int l = 65 + k;
                temp.insert(0, (char) l);
                j = (j - k) / 26;
            }
            toWrite.append(temp.toString());
            if(i != columns - 1){
                toWrite.append(";");
            }
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("columns.csv"));
            writer.write("sep=;\r\n");
            writer.write(toWrite.toString());
            writer.write("\r\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
