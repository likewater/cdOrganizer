public class Album {
  private String mTitle;
  private String mArtist;
  private String mGenre;

  public Album(String title, String artist, String genre) {
    mTitle = title;
    mArtist = artist;
    mGenre = genre;
  }

  public String getTitle() {
    return mTitle;

  }

  public String getArtist() {
    return mArtist; //to pass test
  }

  public String getGenre() {
    return mGenre; //code to pass test
  }

}
