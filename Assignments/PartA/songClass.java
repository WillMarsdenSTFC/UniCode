package Assignments.PartA;


public class songClass {
    private String Song_Title;
    private String Artist_Name;
    private int Play_Count;
    private int ID;

    public songClass(int Id,String Title, String Artist, int Count) {
        Song_Title = Title;
        Artist_Name = Artist;
        Play_Count = Count;
        ID = Id;
    }

    public void setTitle(String newTitle) {
        Song_Title = newTitle;
    }
    
    public void setArtist(String newArtist) {
        Artist_Name = newArtist;
    }

    public void setCount(int newCount) {
        Play_Count = newCount;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return Song_Title;
    }

    public String getArtist() {
        return Artist_Name;
    }

    public int getCount() {
        return Play_Count;
    }
    
    
}
