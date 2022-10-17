import java.util.ArrayList;
import java.util.List;

public class AmigosList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);

        // loop over the list

        for (int i =0; i<colors.size();i++)
        {
            System.out.println(colors.get(i));
        }
    }
}
