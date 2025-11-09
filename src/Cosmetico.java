public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nomeLoja, int qtdFuncionarios, double salarioBase, Endereco endereco, Data dataFundacao,
                     double taxaComercializacao, int tamanhoEstoque) {
        super(nomeLoja, qtdFuncionarios, salarioBase, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "{" +
                "taxaComercializacao=" + taxaComercializacao +
                ", nomeLoja='" + this.getNome() + '\'' +
                ", qtdFuncionarios=" + this.getQuantidadeFuncionarios() +
                ", salarioBase=" + this.getSalarioBaseFuncionario() +
                ", endereco=" + this.getEndereco() +
                ", dataFundacao=" + this.getDataFundacao() +
                '}';
    }
}
