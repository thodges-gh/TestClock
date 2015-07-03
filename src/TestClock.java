import java.time.LocalTime;

/**
 * Created by Thomas Hodges on 6/30/15.
 * CMIS 141 - Homework 4b
 * This program works with the Clock class in order to take arguments
 * from the command line as mm:hh:ss and determine the amount of time
 * between the two.
 */
public class TestClock {

    public static void runClock(LocalTime startArg, LocalTime stopArg) {
        // Creates a new Clock class named ticker
        Clock ticker = new Clock();
        // Uses the first argument to set the startTime
        ticker.start(startArg);
        // Uses the second argument to set the stopTime
        ticker.stop(stopArg);
        // Displays startTime and stopTime
        System.out.println("java TestClock " +
                ticker.getStartTime() + " " + ticker.getStopTime());
        // Uses getElapsedTime to display the seconds between the two args
        System.out.println("Elapsed time in seconds is: " +
                ticker.getElapsedTime());
    }

    public static void main(String[] args) {
        // Passes arguments to the runClock method above
        runClock(LocalTime.parse(args[0]), LocalTime.parse(args[1]));
    }
}
