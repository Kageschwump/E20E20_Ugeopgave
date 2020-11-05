package Models;

public class Event {
    private Artist artist;
    private Room room;
    private int tickets;

    public Artist getArtist() {
        return artist;
    }


    public Room getRoom() {
        return room;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public Event(Artist artist, Room room, int tickets) {
        this.artist = artist;
        this.room = room;
        this.tickets = tickets;
    }
}
