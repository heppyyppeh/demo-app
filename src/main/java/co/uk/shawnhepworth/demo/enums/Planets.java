package co.uk.shawnhepworth.demo.enums;

public enum Planets {

    EARTH(1.00, 1), VENUS(0.723, 0), MARS(1.524, 2);

    private double astronomicalUnitsFromSun;
    private long numberOfMoons;

    Planets(double astronomicalUnitsFromSun, long numberOfMoons) {
        this.astronomicalUnitsFromSun = astronomicalUnitsFromSun;
        this.numberOfMoons = numberOfMoons;
    }

    public double timeElapsedForLightToReachInSeconds() {
        double LIGHT_SPEED_TO_TRAVEL_1_AU_SECONDS = 499.0;
        return this.astronomicalUnitsFromSun * LIGHT_SPEED_TO_TRAVEL_1_AU_SECONDS;
    }

    public double getAstronomicalUnitsFromSun() {
        return astronomicalUnitsFromSun;
    }

    public long getNumberOfMoons() {
        return numberOfMoons;
    }

}
