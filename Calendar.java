/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {	
    static int year = 1900;
	static int inputYear;
	static int dayOfMonth = 1;   
	static int month = 1;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday 
	static int totalDays = 0;
	static int nDaysInMonth = 31; // Number of days in January
	static int specialSunday = 0; // Number of sundays that fall on the 1st of each month
	
	public static void main(String args[]) {
		inputYear = Integer.parseInt(args[0]);

		while (year < inputYear + 1) {
	 		if (!(year < inputYear)) {
				System.out.println(dayOfMonth + "/" + month + "/" + inputYear + (dayOfWeek == 1 ? " Sunday" : ""));		
			}
	 		advance(); 
		}
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		if (year < inputYear) {
			totalDays++;

			if (dayOfWeek < 7) {
				dayOfWeek++;
			} else {
				dayOfWeek = 1;
			}

			if (isLeapYear(year) && totalDays == 366 || !isLeapYear(year) && totalDays == 365) {
				year++;
				totalDays = 0;
			}
			return;
		}

		if (dayOfWeek < 7) {
			dayOfWeek++;
		} else {
			dayOfWeek = 1;
		}

		if (dayOfMonth == nDaysInMonth(month, inputYear)) {
			dayOfMonth = 1;
			if (month == 12) {
				month = 0;
				year++;
			}
			month = month + 1;
		} else {
			dayOfMonth++;
		}
	 }
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		// Checks if the year is divisible by 400
		boolean leapYear = ((year % 400) == 0);
		// Then checks if the year is divisible by 4 but not by 100
		leapYear = leapYear || (((year % 4) == 0) && ((year % 100) != 0));

		return leapYear;
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {
		int days = 0;

		switch (month) {
			case 1:
				days = 31;
				break;
			case 2:
				if (isLeapYear(year)) {
					days = 29;
					break;
				}
				days = 28;
					break;
							case 3:
				days = 31;
					break;
			case 4:
				days = 30;
					break;
							case 5:
				days = 31;
					break;
			case 6:
				days = 30;
					break;
							case 7:
				days = 31;
					break;
							case 8:
				days = 31;
					break;
			case 9:
				days = 30;
					break;
							case 10:
				days = 31;
					break;
			case 11:
				days = 30;
					break;
			case 12:
				days = 31;
					break;
		}
		return days;
	}
}
