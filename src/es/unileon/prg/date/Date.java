package es.unileon.prg.date;

/**
*	Clase Date donde son resueltos los ejercicios date
*	@version 1.0
*	@author rviejl00
*/

public class Date {

	/**
	*	Atributos de clase
	*/
	private int day;
	private int month;
	private int year;
	
	/**
	*	Constructor de la clase, crea una fecha dados dia, mes y año.
	*	Si alguno de los parametros es incorrecto lanza una excepcion
	*/
	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		this.month = month;
		this.day = day;
		//Comprueba el mes desde el metodo setMonth
		setMonth(month);
		
		//Comprueba el dia desde el metodo setDay
		setDay(day);
	}
	
	/**
	*	Metodo que asigna y verifica si el mes es valido.
	*/
	public void setMonth(int month)throws DateException{
		
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido." +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
	}
	
	/**
	*	Metodo que asigna y verifica si el dia es valido.
	*/
	public void setDay(int day)throws DateException{
		
		if((this.day>0) && (this.day <= getDaysOfMonth())){
			
		this.day = day;
		
		}else{
			throw new DateException("Dia " +day+" no valido para el mes "+p_getMonthName(this.month)+", valores posibles entre 1-"+getDaysOfMonth());
		}
	}
	
	/**
	*	Metodo que devuelve el año.
	*/
	public int getYear(){
		return this.year;	
	}
	
	/**
	*	Metodo que devuelve el mes.
	*/
	public int getMonth(){
		return this.month;	
	}
	
	/**
	*	Metodo que devuelve el dia
	*/
	public int getDay(){
		return this.day;
	}
	
	/**
	*	Metodos que devuelven si una fecha tiene el mismo año que otra con if y sin if respectivamente.
	*	Dado como parametro un año de tipo entero.
	*/
	public boolean isSameYearIf(int otherYear){ //Con if
		boolean sameYear = false;
		
		if(this.year == otherYear){
			sameYear = true;
		}
	return sameYear;
	}
	
	public boolean isSameYear(int otherYear){ //Sin if
		return this.year == otherYear;
	}
	
	
	/**
	*	Metodos que devuelven si una fecha tiene el mismo mes que otra, con if y sin if respectivamente.
	*	Dado como parametro un mes de tipo entero.
	*/
	public boolean isSameMonthIf(int otherMonth){ //Con if
		boolean sameMonth = false;
		
		if(this.month == otherMonth){
			sameMonth = true;
		}
	return sameMonth;
	}
	
	public boolean isSameMonth(int otherMonth){ //Sin if
		return this.month == otherMonth;
	}
	
	/**
	*	Metodos que devuelven si una fecha tiene el mismo dia que otra, con if y sin if respectivamente.
	*	Dado como parametro un dia de tipo entero.
	*/
	public boolean isSameDayIf(int otherDay){ //Con if
		boolean sameDay = false;
		
		if(this.day == otherDay){
			sameDay = true;
		}
	return sameDay;
	}
	
	public boolean isSameDay(int otherDay){ //Sin if
		return this.day == otherDay;
	}
	
	/**
	*	Metodos que devuelven si una fecha es igual que otra, con if y sin if respectivamente.
	*	Dado como parametro un objeto de tipo Date.
	*/
	public boolean isSameIf(Date date){ //Con if
		boolean same = false;
		
		if((this.day == date.getDay())&&(this.month == date.getMonth())&&(this.year == date.getYear())){
			same = true;
		}
		return same;
	}
	
	public boolean isSame(Date date){ //Sin if
		return ((this.day == date.getDay())&&(this.month == date.getMonth())&&(this.year == date.getYear()));
	}
		
	/**
	*	Metodo privado que devuelve cuantos dias tiene el mes de la fecha.
	*	Se usa para verificar los dias en otros metodos.
	*/
	private int getDaysOfMonth(){
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
	
	/**
	*	Metodo que devuelve cuantos dias tiene el mes dado como parametro.
	*/
	private int p_getDaysOfMonth(int mes){
		int day = 0;
		
		switch(mes){
			
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
	
	/**
	*	Metodo que privado devuelve un string con el nombre del mes dado como parametro.
	*	El parametro es un tipo entero.
	*/
	private String p_getMonthName(int mes){
		String name ="";
		
		switch(mes){
			
			case 1: 
			name = "Enero";
			break;
			case 2: 
			name = "Febrero";
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
	
	/**
	*	Metodo publico que devuelve el nombre del mes de una fecha
	*/
	public String getMonthName(){
		String name ="";
		
		switch(this.month){
			
			case 1: 
			name = "Enero";
			break;
			case 2: 
			name = "Febrero";
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
	
	/**
	*	Metodo que devuelve la estacion del mes de una fecha.
	*/
	public String getMonthSeason(){
		String season ="";

		switch(this.month){
			
			case 12: //Next
			case 1: //Next
			case 2: 
			season = "Invierno";
			break;
			case 3:  //Next
			case 4:  //Next
			case 5: 
			season = "Primavera";
			break;
			case 6:  //Next
			case 7:  //Next
			case 8: 
			season = "Verano";
			break;
			case 9:  //Next
			case 10:  //Next
			case 11: 
			season = "Otoño";
			break;
		}
		return season;
	}
	
	/**
	*	Metodo que devuelve cuantos meses quedan para que acabe el año 
	*	teniendo en cuenta el mes de una fecha.
	*/
	public int getMonthsLeft(){
		int suma = 0;
	
		for(int i = (this.month +1);i<=12;i++){
			suma = suma +1;
		}
		return suma;
	}
	
	/**
	*	Metodo que devuelve una fecha como tipo String
	*/
	public String dateToString(){
		
		StringBuffer date = new StringBuffer("");
		date.append(this.day);
		date.append("/");
		date.append(this.month);
		date.append("/");
		date.append(this.year);
		return date.toString();
		
	}
	
	/**
	*	Metodo que devuelve un String con todas las fechas que quedan 
	*	hasta que acabe el año.
	*/
	public String getDatesLeft(){
		StringBuffer dates = new StringBuffer("");
		
		for(int i = (this.day +1);i<=(p_getDaysOfMonth(this.month));i++){
			dates.append(i);
			dates.append("/");
			dates.append(this.month);
			dates.append(" ");
		}
		return dates.toString();
	}
	
	/**
	*	Metodo que devuelve los meses que tengan los mismos
	*	dias que el mes de la fecha en la que se usa el metodo.
	*/
	public String withSameDays(){
		StringBuffer same = new StringBuffer("");
		
		for(int i =1;i<13;i++){
			if((p_getDaysOfMonth(i) == p_getDaysOfMonth(this.month)) && i != this.month){
				
				same.append(p_getMonthName(i));
				same.append(" ");
			}
		}			
		return same.toString();
	}
	
	/**
	*	Metodo que devuelve los meses que han pasado hasta ese dia
	*	contando el propio dia.
	*/
	public int passedDays(){
		int suma = this.day;
		
		for(int i = 1;i<this.month;i++){
			suma = suma + p_getDaysOfMonth(i);
		}
		return suma;
	}
	
	/**
	*	Metodo que cuenta cuantos intentos necesita el programa
	*	para generar una fecha con el mismo año que la introducida
	*	para ello generara numeros aleatorios desde el año 1 hasta el año de la fecha mas 1500 años.
	*	He decidido poner ese rango de años ya que no se especifica entre cuantos años tiene que buscar.
	* 	
	*	La fecha que tiene que adivinar se dara como parametro
	*	Ademas hay un metodo con while y otro con do-while respectivamente
	*/
	public int guessDateWhile(){ //Con While
		int intentos = 0;
		boolean guessing = true;
		
		while(guessing){
			intentos = intentos + 1;
			int prueba = (int) (Math.random() * (this.year+1500)) +1;
			if(prueba ==this.year){
				guessing = false;
			}
			
		}
		return intentos;
	}

	public int guessDateDoWhile(){ //Con do-while
		int intentos = 0;
		boolean guessing = true;
		
		do{
			intentos = intentos + 1;
			int prueba = (int) (Math.random() * (this.year+1500)) +1;
			if(prueba ==this.year){
				guessing = false;
			}
			
		}while(guessing);
			
		return intentos;
	}
	
	/**
	*	Devuelve el dia de la semana que es de una fecha dada.
	*	Dado como parametro el primer dia del año.
	*	Siendo 1 Lunes y 7 Domingo
	*/
	public String dayOfWeek(int dia){
		int suma = dia;
		String diaS ="";
		try{
			Date date = new Date(this.day, this.month, this.year);
			
		//Para tener en cuenta los años bisiestos
		if((((this.year%4 == 0) && (this.year%100 != 0)) || (this.year%400 == 0))&& (this.month>2)){ 
			
			for(int i = 1; i <date.passedDays()+1;i++){
				suma = suma + 1;
					if(suma == 8){
					suma = 1;
					}
			}
		}else{
			
			for(int i = 1; i <date.passedDays();i++){
				suma = suma + 1;
				if(suma == 8){
				suma = 1;
				}
			}
		}
		switch(suma){
			case 1:
			diaS="Lunes";
			break;
			case 2:
			diaS="Martes";
			break;
			case 3:
			diaS="Miercoles";
			break;
			case 4:
			diaS="Jueves";
			break;
			case 5:
			diaS="Viernes";
			break;
			case 6:
			diaS="Sabado";
			break;
			case 7:
			diaS="Domingo";
			break;
		}
		}catch(DateException e){}
		return diaS;
	}
	
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}

}