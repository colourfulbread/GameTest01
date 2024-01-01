public class Power {
    private static int power=3;
    public static boolean isPowerFull=false;
    public static boolean addPower=false;

    public static void powerUp(){
        if(power==5) isPowerFull=true;
        if(!isPowerFull){
            if(addPower) power++;
            //更换星星
        }
    }
}
