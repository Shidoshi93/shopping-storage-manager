public class Endereco {
    private String nomeDaRua;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;
    private String numero;
    private String complemento;

    public Endereco(String rua, String cidade, String estado, String cep, String pais, String numero, String complemento) {
        this.nomeDaRua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.pais = pais;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getNomeDaRua() {
        return nomeDaRua;
    }

    public String getCep() {
        return cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNumero() {
        return numero;
    }

    public String getPais() {
        return pais;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setNomeDaRua(String nomeDaRua) {
        this.nomeDaRua = nomeDaRua;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @Override
    public String toString() {
        return "{" +
                "nomeDaRua:'" + nomeDaRua + '\'' +
                ", cidade:'" + cidade + '\'' +
                ", estado:'" + estado + '\'' +
                ", cep:'" + cep + '\'' +
                ", pais:'" + pais + '\'' +
                ", numero:'" + numero + '\'' +
                ", complemento:'" + complemento + '\'' +
                '}';
    }
}
