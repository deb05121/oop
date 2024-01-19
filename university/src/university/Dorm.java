package university;

import java.util.ArrayList;
import java.util.List;

public class Dorm implements Cloneable {
    private String name;
    private final List<Integer> roomList;

    public Dorm() {
        roomList = new ArrayList<>();
        name = "PROTOTYPE";
    }

    public Dorm(List<Integer> rooms) {
        roomList = rooms;
    }

    public void loadRooms() {
        roomList.addAll(List.of(101, 102, 103, 104, 105, 201, 202, 203, 204, 205, 301, 302, 303, 304, 305));
    }

    public List<Integer> getRoomList() {
        return roomList;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        return new Dorm(new ArrayList<>(roomList));
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dorm{" +
                "name='" + name + '\'' +
                ", roomList= " + roomList +
                '}';
    }
}
