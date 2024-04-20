package br.joiapi.joi.model;

import java.math.BigDecimal;
import java.sql.Date;

public class GastoFixo {
	public static String NM_Tabela_Gasto_Fixo = "gasto_fixo";

	public static String NM_IdGastoFixo        = "id";
	public static String NM_DescricaoGastoFixo = "descricao";
	public static String NM_ValorGastoFixo     = "valor";
	public static String NM_CobrancaGastoFixo  = "data_cobranca";

	private Long idGastoFixo;
	private String descricaoGastoFixo;
	private BigDecimal valorGastoFixo;
	private Date cobrancaGastoFixo;

	public GastoFixo() {
	}

	public GastoFixo(Long idGastoFixo, String descricaoGastoFixo, BigDecimal valorGastoFixo) {
		super();

		this.idGastoFixo = idGastoFixo;
		this.descricaoGastoFixo = descricaoGastoFixo;
		this.valorGastoFixo = valorGastoFixo;
	}

	public Long getIdGastoFixo() {
		return idGastoFixo;
	}

	public void setIdGastoFixo(Long idGastoFixo) {
		this.idGastoFixo = idGastoFixo;
	}

	public String getDescricaoGastoFixo() {
		return descricaoGastoFixo;
	}

	public void setDescricaoGastoFixo(String descricaoGastoFixo) {
		this.descricaoGastoFixo = descricaoGastoFixo;
	}

	public BigDecimal getValorGastoFixo() {
		return valorGastoFixo;
	}

	public void setValorGastoFixo(BigDecimal valorGastoFixo) {
		this.valorGastoFixo = valorGastoFixo;
	}

	public Date getCobrancaGastoFixo() {
		return cobrancaGastoFixo;
	}

	public void setCobrancaGastoFixo(Date cobrancaGastoFixo) {
		this.cobrancaGastoFixo = cobrancaGastoFixo;
	}

	
}
