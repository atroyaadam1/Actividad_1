import java.time.LocalDate;
import java.time.Month;

public class Test {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		LocalDate fecha = LocalDate.of(1999, Month.SEPTEMBER, 28);	 
		// Mostramos cuánto tiempo ha pasado
		CalcularPeriodo var = new CalcularPeriodo();
		var.calcularPeriodo("Mi cumpleaños fue", fecha);
	


	LocalDate fecha1 = LocalDate.of(1998, Month.DECEMBER, 25);	 
	// Mostramos cuánto tiempo ha pasado
	CalcularPeriodo var1 = new CalcularPeriodo();
	var1.calcularPeriodo("Mi cumpleaños fue", fecha1);
	

	LocalDate fecha2 = LocalDate.of(1997, Month.NOVEMBER, 21);	 
	// Mostramos cuánto tiempo ha pasado
	CalcularPeriodo var2 = new CalcularPeriodo();
	var1.calcularPeriodo("Mi cumpleaños fue", fecha2);

	}
}
