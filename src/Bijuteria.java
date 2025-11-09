public class Bijuteria extends Loja {
    private double metaVendas;

    public Bijuteria(String nomeLoja, int qtdFuncionarios, double salarioBase, Endereco endereco, Data dataFundacao,
                     double metaVendas, int tamanhoEstoque) {
        super(nomeLoja, qtdFuncionarios, salarioBase, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return "{" +
                "metaVendas=" + metaVendas +
                ", nomeLoja='" + this.getNome() + '\'' +
                ", qtdFuncionarios=" + this.getQuantidadeFuncionarios() +
                ", salarioBase=" + this.getSalarioBaseFuncionario() +
                ", endereco=" + this.getEndereco() +
                ", dataFundacao=" + this.getDataFundacao() +
                '}';
    }
}
