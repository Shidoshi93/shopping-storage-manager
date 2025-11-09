public class Vestuario extends Loja{
    private boolean produtosImportados;

    public Vestuario(String nomeLoja, int qtdFuncionarios, double salarioBase, Endereco endereco, Data dataFundacao,
                     boolean produtosImportados, int tamanhoEstoque) {
        super(nomeLoja, qtdFuncionarios, salarioBase, endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "{"
                + "produtosImportados=" + produtosImportados
                + ", nomeLoja='" + this.getNome() + '\''
                + ", qtdFuncionarios=" + this.getQuantidadeFuncionarios()
                + ", salarioBase=" + this.getSalarioBaseFuncionario()
                + ", endereco=" + this.getEndereco()
                + ", dataFundacao=" + this.getDataFundacao()
                + '}';
    }
}
