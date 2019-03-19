package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		
		//Comprueba el mes
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido." +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		
		//Comprueba el dia
		if((this.day>0) && (this.day < getDaysOfMonth())){
			
		this.day = day;
		
		}else{
			throw new DateException("Dia " +this.day+" no valido para el mes: "+getMonthName()+" valores posibles entre 1 y "+getDaysOfMonth());
		}
	}
	
	//Devuelve el año
	public int getYear(){
		return this.year;	
	}
	
	//Devuelve el mes
	public int getMonth(){
		return this.month;	
	}
	
	//Devuelve el dia
	public int getDay(){
		return this.day;
	}
	
	//Devuelve si una fecha y otra tienen el mismo año
	public boolean isSameYear(Date date){
		boolean sameYear = false;
		
		if(this.year == date.getYear()){
			sameYear = true;
		}
	return sameYear;
	}
	
	//Devuelve si una fecha y otra tienen el mismo mes
	public boolean isSameMonth(Date date){
		boolean sameMonth = false;
		
		if(this.month == date.getMonth()){
			sameMonth = true;
		}
	return sameMonth;
	}
	
	//Devuelve si una fecha y otra tienen el mismo dia
	public boolean isSameDay(Date date){
		boolean sameDay = false;
		
		if(this.day == date.getDay()){
			sameDay = true;
		}
	return sameDay;
	}
	
	//Devuelve si la fecha es la misma
	public boolean isSame(Date date){
		boolean same = false;
		
		if(){
			
		}
	}
		
	//Devuelve los dias del mes	
	public int getDaysOfMonth(){
		int day = 0;
		
		switch(this.month){
			
			case 1: //Next
			case 3: //Next
			case 5: //Next
			case 7: //Next
			case 8: //Next
			case 10: //Next
			case 12:
			day = 31;
			break;
			
			case 4: //Next
			case 6: //Next
			case 9: //Next
			case 11:
			day = 30;
			break;
			
			case 2:
			day = 28;
			break;
		}
		return day;
	}
	
	//Devuelve el nombre del mes
	public String getMonthName(){
		String name ="";
		
		switch(this.month){
			
			case 1: 
			name = "Enero";
			break;
			case 2: 
			name = "Febrerp";
			break;
			case 3: 
			name = "Marzo";
			break;
			case 4: 
			name = "Abril";
			break;
			case 5: 
			name = "Mayo";
			break;
			case 6: 
			name = "Junio";
			break;
			case 7:
			name = "Julio";
			break;
			case 8: 
			name = "Agosto";
			break;
			case 9:
			name = "Septiembre";
			break;
			case 10: 
			name = "Octubre";
			break;
			case 11:
			name = "Noviembre";
			break;
			case 12:
			name = "Diciembre";
			break;
		}
		return name;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}