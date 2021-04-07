package by.epam.airport.main;

import java.util.List;

import by.epam.airport.entity.*;
import by.epam.airport.logic.*;
import by.epam.airport.view.*;

/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
 * метод toString.Создать второй класс агрегирующий массив типа Airline, с подходящими конструктарами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Класс Airline:пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a)список рейсов для заданного пункта назначения;
 * б)список рейсов для заданного дня недели.
 * в)список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Main {

	public static void main(String[] args) {
		String s;
		String s2;
		int n;
		int n2;

		DepartuesBoard onBoard = new DepartuesBoard();
		AirlineView view = new AirlineView();
		AirlineLogic logic = new AirlineLogic();

		Day week = new Day();
		week.addDays("Понедельник");
		week.addDays("Вторник");

		Day week2 = new Day();
		week2.addDays("Понедельник");
		week2.addDays("Среда");

		Day week3 = new Day();
		week3.addDays("Четверг");
		week3.addDays("Пятница");

		Day week4 = new Day();
		week4.addDays("Понедельник");
		week4.addDays("Вторник");
		week4.addDays("Среда");
		week4.addDays("Четверг");
		week4.addDays("Пятница");
		week4.addDays("Суббота");
		week4.addDays("Воскресенье");

		onBoard.addAirlines(new Airline("Париж", 1524, "A310", new Time(15, 30), week));
		onBoard.addAirlines(new Airline("Нью Йорк", 416, "B767", new Time(8, 30), week2));
		onBoard.addAirlines(new Airline("Гамбург", 1707, "A320", new Time(9, 25), week3));
		onBoard.addAirlines(new Airline("Амстердам", 1759, "A310", new Time(11, 45), week2));
		onBoard.addAirlines(new Airline("Вена", 6164, "B747", new Time(12, 05), week));
		onBoard.addAirlines(new Airline("Симферополь", 6810, "T134", new Time(13, 00), week3));
		onBoard.addAirlines(new Airline("Москва", 122, "T154", new Time(16, 32), week4));

		view.print("Список самолетов: ", onBoard);

		s = logic.enterFromConsole("Введите пункт назначения");

		List<Airline> choice;
		choice = logic.airlineByDestination(onBoard.getAirlines(), s);

		view.print("Список рейсов для заданного пункта назначения: ", choice);

		s2 = logic.enterFromConsole("Введите день недели");
		choice = logic.airlineByDate(onBoard.getAirlines(), s2);

		view.print("Список рейсов для заданного дня недели: ", choice);

		n = logic.enterFromConsole2("Введите время вылета:час вылета");
		n2 = logic.enterFromConsole2("Введите время вылета:минуты вылета");

		choice = logic.airlineByDateTime(onBoard.getAirlines(), s2, n, n2);
		view.print("Список рейсов для заданного дня недели, время вылета для которых больше заданного:", choice);
	}

}
