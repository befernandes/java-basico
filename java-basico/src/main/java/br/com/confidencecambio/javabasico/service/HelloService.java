package br.com.confidencecambio.javabasico.service;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import br.com.confidencecambio.domain.Imc;

import java.util.Optional;

@Component
public class HelloService {

    private static final String valorPadrao = "Mundo";
	
	public double calcularImc(Imc imc) {
		return calImc(imc.getAltura(), imc.getPeso());
		
	}
    public String retornaValorValido(@Nullable String nome) {
        return Optional.ofNullable(nome).orElse(valorPadrao);
    }
    public  double calImc(double altura, double peso) {

		try {
			return peso / (altura * altura);

		} catch (NumberFormatException e) {
			// TODO: handle exception
			new NumberFormatException("Informe um valor valido");
		}
		return 0;

	}
}
