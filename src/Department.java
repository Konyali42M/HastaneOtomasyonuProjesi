public class Department {
    private String id;
    private String name;
    private Room[] rooms;

    public Department(String id, String name) {
        this.id = id;
        this.name = name;
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

    public Room[] getRooms() {
        return rooms;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addRoom (Room r) {

    }

    public void listRooms() {

    }
}
