package models;

import java.time.Duration;
import java.time.LocalDateTime;

public class Appointment {
    private int id;
    private String title;
    private LocalDateTime dateTime;
    private Duration duration;
    private static int count = 1;

    public Appointment(String title, LocalDateTime dateTime, Duration duration) {
        this.id = count++;
        this.title = title;
        this.dateTime = dateTime;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public LocalDateTime getEndTime() {
        return dateTime.plus(duration);
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dateTime=" + dateTime +
                ", duration=" + duration +
                '}';
    }
}
