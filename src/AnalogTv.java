/**
 * Created by DELEMAX on 2/11/2016.
 */
public class AnalogTv extends Observer {

    public AnalogTv(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update(){
        System.out.println("Your are watching an old tech tv, showing "+ subject.getState());
    }
}