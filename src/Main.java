import forme.Figure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int x = 0;
        int y = 8;
        x++;
        y++;
        int z = x + y;
        String str = "Bonjour ta mère";

        List<String> listot_tl_mo = new ArrayList<>();

        listot_tl_mo.add(str);

        Figure figure = new Figure(2,3,4);

        figure.getY();


        System.out.println("Hello Word");
        System.out.println(figure);
    }
}
