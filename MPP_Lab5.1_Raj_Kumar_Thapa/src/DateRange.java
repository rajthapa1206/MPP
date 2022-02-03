import java.time.LocalDate;
import java.util.GregorianCalendar;

public class DateRange {
	private LocalDate startDate;
	private LocalDate endDate;
	
	public DateRange(LocalDate startDate) {
		this.startDate = startDate;
		this.endDate = getLastDayOfMonth(startDate);
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public boolean isInRange(LocalDate date) {
		if ( startDate.isBefore(date) && endDate.isAfter(date)) return true;
		return false;
	}
	
	public String toString() {
		return "\nStartDate: " + startDate +
				"\nEndDate: " + endDate;
	}
	
	public static LocalDate getFirstDayOfMonth(LocalDate date) {
		return LocalDate.of(date.getYear(), date.getMonthValue() - 1, 1);
	}
	
	public static LocalDate getLastDayOfMonth(LocalDate date) {
		int[] daysInAMonth = { 29, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    int day = 0;
		boolean isLeapYear = new GregorianCalendar().isLeapYear(date.getYear());
	    day =  (isLeapYear && date.getMonthValue() == 2) ?
	    	daysInAMonth[0] : daysInAMonth[date.getMonthValue()];
	    LocalDate monthLastDate = LocalDate.of(date.getYear(), date.getMonthValue(), day);
	    return monthLastDate;
	}
}