// MusicApp.java(10)

// Base class song
class Song {
    String title;
    String artist;

    Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void play() {
        System.out.println("Play song: " + title + " by " + artist);
    }
}

// subclass for pop song
class PopSong extends Song {
    PopSong(String title, String artist) {
        super(title, artist); // calls parent constructor with values
    }

    @Override
    void play() {
        System.out.println("Play pop song: " + title + " by " + artist);
    }
}

// subclass for rock song
class RockSong extends Song {
    RockSong(String title, String artist) {
        super(title, artist); // calls parent constructor with values
    }

    @Override
    void play() {
        System.out.println("Play rock song: " + title + " by " + artist);
    }
}

// subclass for jazz song
class JazzSong extends Song {
    JazzSong(String title, String artist) {
        super(title, artist); // calls parent constructor with values
    }

    @Override
    void play() {
        System.out.println("Play jazz song: " + title + " by " + artist);
    }
}

// Main class
public class MusicApp {
    public static void main(String[] args) {
        Song pop = new PopSong("Billie Jean", "Michel jackson");
        Song rock = new RockSong("Stairway to Heaven", "Led Zeppelin");
        Song jazz = new JazzSong("Take Five", "Dave Brubeck");

        pop.play();
        rock.play();
        jazz.play();
    }
}