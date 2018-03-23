public class Song
{
    private String nameOfSong;
    private double durattionOfSong;

    public Song(String nameOfSong, double durattionOfSong) {
        this.nameOfSong = nameOfSong;
        this.durattionOfSong = durattionOfSong;
    }

    public String getNameOfSong() {
        return nameOfSong;
    }

    public double getDurattionOfSong() {
        return durattionOfSong;
    }
}
