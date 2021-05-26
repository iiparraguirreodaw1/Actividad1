import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalcularPeriodo {
	
	public static void main(String[] args) {
		
		//Creamos la fecha del descubrimiento de américa
		LocalDate fecha = LocalDate.of(1492, Month.OCTOBER, 12);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El descubrimiento de América", fecha);
		
		//Creamos la fecha del 11S
		LocalDate fecha2 = LocalDate.of(2001, Month.SEPTEMBER, 11);	 
		// Mostramos cuánto tiempo ha pasado.
		calcularPeriodo("Atentado torres gemelas", fecha2);
		//Creamos la fecha del nacimiento de Unaitxi
		LocalDate fecha3 = LocalDate.of(2000, Month.SEPTEMBER, 18);	 
		// Mostramos cuánto tiempo ha pasado
		calcularPeriodo("El nacimiento de Unaitxi", fecha3);
	}
	
	public static void calcularPeriodo(String nombre, LocalDate fecha) {
        
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fecha, fechaActual);
        
        // Cálculo de las diferencias
        int anyos = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();
        
        String texto = String.format(nombre + " ocurrió hace %d años, %d meses y %d días.", anyos, meses, dias);
         
        System.out.println(texto);
    }
 
}
