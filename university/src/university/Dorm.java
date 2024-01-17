package university;

import java.util.ArrayList;
import java.util.List;

public class Dorm implements Cloneable{
    private int roomNumber;
    private List<Integer> roomList;
    public Dorm(){
        roomList = new ArrayList<>();
    }
    public Dorm(List<Integer> rooms){
        roomList = rooms;
    }
    public void loadRooms(){
        roomList.addAll(List.of(101, 102, 103, 104, 105, 201, 202, 203, 204, 205, 301, 302, 303, 304, 305));
    }

    public List<Integer> getRoomList() {
        return roomList;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        List<Integer> tempList = new ArrayList<>();
        for (Integer i: roomList) {
            tempList.add(i);
        }
        return new Dorm(tempList);
    }

    @Override
    public String toString() {
        return "Dorm{" +
                "original roomList=" + roomList +
                '}';
    }
}
