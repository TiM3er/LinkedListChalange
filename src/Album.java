import java.util.Iterator;
import java.util.LinkedList;

public class Album {
    private String albumName;

    public Album(String albumName) {
        this.albumName = albumName;
    }

    private LinkedList<Song> songLinkedList = new LinkedList<>();
    public void addSongToAlbum(String nameOfSongAddToAlbum,double durationOfSong)
    {
        this.songLinkedList.add(new Song(nameOfSongAddToAlbum,durationOfSong));
    }
    public boolean isSongInAlbum(String nameOfSong)
    {
        Iterator iterator = songLinkedList.iterator();
        for (Song song : songLinkedList) {

            if( song.getNameOfSong().equals(nameOfSong))
                return true;
        }
        return false;
    }
    public void displayAlbumsSong()
    {
        System.out.println(this.albumName);
        for (Song song : songLinkedList) {
            System.out.println(song.getNameOfSong()+ " "+ song.getDurattionOfSong() );
        }
    }
    public Song getSongFromAlbumToPlaylist(String songName)
    {
        for (Song song : songLinkedList) {
            if (song.getNameOfSong().equals(songName))
            {
                return song;
            }
        }
        return null;
    }
}
