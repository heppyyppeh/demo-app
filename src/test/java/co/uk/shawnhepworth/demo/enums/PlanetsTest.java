package co.uk.shawnhepworth.demo.enums;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class PlanetsTest {

    @Test
    public void shouldGetDistanceInAUForEarth() {

        assertThat(Planets.EARTH.getAstronomicalUnitsFromSun(), equalTo(1.00));
    }

    @Test
    public void shouldGetTimeForLightToReachInSecondsForEarth() {

        assertThat(Planets.EARTH.timeElapsedForLightToReachInSeconds(), equalTo(499.0));
    }


    @Test
    public void shouldGetTimeForLightToReachInSecondsForMars() {

        assertThat(Planets.MARS.timeElapsedForLightToReachInSeconds(), equalTo(760.476));
    }

    @Test
    public void shouldGetNumberOfMoonsForVenus() {

        assertThat(Planets.VENUS.getNumberOfMoons(), equalTo(0));
    }
}