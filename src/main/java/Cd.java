public class Cd {
  private String mAlbum =  album;
  private String mArtist = artist;
  private String mGenre = genre;

  Cd newCd = new Cd(String album) {
    mAlbum = album;
    mArtist = artist;
    mGenre = genre;
  }
}
