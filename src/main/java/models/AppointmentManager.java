package models;

import services.DateTimeHelper;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentManager {
    private List<Appointment> appointments;

    public AppointmentManager() {
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        if (!isAppointmentOverlap(appointment)) {
            this.appointments.add(appointment);
            System.out.println("Appointment added: ");
        } else {
            System.out.println("Appointment overlaps: ");
        }
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }

    public List<Appointment> getAppointmentsBetween(LocalDateTime start, LocalDateTime end) {
        List<Appointment> result = new ArrayList<>();
        for (Appointment appointment : this.appointments) {
            if (appointment.getDateTime().isAfter(start) && appointment.getDateTime().isBefore(end)) {
                result.add(appointment);
            }
        }
        return result;
    }

    public boolean isAppointmentOverlap(Appointment newAppointment) {
        for (Appointment oldAppointment : this.appointments) {
            if (
                    DateTimeHelper.isBetweenTime(newAppointment.getDateTime(), oldAppointment.getDateTime(), oldAppointment.getEndTime()) ||
                    DateTimeHelper.isBetweenTime(newAppointment.getEndTime(), oldAppointment.getDateTime(), oldAppointment.getEndTime())
            ) {
                return true;
            }
        }
        return false;
    }
}
