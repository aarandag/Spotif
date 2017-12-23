package Domain;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDomain {

    private ArrayList<Song> songs_album1;
    private Album album1;
    private User user1;
    private User user2;
    
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
	user1= new User(1,"alumno");
	user2 = new User(2,"password");
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
    	testSong.setGenre("Flamenco");
    	testSong.setDescription(testSong.getTitle() + " with a cost of "+ testSong.getPrice()+ " its the most important song of the "+ testSong.getGenre() + " genre");
    	album1.addSong(testSong);
    	album1.deleteSong(testSong);   	
    }
    
    @Test
    public void testModifyAlbumInformation(){
    	album1.setAuthor("Pink Floyd ft Bob Marley");
    	String title= album1.getTitle();
    	title = title + "v2";
    	album1.setTitle(title);
	assertEquals(album1.getTitle(), title);
    	album1.setDescription("This is the first album of Pink Floy and Bob Marley");
    	album1.setPrice(8);
    	
    }
    
    @Test
    public void testUserinformation() {
    	user1.setName("Donald Trump");
    	user2.setName("Pepe");
    	user2.setListsOfSongs(album1.getSongs());
    	user1.sendMessage(user2, (user2.getName()+" with id: "+user2.getId()+ ", You are fired!"));
    	user1.setPassword("New Password");
    	assertFalse(user1==user2);
    }

    @Test
    public void testCreationOfSongs() {
    	Song song1 = new Song("1", "2", 3);
    	Song song2= new Song("1", "2", album1, 3);
    	song1.setAlbum(album1);
	//we create 2 songs with the same values but different constructor and they are not the same.
    	assertFalse(song1==song2);
    	
    }

}
