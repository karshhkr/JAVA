// Map:-Map ek interface hai jo key-value pair me data store karta hai.
//ek value ko ek unique key ke sath bind kar dete ho.
//Duplicate keys allow nahi hoti, lekin duplicate values allowed hoti hain.

// HashMap: Keys ka order random hota hai (hashing ke hisaab se).
//LisnkedHashMap:  Same as HashMap but insertion order maintain karta hai.
//TreeHashMap: Keys ko sorted order me store karta hai (ascending by default).



import java.util.HashMap;
import java .util.Map;
public class MapCollectionInterface {
    public static void main(String[] args) {
         Map<String, Integer> students = new HashMap<>(); 
     //Map<String, Integer> students = new HashTable<>(); // hapmap and table works same synchronized if multiple threads are working can use map but externally
    
    students.put("karshkr", 56);// key are set and values are list
      students.put("utkarsh", 26);//  put() add the number if we had just replace it
        students.put("kiwi", 66);
    
students.put("utkarsh", 33);// key cant be repeated but get update
// key is set and  value is list
    System.out.println(students.keySet());
    

     for (String key:students.keySet()){
        System.out.println(key+" :"+students.get(key));
     }
        }
}
