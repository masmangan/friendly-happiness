import static org.junit.Assert.*;

import org.junit.Test;

import negocios.NotaFiscalFachada;

public class NotaFiscalTest {

	@Test
	public void test() {
		String cpf = "122121";
		NotaFiscalFachada f = new NotaFiscalFachada();
		float desconto = f.calcularDescontoIPVA(cpf);
	}

	

}
