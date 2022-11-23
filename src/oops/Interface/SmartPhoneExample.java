package oops.Interface;

class Phone{
    public void call(){
        System.out.println("Phone Call");
    }
    public void sms(){
        System.out.println("Phone sending sms");
    }
}

interface ICamera{
    void click();
    void recordVideo();
}

interface IMusicPlayer{
    void play();
    void pause();
}
class SmartPhone extends Phone implements IMusicPlayer,ICamera{
    @Override
    public void click() {
        System.out.println("SmartPhone can click photos.");
    }

    @Override
    public void recordVideo() {
        System.out.println("SmartPhone can record videos.");
    }

    @Override
    public void play() {
        System.out.println("SmartPhone can play music.");
    }

    @Override
    public void pause() {
        System.out.println("SmartPhone can pause music.");
    }
}
public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone sp=new SmartPhone();
        sp.call();
        sp.sms();
        sp.click();
        sp.recordVideo();
        sp.play();
        sp.pause();

        System.out.println();
        Phone p=new SmartPhone();
        p.call();
        p.sms();

        System.out.println();


    }
}
