package Assignments.PartA;

public class main {
    
    public static void main(String[] args) {
        songClass Song1 = new songClass(0, "1", "1", 1000);
        songClass Song2 = new songClass(1, "2", "2", 1000000);
        songClass Song3 = new songClass(2, "3", "3", 100044320);
        songClass Song4 = new songClass(3, "4", "4", 100212300);
        songClass Song5 = new songClass(4, "5", "5", 10043200);
        songClass Song6 = new songClass(5, "6", "6", 10002340);
        songClass Song7 = new songClass(6, "7", "7", 1000431230);
        songClass Song8 = new songClass(7, "8", "8", 10021200);
        songClass Song9 = new songClass(8, "9", "9", 100023550);
        songClass Song10 = new songClass(9, "10", "10", 1000660);
    
        libraryClass newLibrary = new libraryClass();
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

        newLibrary.print();

        newLibrary.removeSong(Song5);

        newLibrary.print();
    }

}
