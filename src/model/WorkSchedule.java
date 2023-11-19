package model;

import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Map;

public class WorkSchedule {
    private String name;
    private String description;
    private Map<DayOfWeek, DailySchedule> weeklySchedule;
    private Duration totalWeeklyHours;

    public WorkSchedule(String name, String description, Map<DayOfWeek, DailySchedule> weeklySchedule){
        this.name = name;
        this.description = description;
        this.weeklySchedule = weeklySchedule;
        recalculateTotalWeeklyHours();

    }

    public Duration getTotalWeeklyHours(){
        return totalWeeklyHours;
    }

    public void updateWeeklySchedule(Map<DayOfWeek, DailySchedule> weeklySchedule){
        this.weeklySchedule = weeklySchedule;
        recalculateTotalWeeklyHours();
    }

    public void recalculateTotalWeeklyHours (){
        totalWeeklyHours = weeklySchedule.values().stream().map(DailySchedule::getCalculatedWorkHours).reduce(Duration.ZERO, Duration::plus);
    }

    public Duration getWorkHoursForDay (DayOfWeek day){
        DailySchedule schedule = weeklySchedule.get(day);
        return schedule != null ? schedule.getCalculatedWorkHours(): Duration.ZERO;
    }

}
