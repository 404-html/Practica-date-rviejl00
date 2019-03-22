package es.unileon.prg.date;

/**
*	Main de date
*	
*	@version 1.0 
*	@author rviejl00
*/

public class MainDate {

	public static void main(String[] args) {

		Date today, yesterday;

		try {
			today = new Date(29,10,2020);
			yesterday = new Date(10,12,2013);
			
			System.out.println("Año: "+today.isSameDay(yesterday.getDay())+" Mes: "+today.isSameMonth(yesterday.getMonth())+" año: "+today.isSameYear(yesterday.getYear()));
			System.out.println("La misma: "+today.isSame(yesterday));
			System.out.println("La estacion es: "+today.getMonthSeason());
			System.out.println("La fecha de hoy es: "+today.dateToString());
			System.out.println("Fechas que faltan hasta final de mes: "+today.getDatesLeft());
			System.out.println("Los meses que tienen los mismos dias que "+today.getMonthName()+" son: "+today.withSameDays());
			System.out.println("Han pasado "+today.passedDays()+" dias desde el 1 de enero");
			System.out.println("Intentos para el while: "+today.guessDateWhile());
			System.out.println("Intentos para el do-while: "+today.guessDateDoWhile());
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}