import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Excel Columns");
        ArrayList<String> data = new ArrayList<>();
        // (n) Numero de columnas.
        int c = 26;
        for (int i = 65; i < 65 + c; i++) {
            char temp = (char) i;
            String item = String.valueOf(temp);
            data.add(item);
        }
    }
}
