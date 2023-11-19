package model;
import java.time.LocalTime;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DailySchedule {
    private LocalTime entryTime;
    private LocalTime exitTime;
    private Duration restTime;
    private Duration calculatedWorkHours;


    DailySchedule(LocalTime entryTime, LocalTime exitTime, Duration restTime){
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.restTime = restTime;
        recalculateWorkHours();

    }

    public LocalTime getEntryTime(){
        return entryTime;
    }

    public LocalTime getExitTime(){
        return  exitTime;
    }

    public  Duration getRestTime(){
        return restTime;
    }

    public void setEntryTime(LocalTime entryTime){
        this.entryTime = entryTime;
        recalculateWorkHours();
    }

    public void setExitTime(LocalTime exitTime){
        this.exitTime = exitTime;
        recalculateWorkHours();
    }

    public void setRestTime(Duration restTime){
        this.restTime = restTime;
        recalculateWorkHours();
    }


    public void recalculateWorkHours(){
        long hoursBetween = ChronoUnit.HOURS.between(entryTime, exitTime);
        this.calculatedWorkHours = Duration.ofHours(hoursBetween).minus(restTime);
    }

    public Duration getCalculatedWorkHours(){
        return   calculatedWorkHours;
    }

}
