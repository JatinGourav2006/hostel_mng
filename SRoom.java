//single room, holds one student
public class SRoom extends Room{
    public SRoom(int rno){
        super(rno,1,80000,"Single");
    }

    public String details(){
        return "Single room "+getRno()+" for 1 student, yearly fee Rs."+getFee();
    }
}
