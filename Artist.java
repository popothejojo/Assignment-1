/**
 * 
 */

/**
 * @author Joe
 *
 */
public class Artist {
	private String name;
	private Artist next;
	
	
	//Constructor
	public Artist(String name, Artist nextArtist) {
		this.name = name;
		this.next = nextArtist;
	}
	
	//Getters
	public String getName() {
		return name;
	}
	public Artist getNextArtist() {
		return next;
	}
	//Setters
	public void setName(String name) {
		this.name = name;
	}
	public void setNextArtist(Artist nextArtist) {
		this.next = nextArtist;
	}
	
}
