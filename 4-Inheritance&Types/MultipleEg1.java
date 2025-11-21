//  Camera    Musicplayer
//      |       |
//      smartphone

interface Camera{
    void camfunction();
}

interface MusicPlayer{
    void mpfuction();
}

class Smartphone implements Camera,MusicPlayer{
    public void camfunction(){
        System.out.println("Smartphone Can take photo");
    }
    public void mpfuction(){
        System.out.println("Can hear Music Using SmartPhone");
    }
}

public class MultipleEg1 {
    public static void main(String[] args) {
        Smartphone SP=new Smartphone();
        SP.camfunction();
        SP.mpfuction();
    }
}
