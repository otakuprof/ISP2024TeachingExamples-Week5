package Example52;

public class BusFare2024 implements BusFare{

    public final int SHORTFARE = 200;
    public final int MEDIUMFARE = 250;
    public final int LONGFARE = 300;
    @Override
    public int getBusFare(int distance) {
        if ( distance < 25){
            return SHORTFARE;
        }else if( distance < 40){
            return MEDIUMFARE;
        }else{
            return LONGFARE;
        }
    }
}
