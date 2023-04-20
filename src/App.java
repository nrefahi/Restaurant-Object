import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Restaurant rest1 = new Restaurant("Outback", "Addison", true, 5);
        Restaurant rest2 = new Restaurant("Fridays", "Richardson", true, 4);
        Restaurant rest3 = new Restaurant("Applebees", "Coppell", true, 3);
        Restaurant rest4 = new Restaurant("Panera", "Frisco", true, 2);
        
        ArrayList<Restaurant> list = new ArrayList<Restaurant>();
        list.add(rest4);
        list.add(rest3);
        list.add(rest2);
        list.add(rest1);
        
        for(Restaurant item : list) {
        System.out.println(item.storeCity);
        }

        
    }
}
