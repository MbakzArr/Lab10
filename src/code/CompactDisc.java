/**
 * CompactDisc class for extending music media class to representing it in the music library.
 *
 * Arguments:
 * - bonusTracks: indicates if the CD has bonus tracks
 * - digipac: indicates if the CD has a digipac packaging
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class CompactDisc extends MusicMedia 
{
    private boolean bonusTracks;
    private boolean digipac;

    CompactDisc(String artist, String title, int trackCount, int totalMinutes, int year, boolean bonusTracks, boolean digipac) 
    {
        super(artist, title, trackCount, totalMinutes, year);
        this.bonusTracks = bonusTracks;
        this.digipac = digipac;
    }

    @Override
    public String toString() 
    {
        return "CompactDisc [bonusTracks=" + bonusTracks + ", digipac=" + digipac + ", " + super.toString() + "]";
    }

    @Override
    public void playSelection() 
    {
        super.playSelection();
        System.out.println("You selected the CD " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a Compact Disc from the year " + getYear() + ".");
    }
}