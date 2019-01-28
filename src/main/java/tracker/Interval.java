package tracker;

public class Interval {

    private final long id;
    private final int startHour;
    private final int startMin;
    private final int endHour;
    private final int endMin;

    public Interval(long id, int startHour, int startMin, int endHour, int endMin) {
        this.id = id;
        this.startHour = startHour;
        this.startMin = startMin;
        this.endHour = endHour;
        this.endMin = endMin;
    }

    public long getId() {
        return id;
    }

    public int getStartHour() {
        return startHour;
    }

    public int getStartMin() {
        return startMin;
    }
    
    public int getEndHour() {
        return endHour;
    }
    
    public int getEndMin() {
        return endMin;
    }

}
