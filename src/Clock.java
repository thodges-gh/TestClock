import java.time.LocalTime;

/**
 * Created by Thomas Hodges on 6/30/15.
 * CMIS 141 - Homework 4b
 * This class is for the Clock that accepts the
 * class LocalTime as arguments.
 */
public class Clock {

    // Private data fields
    private LocalTime startTime;
    private LocalTime stopTime;

    // No-argument contsructor that sets startTime
    public Clock() {
        this.startTime = LocalTime.now();
    }

    // start() method that sets startTime to args[0]
    public LocalTime start(LocalTime start) {
        return this.startTime = start;
    }

    // stop() method that sets stopTime to args[1]
    public LocalTime stop(LocalTime stop) {
        return this.stopTime = stop;
    }

    // Method that calculates the seconds between args
    public long getElapsedTime() {
        return java.time.Duration.between(
                this.startTime, this.stopTime
        ).getSeconds();
    }

    // Getters

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getStopTime() {
        return stopTime;
    }
}
