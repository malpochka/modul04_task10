package by.epam.airport.view;

import java.util.List;

import by.epam.airport.entity.Airline;
import by.epam.airport.entity.DepartuesBoard;

public class AirlineView {

	public void print(String message, DepartuesBoard onBoard) {

		System.out.println(message);

		for (int i = 0; i < onBoard.getAirlines().size(); i++) {

			System.out.println(onBoard.getAirlines().get(i));
		}
	}

	public void print(String message, List<Airline> airline) {

		System.out.println(message);

		for (int i = 0; i < airline.size(); i++) {

			System.out.println(airline.get(i));
		}
	}
}
