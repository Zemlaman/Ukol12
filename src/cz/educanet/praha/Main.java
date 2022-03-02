package cz.educanet.praha;

public class Main {

    public static void main(String[] args) {

        ILanderControls controls = new Controls();

        try {
            final var lander = new LunarLanding(
                    controls,
                    5000,
                    500
            );

            System.out.println("Total amount of fuel: " + lander.land());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
