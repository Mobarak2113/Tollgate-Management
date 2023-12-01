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
public class Place1 {
     public String GET(String entry , String exit) {
         String EnEx= entry+"-"+exit;
         String ExEn00= exit+"-"+entry;
     
        HashMap hash = new HashMap();
        hash.put("Raipura-Narsingdi",50.0);
hash.put("Raipura-Srinagar",5.0);
hash.put("Raipura-Bashghari",50.0);
hash.put("Raipura-Paratoli",30.0);
hash.put("Raipura-Palash",40.0);
hash.put("Narsingdi-Raipura",50.0);
hash.put("Narsingdi-Srinagar",55.0);
hash.put("Narsingdi-Bashghari",100.0);
hash.put("Narsingdi-Paratoli",80.0);
hash.put("Narsingdi-Palash",90.0);
hash.put("Srinagar-Raipura",5.0);
hash.put("Srinagar-Narsingdi",55.0);
hash.put("Srinagar-Bashghari",45.0);
hash.put("Srinagar-Paratoli",25.0);
hash.put("Srinagar-Palash",30.0);
hash.put("Bashghari-Raipura",50.0);
hash.put("Bashghari-Narsingdi",100.0);
hash.put("Bashghari-Srinagar",40.0);
hash.put("Bashghari-Paratoli",30.0);
hash.put("Bashghari-Palash",20.0);
hash.put("Paratoli-Raipura",30.0);
hash.put("Paratoli-Narsingdi",80.0);
hash.put("Paratoli-Srinagar",20.0);
hash.put("Paratoli-Bashghari",30.0);
hash.put("Paratoli-Palash",10.0);
hash.put("Palash-Raipura",40.0);
hash.put("Palash-Narsingdi",90.0);
hash.put("Palash-Srinagar",30.0);
hash.put("Palash-Bashghari",20.0);
hash.put("Palash-Paratoli",10.0);



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
