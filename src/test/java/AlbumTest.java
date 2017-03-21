import org.junit.*;
import static org.junit.Assert.*;

public class AlbumTest {

  @Test
  public void Album_createsObjectCorrectly_true() {
    Album newAlbum = new Album("Dark Side of The Moon");
    assertEquals(true, newAlbum instanceof Album);
  } // to pass this test we need to create a CD class, and the Cd method which creates an instance of the CD object.

  @Test
  public void AlbumTitle_addCdAlbumNameToObject_string() {
    Album newAlbum = new Album("Dark Side of The Moon");
    String albumName = "Dark Side of The Moon";
    assertEquals(albumName, newAlbum.albumName("Dark Side of The Moon"));
  }

}
