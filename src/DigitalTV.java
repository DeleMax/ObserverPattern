/**
 * Created by DELEMAX on 2/11/2016.
 */
public class DigitalTV extends Observer {

    public DigitalTV(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Your are watching are new tech tv, showing "+ subject.getState());
    }
}
