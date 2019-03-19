package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		this.month = month;
		this.day = day;
		//Comprueba el mes desde el metodo setMonth
		setMonth(month);
		
		//Comprueba el dia desde el metodo setDay
		setDay(day);
	}
	
	//Asigna y verifica el mes
	public void setMonth(int month)throws DateException{
		
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido." +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
	}
	
	//Asigna y verifica el dia
	public void setDay(int day)throws DateException{
		
		if((this.day>0) && (this.day <= getDaysOfMonth())){
			
		this.day = day;
		
		}else{
			throw new DateException("Dia " +day+" no valido para el mes "+getMonthName()+", valores posibles entre 1-"+getDaysOfMonth());
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
	
	//Devuelve si una fecha y otra tienen el mismo año con if
	public boolean isSameYearIf(Date date){
		boolean sameYear = false;
		
		if(this.year == date.getYear()){
			sameYear = true;
		}
	return sameYear;

	}
	
	//Devuelve si una fecha y otra tienen el mismo año sin if
	public boolean isSameYear(Date date){
		
		return this.year == date.getYear();
	}
	
	
	//Devuelve si una fecha y otra tienen el mismo mes con if
	public boolean isSameMonthIf(Date date){
		boolean sameMonth = false;
		
		if(this.month == date.getMonth()){
			sameMonth = true;
		}
	return sameMonth;
	}
	
	//Devuelve si una fecha y otra tienen el mismo mes sin if
	public boolean isSameMonth(Date date){
		
		return this.month == date.getMonth();
	}
	
	//Devuelve si una fecha y otra tienen el mismo dia con if
	public boolean isSameDayIf(Date date){
		boolean sameDay = false;
		
		if(this.day == date.getDay()){
			sameDay = true;
		}
	return sameDay;

	}
	
	//Devuelve si una fecha y otra tienen el mismo dia sin if
	public boolean isSameDay(Date date){
		
		return this.day == date.getDay();
	}
	
	//Devuelve si la fecha es la misma
	public boolean isSame(Date date){
		boolean same = false;
		
		if((this.day == date.getDay())&&(this.month == date.getMonth())&&(this.year == date.getYear())){
			same = true;
		}
		return same;
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