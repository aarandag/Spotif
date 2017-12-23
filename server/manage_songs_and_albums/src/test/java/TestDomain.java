package Domain;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDomain {

    private ArrayList<Song> songs_album1;
    private Album album1;
    
    @Before
    public void setUp() {
	songs_album1 = new ArrayList<Song>();
	songs_album1.add(new Song("Time", "Unknown Artist", 4.99));
	songs_album1.add(new Song("Money", "Unknown Artist", 9.99));
	album1 = new Album("Dark Side of the Moon",
			   "Pink Floyd",
			   19.99,
			   songs_album1);
	album1.updateSongs();
    }

    @Test
    public void testAuthorConsistency1() {
        String author = album1.getAuthor();
	for(int i = 0; i < album1.getSongs().size(); i++) {
	    assertEquals(author, album1.getSongs().get(i).getAuthor());
	}
    }

    @Test
    public void testAlbumConsistency1() {
	for(int i = 0; i < album1.getSongs().size(); i++) {
	    assertEquals(album1, album1.getSongs().get(i).getAlbum());
	}
    }

    @Test
    public void testPriceConsistency1() {
	int price = 0;
	for(int i = 0; i < album1.getSongs().size(); i++) {
	    price += album1.getSongs().get(i).getPrice();
	}
	assertTrue(price <= album1.getPrice());
    }
	@Test
    public void testAlbumAddOneSong(){
    	Song testSong = new Song("Hello", "ArtistOfHello", 0.99);
    	album1.addSong(testSong);
    	album1.deleteSong(testSong);   	
    }
    
    @Test
    public void testModifyAlbumInformation(){
    	album1.setAuthor("Pink Floyd ft Bob Marley");
    	String title= album1.getTitle();
    	title = title + "v2";
    	album1.setTitle(title);
    	album1.setDescription("This is the first album of Pink Floy and Bob Marley");
    	
    }
	
}
