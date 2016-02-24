/**
 * Created by DELEMAX on 2/11/2016.
 */
public class DemoClass {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new DigitalTV (subject);
        new AnalogTv (subject);

        subject.setState("AIT");
        subject.setState("NTA");

    }
}
