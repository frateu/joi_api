package br.joiapi.joi.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.joiapi.joi.ConstantesJoi;
import br.joiapi.joi.model.TreinoAcademia;

public class DatabaseTreinamento {
	// Declaração de variaveis

	// Metodos do financeiro
	public ArrayList<TreinoAcademia> consultaGeralTreinoAcademia() {
		DatabaseConnection dbConnection = new DatabaseConnection(ConstantesJoi.DATABASE_TREINAMENTO);

		ArrayList<TreinoAcademia> listaConsultaTreinoAcademia = new ArrayList<>();

		// Cria um statement
		Statement statement;

		try {
			statement = dbConnection.createStatement();

			// Executa a consulta
			String query = "SELECT * FROM " + TreinoAcademia.NM_Tabela_Treino_Academia;

			ResultSet resultSet = statement.executeQuery(query);

			// Itera sobre os resultados
			while (resultSet.next()) {
				// Recupera os valores das colunas
                TreinoAcademia treinoAcademia = new TreinoAcademia();

                treinoAcademia.setIdTreino(resultSet.getLong(TreinoAcademia.NM_IdTreinoAcademia));
                treinoAcademia.setNomeTreino(resultSet.getString(TreinoAcademia.NM_NomeTreinoAcademia));
                treinoAcademia.setSeriesTreino(resultSet.getInt(TreinoAcademia.NM_SeriesTreinoAcademia));
                treinoAcademia.setSeriesTreino(resultSet.getInt(TreinoAcademia.NM_SeriesTreinoAcademia));
                treinoAcademia.setDiasTreino(resultSet.getString(TreinoAcademia.NM_DiasTreinoAcademia));
                
                if (resultSet.getString(TreinoAcademia.NM_DescricaoTreinoAcademia) != null) {
                    treinoAcademia.setDescricaoTreino(resultSet.getString(TreinoAcademia.NM_DescricaoTreinoAcademia));
                }

                listaConsultaTreinoAcademia.add(treinoAcademia);
			}

			// Fecha o ResultSet, o Statement e o Connection
			dbConnection.closeConnection();
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

        return listaConsultaTreinoAcademia;
    }
    
    public ArrayList<TreinoAcademia> consultaDiaTreinoAcademia(String diaSemana) {
		DatabaseConnection dbConnection = new DatabaseConnection(ConstantesJoi.DATABASE_TREINAMENTO);

		ArrayList<TreinoAcademia> listaConsultaTreinoAcademia = new ArrayList<>();
		
        // Cria um statement
		PreparedStatement statement;

        try {
            // Criar consulta
            String query = "SELECT * FROM " + TreinoAcademia.NM_Tabela_Treino_Academia + " WHERE " + TreinoAcademia.NM_Tabela_Treino_Academia + "." + TreinoAcademia.NM_DiasTreinoAcademia + " LIKE ?";

            statement = dbConnection.createPreparedStatement(query);

            statement.setString(1, "%" + diaSemana + "%");

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                TreinoAcademia treinoAcademia = new TreinoAcademia();

                treinoAcademia.setIdTreino(resultSet.getLong(TreinoAcademia.NM_IdTreinoAcademia));
                treinoAcademia.setNomeTreino(resultSet.getString(TreinoAcademia.NM_NomeTreinoAcademia));
                treinoAcademia.setSeriesTreino(resultSet.getInt(TreinoAcademia.NM_SeriesTreinoAcademia));
                treinoAcademia.setSeriesTreino(resultSet.getInt(TreinoAcademia.NM_SeriesTreinoAcademia));
                treinoAcademia.setDiasTreino(resultSet.getString(TreinoAcademia.NM_DiasTreinoAcademia));
                
                if (resultSet.getString(TreinoAcademia.NM_DescricaoTreinoAcademia) != null) {
                    treinoAcademia.setDescricaoTreino(resultSet.getString(TreinoAcademia.NM_DescricaoTreinoAcademia));
                }

                listaConsultaTreinoAcademia.add(treinoAcademia);
            }

            // Fecha o ResultSet, o Statement e o Connection
			dbConnection.closeConnection();
			resultSet.close();
			statement.close();
        } catch (Exception e) {
			e.printStackTrace();
        }

        return listaConsultaTreinoAcademia;
    }
}
