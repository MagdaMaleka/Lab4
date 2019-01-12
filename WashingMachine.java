public class WashingMachine {
    private int temperature;
    private int spining;

    void modeForeSensitiveClothes(){
        temperature = 30;
        spining = 800;
    }

    void modeForTowelsAndBedLinen(){
        temperature = 90;
        spining = 1200;
    }
}
