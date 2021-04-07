package by.epam.airport.entity;

import java.util.List;
import java.util.ArrayList;

public class Day {

	private List<String> days;

	{
		days = new ArrayList<String>();
	}

	public Day() {

	}

	public void addDays(String day) {
		days.add(day);
	}

	public List<String> getDays() {
		return days;
	}

	public void setDays(List<String> days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
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
		Day other = (Day) obj;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return ": " + days;
	}
}
