//double room, shared by two students
public class DRoom extends Room{
    public DRoom(int rno){
        super(rno,2,50000,"Double");
    }

    public String details(){
        return "Double room "+getRno()+" for 2 students, yearly fee Rs."+getFee();
    }
}
