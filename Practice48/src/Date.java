public class Date {
	private int year;
	private int month;
	private int day;
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
	public Date() {
		this(1900, 1, 1);
	}
	
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public String toString() {
		return (year + "년 " + month + "월 " + day + "일");
	}
	
	public static int compareDate(Date x, Date y) {
		if (x.getYear() < y.getYear()) {
			return -1;
		} else if(x.getYear() > y.getYear()) {
			return 1;
		} else {
			if(x.getMonth() < y.getMonth()) {
				return -1;
			} else if (x.getMonth() > y.getMonth()) {
				return 1;
			} else {
				if(x.getDay() < y.getDay()) {
					return -1;
				} else if(x.getDay() > y.getDay()) {
					return 1;
				} else {
					return 0;
				}
			}
		}
	}
}