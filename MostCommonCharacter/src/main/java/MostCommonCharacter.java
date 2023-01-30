import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
        Character maxCharacter=' ';
    for(int i=0; i<str.length(); i++){
          Character current=str.charAt(i);
          if(map.containsKey(current)){
            map.put(current,map.get(current)+1);
          
           }else  map.put(current,1);{

           }
            
        }return map.get(str.charAt(i),1);
    }
}
   

