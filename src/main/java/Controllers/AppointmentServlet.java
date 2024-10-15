package Controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import models.Appointment;
import models.AppointmentManager;
import models.StudentManager;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@WebServlet(name = "AppointmentServlet", urlPatterns = {"/AppointmentServlet"})
public class AppointmentServlet extends HttpServlet {
    public static final AppointmentManager manager = new AppointmentManager();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String startDateParam = request.getParameter("start_date");
        String endDateParam = request.getParameter("end_date");
        String typeParam = request.getParameter("type");

        if (Objects.equals(startDateParam, "") || Objects.equals(endDateParam, "") || Objects.equals(typeParam, "")) {
            out.println("Not be empty!");
        }
        LocalDate today = LocalDate.now();
        LocalDateTime startDate = LocalDateTime.parse(startDateParam);
        LocalDateTime endDate = LocalDateTime.parse(endDateParam);
        Duration duration = Duration.between(startDate, endDate);
        if (Objects.equals(typeParam, "sublist")) {
            for (Appointment appointment : manager.getAppointmentsBetween(startDate, endDate)) {
                out.println(appointment.toString());
            }
            return;
        }
        if (Objects.equals(typeParam, "add")) {
            manager.addAppointment(new Appointment("", startDate, duration));
        }
        for (Appointment appointment : manager.getAppointments()) {
            out.println(appointment.toString());
        }
    }
}
