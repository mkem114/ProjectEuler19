import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class ProjectEuler19 {
	public static void main(String[] args) {
		new ProjectEuler19();
	}

	//Something broke in Java as it gives off by two
	ProjectEuler19() {
		int count = 0;
		LocalDate dateCount = LocalDate.of(1901, 1, 1);
		LocalDate dateFinal = LocalDate.of(2000, 12, 31);
		while (dateCount.isBefore(dateFinal)) {
			if (dateCount.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
				count++;
			}
			dateCount = dateCount.plusMonths(1);
			System.out.println(dateCount);
		}
		System.out.println(count);
	}
}