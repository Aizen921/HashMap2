import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> prodotti = new HashMap<>();
        prodotti.put("Cibo ", " Pizza");
        prodotti.put("Bevande ", " Sprite");
        prodotti.put("Altro ", " Shampoo");
        System.out.println(prodotti);
        Set<String> keys = prodotti.keySet();
        System.out.println(keys);

    }
}
