//base class for all rooms, abstract so only SRoom and DRoom can be created
public abstract class Room{
    private int rno;
    private int capacity;//how many students can stay
    private double fee;//yearly fee
    private String type;

    public Room(int rno,int capacity,double fee,String type){
        this.rno=rno;
        this.capacity=capacity;
        this.fee=fee;
        this.type=type;
    }

    public int getRno(){return rno;}
    public int getCapacity(){return capacity;}
    public double getFee(){return fee;}
    public String getType(){return type;}

    //each room type tells how it should be described
    public abstract String details();

    public String toString(){
        return rno+" | "+type+" | Capacity: "+capacity+" | Fee: Rs."+fee;
    }
}
