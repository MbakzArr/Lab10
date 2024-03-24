/**
 * MusicLibrary Class to store music data.
 *
 * Arguments:
 * - library: an ArrayList to store MusicMedia items
 *
 * Methods:
 * - addMedia(): add a media item to the library
 * - displayLibrary(): display all items in the library
 * - playTitle(): play the media with the specified title
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

import java.util.ArrayList;

class MusicLibrary 
{
    private final ArrayList<MusicMedia> library = new ArrayList<>();

    public void addMedia(MusicMedia media) 
    {
        if (media != null) 
        {
            library.add(media);
        }
    }

    public void displayLibrary() 
    {
        for (MusicMedia media : library) 
        {
            System.out.println(media.toString());
        }
    }

    public void playTitle(String title) 
    {
        for (MusicMedia media : library) 
        {
            if (media.getTitle().equals(title)) 
            {
                media.playSelection();
                return;
            }
        }
        System.out.println("\nTitle not found in the library.");
    }
}