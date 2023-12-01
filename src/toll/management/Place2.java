/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toll.management;

import java.util.HashMap;

/**
 *
 * @author Mobarak
 */
public class Place2 {
     public String GET(String entry , String exit) {
         String EnEx= entry+"-"+exit;
         String ExEn00= exit+"-"+entry;
     
        HashMap hash = new HashMap();
         hash.put("Raipura-Narsingdi",55.0);
hash.put("Raipura-Srinagar",10.0);
hash.put("Raipura-Bashghari",55.0);
hash.put("Raipura-Paratoli",35.0);
hash.put("Raipura-Palash",45.0);
hash.put("Narsingdi-Raipura",55.0);
hash.put("Narsingdi-Srinagar",60.0);
hash.put("Narsingdi-Bashghari",105.0);
hash.put("Narsingdi-Paratoli",85.0);
hash.put("Narsingdi-Palash",95.0);
hash.put("Srinagar-Raipura",10.0);
hash.put("Srinagar-Narsingdi",60.0);
hash.put("Srinagar-Bashghari",50.0);
hash.put("Srinagar-Paratoli",30.0);
hash.put("Srinagar-Palash",35.0);
hash.put("Bashghari-Raipura",55.0);
hash.put("Bashghari-Narsingdi",105.0);
hash.put("Bashghari-Srinagar",45.0);
hash.put("Bashghari-Paratoli",35.0);
hash.put("Bashghari-Palash",25.0);
hash.put("Paratoli-Raipura",35.0);
hash.put("Paratoli-Narsingdi",85.0);
hash.put("Paratoli-Srinagar",25.0);
hash.put("Paratoli-Bashghari",35.0);
hash.put("Paratoli-Palash",15.0);
hash.put("Palash-Raipura",45.0);
hash.put("Palash-Narsingdi",95.0);
hash.put("Palash-Srinagar",35.0);
hash.put("Palash-Bashghari",25.0);
hash.put("Palash-Paratoli",15.0);




        if (hash.containsKey(EnEx)){
            return (hash.get(EnEx).toString());

        }
        else if (hash.containsKey(ExEn00)){
            return (hash.get(ExEn00).toString());

        }
        else{
            return ("NOT BELONG TO THE REQUIREMENT");

}


         
}




}
