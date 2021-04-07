package by.epam.airport.entity;

import java.util.ArrayList;
import java.util.List;

public class DepartuesBoard {

	private List<Airline> airlines;

	{
		airlines = new ArrayList<Airline>();
	}

	public DepartuesBoard() {

	}

	public void addAirlines(Airline airline) {
		airlines.add(airline);
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
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
		DepartuesBoard other = (DepartuesBoard) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DepartuesBoard [airlines=" + airlines + "]";
	}
}
