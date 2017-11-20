import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ProjectEuler19 {
	public static void main(String[] args) {
		new ProjectEuler19();
	}
//Something broke in Java as it gives off by two
	ProjectEuler19() {
		int count = 0;
		Date dCount = new Date(1901, 1, 1);
		LocalDate dateCount = dCount.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		Date dFinal = new Date(2000, 12, 31);
		LocalDate dateFinal = dFinal.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
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
