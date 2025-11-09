public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nomeLoja, int qtdFuncionarios, double salarioBase, Endereco endereco, Data dataFundacao,
                       Data dataAlvara, int tamanhoEstoque) {
        super(nomeLoja, qtdFuncionarios, salarioBase, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    @Override
    public String toString() {
        return "{" +
                "dataAlvara=" + dataAlvara +
                ", nomeLoja='" + this.getNome() + '\'' +
                ", qtdFuncionarios=" + this.getQuantidadeFuncionarios() +
                ", salarioBase=" + this.getSalarioBaseFuncionario() +
                ", endereco=" + this.getEndereco() +
                ", dataFundacao=" + this.getDataFundacao() +
                '}';
    }
}
