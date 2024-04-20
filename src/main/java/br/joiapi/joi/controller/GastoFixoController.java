package br.joiapi.joi.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.joiapi.joi.database.DatabaseFinanceiro;
import br.joiapi.joi.model.GastoFixo;

@RestController
public class GastoFixoController {
	@GetMapping("/gastofixo")
	public ArrayList<GastoFixo> getGastoFixo () {
		DatabaseFinanceiro dbFinanceiro = new DatabaseFinanceiro();

		// Realiza a consulta
		dbFinanceiro.consultaGeralGastoFixo();

		return dbFinanceiro.getListaGastoFixo();
	}

	@PostMapping("/gastofixo")
	public GastoFixo setGastoFixo (@RequestBody GastoFixo gastoFixo) {

		// TODO: Realizar inclusão no banco

		return gastoFixo;
	}
}
