package Models;

public class Event {
    private String artist;
    private String room;
    private int tickets;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Event(String artist, String room, int tickets) {
        this.artist = artist;
        this.room = room;
        this.tickets = tickets;
    }
}
