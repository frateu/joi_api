package br.joiapi.joi.controller;

import org.springframework.web.bind.annotation.RestController;

import br.joiapi.joi.database.DatabaseTreinamento;
import br.joiapi.joi.model.TreinoAcademia;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class TreinoController {
    @GetMapping("/treinoAcademiaGeral")
    public ArrayList<TreinoAcademia> getTreinoAcademiaGeral() {
        DatabaseTreinamento databaseTreinamento = new DatabaseTreinamento();

        return databaseTreinamento.consultaGeralTreinoAcademia();
    }
    
    @GetMapping("/treinoAcademiaDia")
    public ArrayList<TreinoAcademia> getTreinoAcademiaDia(@RequestParam String pDiaSemana) {
        DatabaseTreinamento databaseTreinamento = new DatabaseTreinamento();

        return databaseTreinamento.consultaDiaTreinoAcademia(pDiaSemana);
    }
    
}
