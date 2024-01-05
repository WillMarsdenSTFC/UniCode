package Assignments.PartA;


import java.util.ArrayList;

public class libraryClass {

    // Initialise the "Library" arrayList that takes Song Objects from the Song Class.
    private ArrayList<songClass> Library = new ArrayList<songClass>();

    // Adds the "Song" Object to the Library arrayList.
    public void addSong(songClass Song) {
        Library.add(Song);
    }

    public void searchSongs(int PlayCount) {
        for (songClass s: Library) {
            if(s.getCount() >= PlayCount ) {
                System.out.println(s.getTitle());
                System.out.println(s.getArtist());
                System.out.println(s.getCount());
                System.out.println();
            }
        }
    }

    // Removes the index of the result of the findSongIndex method from the Library arrayList.
    public void removeSong(songClass Song) {
        Library.remove(findSongIndex(Song));
    }
    
    // A for loop going through the Library ArrayList, if the current song object's ID matches the target ID, it returns the index of the Song.
    public int findSongIndex(songClass Song) {
        for (int i = 0; i < Library.size(); i++) {
            if(Library.get(i).getID() == Song.getID()) {
                return i;
            }
        }
        return -1;
    }

    // A for each loop through the ArrayList and prints the different attributes of the Song Object.
    public void printAll() {
        for (songClass s : Library) {
            System.out.println("Song Title: ");
            System.out.print(s.getTitle());
            System.out.println();
            System.out.println("Artist Name: ");
            System.out.print(s.getArtist());
            System.out.println();
            System.out.println("Play Count: ");
            System.out.print(s.getCount());
            System.out.println();
            System.out.println();
        }
    }
}
