package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today, yesterday;

		try {
			today = new Date(30,4,2013);
			yesterday = new Date(10,12,2013);
			
			System.out.println("Año: "+today.isSameDay(yesterday)+" Mes: "+today.isSameMonth(yesterday)+" año: "+today.isSameYear(yesterday));
			System.out.println("La misma: "+today.isSame(yesterday));
			System.out.println(today.toString());
		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}