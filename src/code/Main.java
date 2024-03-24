/**
 * main class to execute all music items and test the music library
 * 
 * Arguments:
 * None
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class Main 
{
    public static void main(String[] args) 
    {
        // Create instances of each subtype
        Record record = new Record("The Beatles", "Hey Jude", 1, 7, 1968, 7, 45.0);
        CompactDisc cd = new CompactDisc("Neil Young & Crazy Horse", "Everybody Knows This Is Nowhere", 4, 40, 1969, false, false);
        AudioFile audioFile = new AudioFile("Donnie Iris and the Cruisers", "Ah Leah!", 1, 4, 1980, "wav");

        // Add them to the library
        MusicLibrary library = new MusicLibrary();
        library.addMedia(record);
        library.addMedia(cd);
        library.addMedia(audioFile);

        // Display the library
        library.displayLibrary();

        // Test playTitle method
        library.playTitle("Hey Jude");
        library.playTitle("Everybody Knows This Is Nowhere");
        library.playTitle("Ah Leah!");
        library.playTitle("Invalid Title");
    }
}
