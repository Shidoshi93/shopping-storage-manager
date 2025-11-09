import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int tamanhoLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[tamanhoLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    public boolean insereLoja(Loja novaLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = novaLoja;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja) {
        String tipoDesejado = normalizarString(tipoLoja);
        int count = 0;

        for (Loja loja : lojas) {
            if (loja != null && tipoDesejado.equals(loja.getClass().getSimpleName().toLowerCase(Locale.ROOT))) {
                count++;
            }
        }

        return (count == 0) ? -1 : count;
    }

    public String normalizarString(String palavra) {
        if (palavra == null) {
            throw new IllegalArgumentException("Palavra não pode ser nulo");
        }

        String tipoLojaLowerCase = palavra.toLowerCase(Locale.ROOT);
        String tipoLojaSanitizado = Normalizer.normalize(tipoLojaLowerCase, Normalizer.Form.NFKD);
        Pattern padraoDiacritico = Pattern.compile("\\p{Mn}");
        String textoSemAcento = padraoDiacritico.matcher(tipoLojaSanitizado).replaceAll("");
        return textoSemAcento.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    public Informatica lojaSeguroMaisCaro() {
        Informatica lojaMaisCara = null;
        double seguroMaisAlto = -1;

        if (lojas.length == 0) {
            return null;
        }

        for (Loja loja : lojas) {
            if (loja instanceof Informatica informatica) {

                double seguroAtual = informatica.getSeguroEletronicos();

                if (seguroAtual > seguroMaisAlto) {
                    seguroMaisAlto = seguroAtual;
                    lojaMaisCara = informatica;
                }
            }
        }

        return lojaMaisCara;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Shopping: ").append(nome).append("\n");
        sb.append("Endereço: ").append(endereco).append("\n");
        sb.append("Lojas:\n");
        for (Loja loja : lojas) {
            if (loja != null) {
                sb.append(loja).append("\n");
            }
        }
        return sb.toString();
    }
}
