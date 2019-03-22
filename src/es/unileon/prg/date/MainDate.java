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
			today = new Date(3,4,2013);
			yesterday = new Date(10,12,2013);
			
			System.out.println("Año: "+today.isSameDay(yesterday)+" Mes: "+today.isSameMonth(yesterday)+" año: "+today.isSameYear(yesterday));
			System.out.println("La misma: "+today.isSame(yesterday));
			System.out.println("La estacion es: "+today.getMonthSeason());
			System.out.println("La fecha de hoy es: "+today.dateToString());
			System.out.println("Fechas que faltan hasta final de mes: "+today.getDatesLeft());
			System.out.println("Los meses que tienen los mismos dias que "+today.getMonthName()+" son: "+today.withSameDays());
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}