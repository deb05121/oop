package university;

import java.util.ArrayList;
import java.util.List;

public class Dorm implements Cloneable {
    private static int prototypeCounter;
    private String name;
    private List<Integer> roomList;

    public Dorm() {  // it is used only for cloning
        roomList = new ArrayList<>();
    }

    public Dorm(List<Integer> rooms) {
        prototypeCounter++;
        name = "PROTOTYPE_".concat(String.valueOf(prototypeCounter));
        roomList = rooms;
    }

    public void loadRooms(List<Integer> roomList) {
        this.roomList = roomList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        Dorm temp = new Dorm();
        temp.roomList = this.roomList;
        return temp;
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
