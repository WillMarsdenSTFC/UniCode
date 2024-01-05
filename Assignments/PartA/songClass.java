package Assignments.PartA;


public class songClass {

    // Initialising the Song's Attributes.
    private String Song_Title;
    private String Artist_Name;
    private int Play_Count;
    private int ID;


    // Set the values of the attributes using the values passed from the constructor method.
    public songClass(int Id,String Title, String Artist, int Count) {
        Song_Title = Title;
        Artist_Name = Artist;
        Play_Count = Count;
        ID = Id;
    }

    // Set new title by overwriting the Song_Title attribute with the argument.
    public void setTitle(String newTitle) {
        Song_Title = newTitle;
    }
    
    // Set new artist by overwriting the Artist_Name attribute with the argument.
    public void setArtist(String newArtist) {
        Artist_Name = newArtist;
    }

    // Set new play count value by overwriting the Play_Count attribute with the argument.
    public void setCount(int newCount) {
        Play_Count = newCount;
    }

    // Retrieve the ID of the Song
    public int getID() {
        return ID;
    }

    // Retrieve the Title of the Song
    public String getTitle() {
        return Song_Title;
    }

    // Retrieve the Artist of the Song
    public String getArtist() {
        return Artist_Name;
    }

    // Retrieve the Play Count of the Song
    public int getCount() {
        return Play_Count;
    }
    
    
}
