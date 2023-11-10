package Assignments.PartA;

import java.util.ArrayList;

public class libraryClass {
    private ArrayList<songClass> Library = new ArrayList<songClass>();

    public void addSong(songClass Song) {
        Library.add(Song);
    }

    public void removeSong(songClass Song) {
        Library.remove(findSongIndex(Song));
    }
    
    public int findSongIndex(songClass Song) {
        for (int i = 0; i < Library.size(); i++) {
            if(Library.get(i).getID() == Song.getID()) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public void print() {
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
