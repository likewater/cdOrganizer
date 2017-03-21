import org.junit.*;
import static org.junit.Assert.*;

public class AlbumTest {

  @Test
  public void Album_createsObjectCorrectly_true() {
    Album newAlbum = new Album("Dark Side of The Moon", "xyz", "abc");
    assertEquals(true, newAlbum instanceof Album);
  } // to pass this test we need to create a CD class, and the Cd method which creates an instance of the CD object.

  @Test
  public void getTitle_addAlbumNameToObject_string() {
    Album newAlbum = new Album("Dark Side of The Moon", "Abu", "Dew");
    assertEquals("Dark Side of The Moon", newAlbum.getTitle());
  }

  @Test
  public void getArtist_addAlbumArtistToObject_string() {
    Album newAlbum = new Album("One", "Metallica", "Metal");
    assertEquals("Metallica", newAlbum.getArtist());
  }

  @Test
  public void getGenre_addGenreToObject_string() {
    Album newAlbum = new Album("One", "Metallica", "Metal");
    assertEquals("Metal", newAlbum.getGenre());
  }

  @Test
  public void getAllAlbums_doAllAlbumsList_arraylist() {
    List<Object> listOfAlbums = new ArrayList<Object>();
    assertEquals("", listOfAlbums.getAllAlbums)
  }
}
