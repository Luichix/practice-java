package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Lists {

    ArrayList<String> myList = new ArrayList<>();
    char[] mySimpleArray = {
      'A', 'B', 'C'
    };

    HashMap<String, String> map = new HashMap<>();

    public void elements(){
        myList.add("Father");
        myList.add("Mother");
        myList.add("Brother");
        myList.add("Sister");

        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);
        System.out.println(mySimpleArray );

        // add key and values in HashMap
        map.put("Nicaragua", "Managua");
        map.put("Costa Rica", "San Jose");
        map.put("Panama", "Ciudad de Panama");
        map.put("El Salvador", "San Salvador");
        map.put("Honduras", "Tegucigalpa");
        map.put("Guatemala", "Ciudad de Guatemala");

        System.out.println(map);


    }

}
