import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class SpotifyCharts {
	public static void main(String[] args) throws FileNotFoundException {
		parseTextFile();

	}
/*
 * 
 * 
 * 		
@throws FileNotFoundException *************************************************************
 * 
 * 
 */
	public static void parseTextFile() throws FileNotFoundException {


			HashMap<String, Integer> hashMap = new HashMap<>();
			String line;
			String[] lineArray = new String[5];
			// Load in file
			Scanner in = new Scanner(new File("SpotifyChart.txt"));

			// Scan file line by line
			while (in.hasNextLine()) {
				// Get first line
				line = in.nextLine();
				// Split by commas
				lineArray = line.split(",");
				for (int i = 0; i < 5; i++) {
					checkIfNew(lineArray[2], hashMap);
					// Increment the Hash Map
					hashMap.put(lineArray[2], hashMap.get(lineArray[2]) + 1);
				}
				//Create a file to write the HashMap
				PrintWriter pw = new PrintWriter(new File("Output.txt"));
				//Go through the hash map
				for (String name : hashMap.keySet()) {
					Integer value = hashMap.get(name);
					System.out.println("Name: " + name + " \n" + "Times On Board: " + value + "\n");
					pw.println("Name: " + name + " \n" + "Times On Board: " + value + "\n");
					pw.flush();

				}
			}

			in.close();
	}

	// Checks if the value was in the hashMap already, if not assign a value of zero
	private static void checkIfNew(String artistName, HashMap<String, Integer> hashMap) {
		Integer count = hashMap.get(artistName);

		if (count == null) {
			hashMap.put(artistName, 0);
		}
	}

	public static void printArray(String[] lineArray) {
		System.out.println(
				lineArray[0] + " " + lineArray[1] + " " + lineArray[2] + " " + lineArray[3] + " " + lineArray[4]);

	}
	public static void whoIsTopStreamedArtist(HashMap<String, Integer> hashMap){
		//TODO HINT: Use the same for loop we used before and just keep track of who's got
		// the highest count
		
		
	}
	public static void sortArtistsAlphabetically() {
		//TODO U got dis
	}
}