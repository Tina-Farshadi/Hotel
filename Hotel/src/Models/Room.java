package Models;
public class Room {
    private String number;
    private String counter;
    private String cost;
    public boolean IsReserved;
    public Room(String number,String counter,String cost){
        this.number=number;
        this.counter=counter;
        this.cost=cost;
    }

    public String getCost() {
        return cost;
    }

    public String getCounter() {
        return counter;
    }

    public String getNumber() {
        return number;
    }

    public boolean isReserved() {
        return IsReserved;
    }

    public void setReserved(boolean reserved) {
        IsReserved = reserved;
    }
}
