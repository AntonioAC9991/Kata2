package kata2;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] data = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for (Integer key : histogr.keySet()) {
            System.out.println(key + "==>" + histogr.get(key));            
        }
    }
    
    /**
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
        
        hashMap.put(3,4);
        hashMap.put(2,4);
        hashMap.put(4,4);
        hashMap.put(5,8);
        
         /**
        //Método 1
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("La clave " + entry.getKey() + " y el valor asociado es " + entry.getValue());
        }        
        
        //Método 2
        for (Integer integer : hashMap.keySet()) {
            System.out.println("Hay una clave " + integer);
        }
  
        for (Integer value : hashMap.values()) {
            System.out.println("Hay un valor " + value);
            
        }
        */
        ////////////////////////////////////////////////////////// 
        /**
        //Método 3a
        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<Integer, Integer> next =  iterator.next();
            System.out.println("La clave " + next.getKey() + " corresponde al valor" + next.getValue());
        }
        
        //Método 3b
        Iterator<Map.Entry<Integer, Integer>> iterator2 = hashMap.entrySet().iterator();
        while(iterator.hasNext()) {
            Integer key = (Integer)iterator2.next().getKey();
            Integer value = (Integer)iterator2.next().getValue();
        }
        
        ///////////////ESTE ES EL PEOR MÉTODO/////////////////////////////////////////////
        //Método 4
        for (Integer clave : hashMap.keySet()) {
            System.out.println("La clave " + clave + " corresponde al valor " + hashMap.get(clave));
            
        }
        
    } 
    */
}
