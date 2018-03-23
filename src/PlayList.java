import java.util.LinkedList;

public class PlayList {
    private String PlayListName;
    private LinkedList<Song> playListSongLinkedList = new LinkedList<>();

    public PlayList(String playListName) {
        PlayListName = playListName;
    }
    public void  addSongToList(Song song)
    {
        boolean isInAlbum = false;
        if(song!=null)
        {
            for (Song song1 : playListSongLinkedList) {
               if (song.getNameOfSong().equals(song1.getNameOfSong()))
               {
                   isInAlbum=true;
               }
            }
            if(!isInAlbum)
            {
                playListSongLinkedList.add(song);
            }
        }
    }
    public void displayPlayList()
    {
        System.out.println(PlayListName);
        for (Song song : playListSongLinkedList) {
            System.out.println(song.getNameOfSong() + " " + song.getDurattionOfSong());
        }
    }

}
