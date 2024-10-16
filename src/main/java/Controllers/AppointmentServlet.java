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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@WebServlet(name = "AppointmentServlet", urlPatterns = {"/AppointmentServlet"})
public class AppointmentServlet extends HttpServlet {
    public static final AppointmentManager manager = new AppointmentManager();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String startDateParam = request.getParameter("start_date");
        String endDateParam = request.getParameter("end_date");
        String typeParam = request.getParameter("type");
        List<Appointment> result = new ArrayList<>();

        if (Objects.equals(typeParam, "list")) {
            request.setAttribute("result", manager.getAppointments());
            request.getRequestDispatcher("/AppointmentServlet.jsp").forward(request, response);
            return;
        }

        if (Objects.equals(startDateParam, "") || Objects.equals(endDateParam, "")) {
            request.setAttribute("error", "Please enter all the fields correctly.");
            request.getRequestDispatcher("/AppointmentServlet.jsp").forward(request, response);
            return;
        }

        LocalDateTime startDate = LocalDateTime.parse(startDateParam);
        LocalDateTime endDate = LocalDateTime.parse(endDateParam);
        Duration duration = Duration.between(startDate, endDate);

        if (Objects.equals(typeParam, "sublist")) {
            for (Appointment appointment : manager.getAppointmentsBetween(startDate, endDate)) {
                result.add(appointment);
            }
        }
        if (Objects.equals(typeParam, "add")) {
            manager.addAppointment(new Appointment("", startDate, duration));
            result = manager.getAppointments();
        }

        request.setAttribute("result", result);
        request.getRequestDispatcher("/AppointmentServlet.jsp").forward(request, response);
    }
}
