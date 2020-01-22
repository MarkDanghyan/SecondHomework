package homeWork2.firstExcercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class House {
    private ArrayList<Door> doors;
    private ArrayList<Window> windows;
    private boolean isLocked;

    public House() {
    }

    public House(Door[] doors, Window[] windows) {
        this.doors = new ArrayList<Door>(Arrays.asList(doors));
        this.windows = new ArrayList<Window>(Arrays.asList(windows));
    }
    public House(Door[] doors, Window[] windows, boolean isLocked) {
        this.doors = new ArrayList<Door>(Arrays.asList(doors));
        this.windows = new ArrayList<Window>(Arrays.asList(windows));
        this.isLocked = isLocked;
    }

    public ArrayList<Door> getDoors() {
        ArrayList<Door> doors = new ArrayList<Door>();
        int n = this.doors.size();
        for(int i = 0; i < n; i++){
            doors.add(new Door());
        }
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = new ArrayList<Door>(Arrays.asList(doors));
    }

    public ArrayList<Window> getWindows() {
        ArrayList<Window> doors = new ArrayList<Window>();
        int n = this.windows.size();
        for(int i = 0; i < n; i++){
            doors.add(new Window());
        }
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = new ArrayList<Window>(Arrays.asList(windows));
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Override
    public String toString() {
        return "House{" +
                "doors=" + doors.size() +
                ", windows=" + windows.size() +
                ", isLocked=" + isLocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House)) return false;
        House house = (House) o;
        return isLocked == house.isLocked &&
                Objects.equals(doors, house.doors) &&
                Objects.equals(windows, house.windows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doors, windows, isLocked);
    }

    public void lockHouseByKey(){
        if (isLocked)
            System.out.println("Door is locked");
        else {
            System.out.println("You've Locked the Houes");
            isLocked = true;
        }
    }
    public void printQuantityOfDoors(){
        System.out.println("There are " + doors.size() + " doors in your house");
    }
    public void printQuantityOfWindows(){
        System.out.println("There are " + windows.size() + " windows in your house");
    }

}
