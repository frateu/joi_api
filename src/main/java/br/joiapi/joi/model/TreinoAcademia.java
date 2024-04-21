package br.joiapi.joi.model;

public class TreinoAcademia {
    public static final String NM_Tabela_Treino_Academia = "treino_academia";

    public static final String NM_IdTreinoAcademia         = "id";
    public static final String NM_NomeTreinoAcademia       = "nome";
    public static final String NM_SeriesTreinoAcademia     = "series";
    public static final String NM_RepeticoesTreinoAcademia = "repeticoes";
    public static final String NM_DescricaoTreinoAcademia  = "descricao";
    public static final String NM_DiasTreinoAcademia       = "dias";

    private Long idTreino;
    private String nomeTreino;
    private Integer seriesTreino;
    private Integer repeticoesTreino; 
    private String descricaoTreino;
    private String diasTreino;
    
    /**
     * @return Long return the idTreino
     */
    public Long getIdTreino() {
        return idTreino;
    }

    /**
     * @param idTreino the idTreino to set
     */
    public void setIdTreino(Long idTreino) {
        this.idTreino = idTreino;
    }

    /**
     * @return String return the nomeTreino
     */
    public String getNomeTreino() {
        return nomeTreino;
    }

    /**
     * @param nomeTreino the nomeTreino to set
     */
    public void setNomeTreino(String nomeTreino) {
        this.nomeTreino = nomeTreino;
    }

    /**
     * @return Integer return the seriesTreino
     */
    public Integer getSeriesTreino() {
        return seriesTreino;
    }

    /**
     * @param seriesTreino the seriesTreino to set
     */
    public void setSeriesTreino(Integer seriesTreino) {
        this.seriesTreino = seriesTreino;
    }

    /**
     * @return Integer return the repeticoesTreino
     */
    public Integer getRepeticoesTreino() {
        return repeticoesTreino;
    }

    /**
     * @param repeticoesTreino the repeticoesTreino to set
     */
    public void setRepeticoesTreino(Integer repeticoesTreino) {
        this.repeticoesTreino = repeticoesTreino;
    }

    /**
     * @return String return the descricaoTreino
     */
    public String getDescricaoTreino() {
        return descricaoTreino;
    }

    /**
     * @param descricaoTreino the descricaoTreino to set
     */
    public void setDescricaoTreino(String descricaoTreino) {
        this.descricaoTreino = descricaoTreino;
    }

    /**
     * @return String return the diasTreino
     */
    public String getDiasTreino() {
        return diasTreino;
    }

    /**
     * @param diasTreino the diasTreino to set
     */
    public void setDiasTreino(String diasTreino) {
        this.diasTreino = diasTreino;
    }

}
