package by.epam.airport.entity;

public class Time {

	private int hour;
	private int minute;

	public Time() {

	}

	public Time(int hour, int minute) {

		this.hour = hour;

		if (this.hour > 24) {
			this.hour = 0;
		}
		this.minute = minute;

		if (this.minute > 60) {
			this.minute = 0;
		}
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
		result = prime * result + hour;
		result = prime * result + minute;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (minute != other.minute)
			return false;
		return true;
	}

	@Override
	public String toString() {
		if (this.minute == 00) {
			return hour + ":" + "00";
		} else if (this.minute > 0 & this.minute < 10) {
			return hour + ":" + "0" + minute;
		} else
			return hour + ":" + minute;

	}
}
