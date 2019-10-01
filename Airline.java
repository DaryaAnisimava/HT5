package by.epam.les07.main;

import java.util.*;

public class Airline {
/*Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
*/
	
private String destination;
private int fnumber;
private String atype;
private double time;
private String day;



Airline(String _destination, int _fnumber, String _atype, double _time, String _day) {
	this.destination= _destination;
	this.fnumber = _fnumber;
    this.atype = _atype;
    this.time = _time;
    this.day = _day;
}
public String getDestination() {
	return destination;
}

public int getFnumber() {
	return fnumber;
}


public String getAtype() {
	return atype;
}

public double getTime() {
	return time;
}

public String getDay() {
	return day;
}


    public String toString() {
        return String.format("destination: %s\t fnumber: %s\t atype: %s\t time:  %s\t day: %s\t",
                   destination, fnumber, atype, time, day);
   }
 


    public static void main(String[] args) {
    	Avia air = new Avia("Alines");
    	
		
        air.addAirlineToAviaList(new Airline("London", 105, "A320", 13.30, "Monday"));
        air.addAirlineToAviaList(new Airline("New York", 109, "A400", 10.15, "Sunday"));
        air.addAirlineToAviaList(new Airline("Warsaw", 122, "A211", 11.25, "Saturday" ));
        air.addAirlineToAviaList(new Airline("Calgary", 128, "A213", 16.30, "Wednesday"));
        air.addAirlineToAviaList(new Airline("Malaga", 111, "A243", 12.50, "Thursday"));
        air.addAirlineToAviaList(new Airline("Boston", 134, "A345", 12.30, "Tuesday"));
        air.addAirlineToAviaList(new Airline("Moscow", 178, "A564", 19.45, "Monday"));
        air.addAirlineToAviaList(new Airline("Berlin", 145, "A456", 14.55, "Thursday"));
        air.addAirlineToAviaList(new Airline("Geneva", 197, "A675", 20.00, "Tuesday")); 
        air.addAirlineToAviaList(new Airline("Vienn", 175, "A850", 17.50, "Monday"));
    
		System.out.println("\nsort by destination:");
		List<Airline> listSortByDestination = air.getListByDestination("Moscow");
		for (Airline c : listSortByDestination) {
            System.out.println(c);
       }
 
		System.out.println("\nsort by day of the week:");
		List<Airline> listSortByDay = air.getListByDay("Monday");
        for (Airline c : listSortByDay) {
            System.out.println(c);
        }
 
        System.out.println("\nprint flights after given date:");
        List<Airline> listSortByDiapazon = air.getListByDiapasond(13.00, "Monday");
        for (Airline c : listSortByDiapazon) {
            System.out.println(c);
        }
 
 
   
    }

    }

	