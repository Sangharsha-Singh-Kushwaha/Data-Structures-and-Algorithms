package Map;
import java.util.*;
public class PrintAllAnagramsTogether {
	
	private static Collection<List<String>> printAnagrams(String arr[]) 
    { 
        HashMap<String, List<String> > map = new HashMap<>(); 
  
        // loop over all words 
        for (int i = 0; i < arr.length; i++) { 
  
            // convert to char array, sort and 
            // then re-convert to string 
            String word = arr[i]; 
            char[] letters = word.toCharArray(); 
            Arrays.sort(letters); 
            String sortedWord = new String(letters); 
            
            if(!map.containsKey(sortedWord)) {
            	map.put(sortedWord, new LinkedList<String>());
            }
            
            map.get(sortedWord).add(word);
        }
        
        for (String s : map.keySet()) { 
            List<String> values = map.get(s); 
            if (values.size() > 1) { 
                System.out.print(values); 
            } 
        }
		return null; 
    }

	public static void main(String[] args) {
		
		 String arr[] = { "cat", "dog", "tac", "god", "act" }; 
	        printAnagrams(arr); 
	
	}

}
