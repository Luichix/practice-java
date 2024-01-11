package practice;

import java.util.*;

public class Lists {

    ArrayList<String> myList = new ArrayList<>();
    char[] mySimpleArray = {
      'A', 'B', 'C'
    };

    HashMap<String, String> map = new HashMap<>();
    HashSet<Integer> numbers = new HashSet<>();

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

        for (String item: map.keySet() ){
            System.out.println("Key: " + item + " - " + map.get(item));
        }

        numbers.add(2);
        numbers.add(7);
        numbers.add(9);

        for (int i = 0; i < 10; i ++){
            if (numbers.contains(i)){
                System.out.println("We found the value " + i);
            } else {
                System.out.println("We don't find the value " + i);
            }
        }

        // Get an object iterator from the ArrayList with type iterator
        Iterator<String> it = myList.iterator();

        // Print the first item
        System.out.println(it.next());

        // Loop through a Collection
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // Remove items from a Collection

        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(6);
        num.add(9);
        num.add(12);
        num.add(15);
        num.add(20);

        Iterator<Integer> itList = num.iterator();
        while(itList.hasNext()){
            Integer itValue = itList.next();

            if(itValue < 10){
                itList.remove();
            }else{
                System.out.println(itValue + " removed");
            }

        }

        // num.removeIf(itValue -> itValue < 10);

        System.out.println(num);



    }

}
