package eventManSys;

public class Stage {
    private String stageName, location;
    private int capacity;
    
    public Stage(String stageName, String location, int capacity) {
        this.stageName = stageName;
        this.location = location;
        this.capacity = capacity;
    }
    
//    Getters and Setters
    public String getStageName() {
        return stageName;
    }
    public String getLocation() {
        return location;
    }
    public int getCapacity() {
        return capacity;
    }
    
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setCapacitty(int capacity) {
        this.capacity = capacity;
    }
}
