package cz.educanet.praha;

import java.util.Scanner;

public class Controls implements ILanderControls {
    Scanner sc = new Scanner(System.in);

    @Override
    public int getSecondsOfFuelBurn(int altitude, int velocity) {
        System.out.println(altitude + " and " + velocity);
        return sc.nextInt();
    }
}
