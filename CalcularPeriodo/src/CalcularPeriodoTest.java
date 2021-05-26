import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class CalcularPeriodoTest {

	@Test
	void test() {
		CalcularPeriodo c = new CalcularPeriodo();
		c.calcularPeriodo("Periodo", LocalDate.now());
	}

}
