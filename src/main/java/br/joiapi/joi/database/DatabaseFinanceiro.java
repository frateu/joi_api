package br.joiapi.joi.database;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import br.joiapi.joi.ConstantesJoi;
import br.joiapi.joi.model.GastoFixo;

public class DatabaseFinanceiro {
	// Declaração de variaveis
	private ArrayList<GastoFixo> aListaGastoFixo = new ArrayList<>();

	public ArrayList<GastoFixo> getListaGastoFixo() {
		return aListaGastoFixo;
	}

	public void setListaGastoFixo(ArrayList<GastoFixo> pListaGastoFixo) {
		aListaGastoFixo = pListaGastoFixo;
	}

	// Metodos do financeiro
	public void consultaGeralGastoFixo() {
		DatabaseConnection dbConnection = new DatabaseConnection(ConstantesJoi.DATABASE_FINANCEIRO);

		// Cria um statement
		Statement statement;
		try {
			ArrayList<GastoFixo> listaConsultaGastoFixo = new ArrayList<>();

			statement = dbConnection.createStatement();

			// Executa a consulta
			String query = "SELECT * FROM " + GastoFixo.NM_Tabela_Gasto_Fixo;

			ResultSet resultSet = statement.executeQuery(query);

			// Itera sobre os resultados
			while (resultSet.next()) {
				// Recupera os valores das colunas
				Long id           = resultSet.getLong(GastoFixo.NM_IdGastoFixo);
				String descricao  = resultSet.getString(GastoFixo.NM_DescricaoGastoFixo);
				BigDecimal valor  = resultSet.getBigDecimal(GastoFixo.NM_ValorGastoFixo);
				Date dataCobranca = resultSet.getDate(GastoFixo.NM_CobrancaGastoFixo);

				GastoFixo gastoFixo = new GastoFixo(id, descricao, valor);

				if (dataCobranca != null) {
					gastoFixo.setCobrancaGastoFixo(dataCobranca);
				}

				listaConsultaGastoFixo.add(gastoFixo);
			}

			setListaGastoFixo(listaConsultaGastoFixo);

			// Fecha o ResultSet, o Statement e o Connection
			dbConnection.closeConnection();
			resultSet.close();
			statement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
