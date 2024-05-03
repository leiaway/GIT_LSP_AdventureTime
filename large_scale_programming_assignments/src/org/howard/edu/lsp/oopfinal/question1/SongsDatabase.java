/**
 * Name: Leilani Dexter
 */
package org.howard.edu.lsp.oopfinal.question1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SongsDatabase {
    private Map<String, Set<String>> map = new HashMap<String, Set<String>>();

 /* Add a song title to a genre */
 public void addSong(String genre, String songTitle) {
	 if (!map.containsKey(genre)) { //checks if genre key does not exists in map
         map.put(genre, new HashSet<String>()); //if it doesn't, create one 
     }
     map.get(genre).add(songTitle); //if the genre key exists, add a song title
 }

	/* Return genre, i.e., jazz, given a song title */
 public String getGenreOfSong(String songTitle) {
	 for (Map.Entry<String, Set<String>> entry : map.entrySet()) { //for loop to iterate thru the map
         if (entry.getValue().contains(songTitle)) { // if the songTitle given exist
             return entry.getKey(); //return the genre it's in
         }
     }
	//System.out.println("The song you entered doesn't exist in the database. "); //if the songTitle doesn't exist, notify user
	return null; //and return null
 }

  
 /* Return the Set that contains all songs for a genre */
 public Set<String> getSongs(String genre) {
	 if (map.containsKey(genre)) { //if the genre entered exists,
         return map.get(genre); //return genre
     }
	//System.out.println("The genre you entered doesn't exist in the database. "); //if the genre doesn't exist, notify user
	return null;//and return null
 }
}