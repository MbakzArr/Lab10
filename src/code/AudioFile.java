/**
 * Audio file class to extend Music media class to execute an audio file in the music library.
 *
 * Argumentrs:
 * - fileType: the type of audio file (mp3, m4a, wav)
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class AudioFile extends MusicMedia 
{
    private final String fileType;

    AudioFile(String artist, String title, int trackCount, int totalMinutes, int year, String fileType) 
    {
        super(artist, title, trackCount, totalMinutes, year);
        if (!fileType.equals("mp3") && !fileType.equals("m4a") && !fileType.equals("wav")) 
        {
            throw new IllegalArgumentException("Invalid file type");
        }
        this.fileType = fileType;
    }

    @Override
    public String toString() 
    {
        return "AudioFile [fileType=" + fileType + ", " + super.toString() + "]";
    }

    @Override
    public void playSelection() 
    {
        super.playSelection();
        System.out.println("You selected the Audio File " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This file is in " + fileType + " format, from the year " + getYear() + ".");
    }
}