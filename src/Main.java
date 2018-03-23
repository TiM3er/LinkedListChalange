public class Main {

    public static void main(String[] args) {
        Album album = new Album("Dookie");
        PlayList playList = new PlayList("Green Day PlayList");
        album.addSongToAlbum("Basket case",3.23);
        album.addSongToAlbum("When I Come Around",3.25);
        album.displayAlbumsSong();
        playList.addSongToList(album.getSongFromAlbumToPlaylist("When I Come Around"));

        playList.displayPlayList();

    }
}
