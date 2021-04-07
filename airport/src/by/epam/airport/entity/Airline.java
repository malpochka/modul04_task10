package by.epam.airport.entity;

public class Airline {

	private String destination;
	private int flightNnumber;
	private String aircraftType;
	private Time time;
	private Day daysOfTheWeek;

	public Airline() {

	}

	public Airline(String destination, int flightNumber, String aircraftType, Time time, Day daysOfTheWeek) {
		this.destination = destination;
		this.flightNnumber = flightNumber;
		this.aircraftType = aircraftType;
		this.time = time;
		this.daysOfTheWeek = daysOfTheWeek;

	}

	public Day getDaysOfTheWeek() {
		return daysOfTheWeek;
	}

	public void setDaysOfTheWeek(Day daysOfTheWeek) {
		this.daysOfTheWeek = daysOfTheWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNnumber() {
		return flightNnumber;
	}

	public void setFlightNnumber(int flightNnumber) {
		this.flightNnumber = flightNnumber;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNnumber;
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNnumber != other.flightNnumber)
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [����� ���������: " + destination + ", ����� �����: " + flightNnumber + ", ��� ��������: "
				+ aircraftType + ", ����� ������: " + time + ", �� ����� ���� ������" + daysOfTheWeek + "]";
	}
}
