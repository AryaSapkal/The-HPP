public class Room {
    private String room_id;
    private int capacity;


    Room(String room_id, int capacity) {
        this.room_id = room_id;
        this.capacity = capacity;
    }


    public String displayRoom() {
        return "Room ID: " + room_id + "\t\t\tCapacity: " + capacity;
    }


    // Getters and setters
    public String getRoom_id() {
        return room_id;
    }


    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }


    public int getCapacity() {
        return capacity;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

