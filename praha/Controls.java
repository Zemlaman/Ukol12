package cz.educanet.praha;

public class Controls implements ILanderControls {

    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        return altitude / velocity;
    }
}
