import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String holidayDate = "25/12/2023";
        String nonHolidayDate = "15/02/2023";

        Calendar calendar = new Calendar();
        calendar.findHoliday(holidayDate);
        calendar.findHoliday(nonHolidayDate);

        Calendar.getAllHolidays();
    }
}
