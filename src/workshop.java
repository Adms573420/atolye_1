import java.lang.reflect.Array;
import java.util.*;

public class workshop {
    public static void main(String args[]) {
      /*  HashMap<Integer,String> myMap=new HashMap<>();

        myMap.put(1,"Maseratti");
        myMap.put(2,"Audi");
        myMap.put(3,"Volvo");
        myMap.put(4,"Mercedes");
        myMap.put(5,"Bmw");
        myMap.put(6,"Opel");
        myMap.put(7,"Ford");

       boolean iki_iceriyor_mu= myMap.containsKey(2);
       boolean sekiz_iceriyor_mu= myMap.containsKey(8);
        System.out.println("iki iceriyor mu:"+iki_iceriyor_mu);
        System.out.println("yedi iceriyor mu:"+sekiz_iceriyor_mu);*/

        HashMap<String, String> oto = new HashMap<>();

        oto.put("ms", "Maseratti");
        oto.put("ad", "Audi");
        oto.put("vl", "Volvo");
        oto.put("mc", "Mercedes");
        oto.put("bw", "Bmw");
        oto.put("op", "Opel");
        oto.put("fr", "Ford");

        //  boolean audi_icereiyor_mu= oto.containsValue("Audi");
        //  System.out.println("audi iceriyor mu:"+audi_icereiyor_mu);
        //  oto.remove("bw");
        // System.out.println(oto);

        // oto.replace("fr","FORD");
        // System.out.println(oto);

        // for (String str: oto.keySet()
        //      ) {
        //     System.out.println(str);

        //
        //  for (String value: oto.values()
        //       ) {
        //      System.out.println(value);
        //       }

        for (Map.Entry mapElement : oto.entrySet()
        ) {System.out.print(mapElement.getKey()+" ");
        System.out.print(mapElement.getValue());

        }

    }


}
