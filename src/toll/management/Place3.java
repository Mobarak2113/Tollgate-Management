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
public class Place3 {
     public String GET(String entry , String exit) {
         String EnEx= entry+"-"+exit;
         String ExEn00= exit+"-"+entry;
     
        HashMap hash = new HashMap();
         hash.put("Raipura-Narsingdi",60.0);
hash.put("Raipura-Srinagar",15.0);
hash.put("Raipura-Bashghari",60.0);
hash.put("Raipura-Paratoli",40.0);
hash.put("Raipura-Palash",50.0);
hash.put("Narsingdi-Raipura",60.0);
hash.put("Narsingdi-Srinagar",65.0);
hash.put("Narsingdi-Bashghari",110.0);
hash.put("Narsingdi-Paratoli",90.0);
hash.put("Narsingdi-Palash",100.0);
hash.put("Srinagar-Raipura",15.0);
hash.put("Srinagar-Narsingdi",65.0);
hash.put("Srinagar-Bashghari",55.0);
hash.put("Srinagar-Paratoli",35.0);
hash.put("Srinagar-Palash",40.0);
hash.put("Bashghari-Raipura",60.0);
hash.put("Bashghari-Narsingdi",110.0);
hash.put("Bashghari-Srinagar",50.0);
hash.put("Bashghari-Paratoli",40.0);
hash.put("Bashghari-Palash",30.0);
hash.put("Paratoli-Raipura",40.0);
hash.put("Paratoli-Narsingdi",90.0);
hash.put("Paratoli-Srinagar",30.0);
hash.put("Paratoli-Bashghari",40.0);
hash.put("Paratoli-Palash",20.0);
hash.put("Palash-Raipura",50.0);
hash.put("Palash-Narsingdi",100.0);
hash.put("Palash-Srinagar",40.0);
hash.put("Palash-Bashghari",30.0);
hash.put("Palash-Paratoli",20.0);




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
