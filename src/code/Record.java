/**
 * Record class that extends Music media class
 * 
 * Arguments:
 * - size of the record in inches
 * - rpm: revolutions per minute of the record
 * 
 * @author Khuliso Junior Ravhuravhu and Arehone Brenden Mbadaliga
 * 
 * @version 1.0
 */

class Record extends MusicMedia 
{
    private final int size;
    private double rpm;

    Record(String artist, String title, int trackCount, int totalMinutes, int year, int size, double rpm) 
    {
        super(artist, title, trackCount, totalMinutes, year);
        if (size != 7 && size != 10 && size != 12) 
        {
            throw new IllegalArgumentException("Invalid record size");
        }
        if (rpm != 33.3 && rpm != 45.0 && rpm != 78.0) 
        {
            throw new IllegalArgumentException("Invalid rpm");
        }
        this.size = size;
        this.rpm = rpm;
    }

    @Override
    public String toString() 
    {
        return "Record [size=" + size + ", rpm=" + rpm + ", " + super.toString() + "]";
    }

    @Override
    public void playSelection() 
    {
        super.playSelection();
        System.out.println("You selected the record " + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a " + size + " inch record from " + getYear() + ", playing at " + rpm + " rpm.");
    }
}