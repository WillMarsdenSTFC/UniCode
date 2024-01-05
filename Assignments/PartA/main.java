package Assignments.PartA;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        // Initialise Scanner for getting console input from the user.
        Scanner reader = new Scanner(System.in);

        // Create song objects from the song class with ID for removing/identifying and Title, Artist and Play Count.
        songClass Song1 = new songClass(0, "Song 1", "Artist 1", 1000);
        songClass Song2 = new songClass(1, "Song 2", "Artist 2", 100000);
        songClass Song3 = new songClass(2, "Song 3", "Artist 3", 100044320);
        songClass Song4 = new songClass(3, "Song 4", "Artist 4", 10212300);
        songClass Song5 = new songClass(4, "Song 5", "Artist 5", 10043200);
        songClass Song6 = new songClass(5, "Song 6", "Artist 6", 1002340);
        songClass Song7 = new songClass(6, "Song 7", "Artist 7", 10431230);
        songClass Song8 = new songClass(7, "Song 8", "Artist 8", 1021200);
        songClass Song9 = new songClass(8, "Song 9", "Artist 9", 10023550);
        songClass Song10 = new songClass(9, "Song 10", "Artist 10", 1000660);

        // Create the library object from the Library Class.
        libraryClass newLibrary = new libraryClass();
        // Add the song objects to the library arrayList through the addSong method.
        newLibrary.addSong(Song1);
        newLibrary.addSong(Song2);
        newLibrary.addSong(Song3);
        newLibrary.addSong(Song4);
        newLibrary.addSong(Song5);
        newLibrary.addSong(Song6);
        newLibrary.addSong(Song7);
        newLibrary.addSong(Song8);
        newLibrary.addSong(Song9);
        newLibrary.addSong(Song10);

        // Print out the entire library's arrayList of song objects using the Library Class' "print" method.
        newLibrary.printAll();

        // Removes the song by finding its ID in the array and then removing the index where the ID was found.
        newLibrary.removeSong(Song5);

        // Prints out the entire new arrayList.
        newLibrary.printAll();

        System.out.println();
        System.out.println();
        System.out.println();

        String count = reader.nextLine();
        newLibrary.searchSongs(Integer.valueOf(count));
    
        reader.close();
    
    }

}
