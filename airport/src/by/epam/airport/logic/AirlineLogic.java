package by.epam.airport.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.airport.entity.*;

public class AirlineLogic {

	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public int enterFromConsole2(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextInt();
	}

	public List<Airline> airlineByDestination(List<Airline> airlines, String z) {
		List<Airline> destination = new ArrayList<Airline>();
		destination.addAll(airlines);

		List<Airline> destinations = new ArrayList<Airline>();

		for (int i = 0; i < destination.size(); i++) {
			if (destination.get(i).getDestination().equalsIgnoreCase(z)) {
				destinations.add(airlines.get(i));
			}
		}
		return destinations;
	}

	public List<Airline> airlineByDate(List<Airline> airlines, String z) {
		List<Airline> day = new ArrayList<Airline>();
		day.addAll(airlines);

		List<Airline> days = new ArrayList<Airline>();

		for (int i = 0; i < day.size(); i++) {
			for (int j = 0; j < day.get(i).getDaysOfTheWeek().getDays().size(); j++) {
				if (day.get(i).getDaysOfTheWeek().getDays().get(j).equalsIgnoreCase(z)) {
					days.add(airlines.get(i));
				}
			}
		}
		return days;
	}

	public List<Airline> airlineByDateTime(List<Airline> airlines, String z, int x, int y) {
		List<Airline> time = new ArrayList<Airline>();
		time.addAll(airlines);

		List<Airline> times = new ArrayList<Airline>();

		for (int i = 0; i < time.size(); i++) {
			for (int j = 0; j < time.get(i).getDaysOfTheWeek().getDays().size(); j++) {
				if ((time.get(i).getTime().getHour() > x)
						& (time.get(i).getDaysOfTheWeek().getDays().get(j).equalsIgnoreCase(z))) {
					times.add(airlines.get(i));
				} else if ((time.get(i).getTime().getMinute() > y) & (time.get(i).getTime().getHour() >= x)
						& (time.get(i).getDaysOfTheWeek().getDays().get(j).equalsIgnoreCase(z))) {

					times.add(airlines.get(i));
				}
			}
		}
		return times;
	}
}
