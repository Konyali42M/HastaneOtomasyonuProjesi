import java.util.ArrayList;

public class Department {
    private String id;
    private String name;
    private ArrayList<Room> rooms;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addRoom (Room r) {
        return rooms.add(r);
    }

    public void listRooms() {
        System.out.println(rooms); // bu method tahmini olarak eklendi gerek olmayabilir.
    }
}
