import java.util.*; 
  
class VectorDemo { 
    public static void main(String args[]) 
    { 
       
        Vector<String> vector = new Vector<String>(); 
  

        vector.add("Welcome"); 
        vector.add("To"); 
        vector.add("Geeks"); 
        vector.add("4"); 
        vector.add("Geeks"); 
  
       
        System.out.println(vector); 
  
      
        Iterator value = vector.iterator(); 
        while (value.hasNext()) { 
            System.out.println(value.next()); 
        } 
    } 
} 