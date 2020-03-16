package by.htp.simple.bean;

public class Date implements Comparable<Date> {
	//private static final long serialVersionUID = 1L;

	private Integer year;
	private Integer month;
	private Integer day;

	private Integer hour;
	private Integer minute;
	
	public Date() {
		
	}

	public Date(int year, int month, int day, int hour, int minute) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.hour = hour;
		this.minute = minute;
	}

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

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + hour;
		result = prime * result + minute;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + ", hour=" + hour + ", minute=" + minute
				+ "]";
	}
	@Override
	public int compareTo(Date date) {
		int result = this.year.compareTo(date.year);
		if(result == 0) {
			result = this.month.compareTo(date.month);
		}
		if(result == 0) {
			result = this.day.compareTo(date.day);
		}
		if(result == 0) {
			result = this.hour.compareTo(date.hour);
		}
		if(result == 0) {
			result = this.minute.compareTo(date.minute);
		}
		
		return result;
	}
	
	

}