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
    private final double rpm;
    private static final int FIRST_RECORD_SIZE = 7;
    private static final int SECOND_RECORD_SIZE = 10;
    private static final int THIRD_RECORD_SIZE = 12;
    private static final double FIRST_RECORD_RPM = 33.3;
    private static final double SECOND_RECORD_RPM = 45.0;
    private static final double THIRD_RECORD_RPM = 78.0;



    Record(final String artist,
           final String title,
           final int trackCount,
           final int totalMinutes,
           final int year,
           final int size,
           final double rpm)
    {
        super(artist, title, trackCount, totalMinutes, year);
        if (size != FIRST_RECORD_SIZE
                && size != SECOND_RECORD_SIZE
                && size != THIRD_RECORD_SIZE)
        {
            throw new IllegalArgumentException("Invalid record size");
        }
        if (rpm != FIRST_RECORD_RPM
                && rpm != SECOND_RECORD_RPM
                && rpm != THIRD_RECORD_RPM)
        {
            throw new IllegalArgumentException("Invalid rpm");
        }
        this.size = size;
        this.rpm = rpm;
    }

    @Override
    public String toString() 
    {
        return "Record [size=" + size
                + ", rpm=" + rpm + ", "
                + super.toString() + "]";
    }

    @Override
    public void playSelection() 
    {
        super.playSelection();
        System.out.println("You selected the record "
                + getTitle() + " by " + getArtist() + ".");
        System.out.println("This is a "
                + size + " inch record from " + getYear()
                + ", playing at " + rpm + " rpm.");
    }
}