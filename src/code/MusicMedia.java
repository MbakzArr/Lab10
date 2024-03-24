/**
 * Music media class for a musical media item.
 *
 * Arguments:
 * - artist, the musical artist
 * - title of the song
 * - trackCount, the total number of tracks
 * - totalMinutes, the total runtime of the media in minutes
 * - year of release
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class MusicMedia 
{
    private String artist;
    private final String title;
    private int trackCount;
    private int totalMinutes;
    private final int year;

    MusicMedia(String artist, String title, int trackCount, int totalMinutes, int year) 
    {
        if (artist == null || title == null || artist.isEmpty() || title.isEmpty() || trackCount <= 0 || totalMinutes <= 0 || year <= 0) 
        {
            throw new IllegalArgumentException("Invalid MusicMedia");
        }
        this.artist = artist;
        this.title = title;
        this.trackCount = trackCount;
        this.totalMinutes = totalMinutes;
        this.year = year;
    }

    String getArtist() 
    {
        return artist;
    }

    String getTitle() 
    {
        return title;
    }

    int getTrackCount() 
    {
        return trackCount;
    }

    int getTotalMinutes() 
    {
        return totalMinutes;
    }

    int getYear() 
    {
        return year;
    }

    @Override
    public String toString() 
    {
        return "Album [Artist=" + artist + ", title=" + title + ", trackCount=" + trackCount + ", totalMinutes=" + totalMinutes + "]";
    }

    public void playSelection() 
    {
        System.out.println("Thank you for using our Music Library.");
    }
}