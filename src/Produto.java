import java.time.LocalDate;

public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto (String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public Data getDataValidade() {
        return this.dataValidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataValidade) {
        LocalDate validade = LocalDate.of(
                dataValidade.getAno(),
                dataValidade.getMes(),
                dataValidade.getDia());
        return validade.isBefore(LocalDate.now());
    }

    @Override
    public String toString() {
        return "{" +
                "nome:'" + nome + '\'' +
                ", preco:" + preco +
                ", dataValidade:" + dataValidade +
                '}';
    }
}