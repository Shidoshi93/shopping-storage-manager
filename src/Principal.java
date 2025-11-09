public class Principal {
    public static void main(String[] args) {

        boolean fimMenu = false;
        int opcao;

        while (!fimMenu) {
            System.out.println("Menu:");
            System.out.println("1 - Criar Loja");
            System.out.println("2 - Criar Produto");
            System.out.println("3 - Sair");

            opcao = Teclado.leInt("Digite a opção desejada: ");

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida.");
                continue;
            }

            if (opcao == 3) {
                System.out.println("Saindo...");
                fimMenu = true;
            }

            if (opcao == 1) {
                criarLoja();
            }

            if (opcao == 2) {
                criarProduto();
            }
        }
    }

    private static void criarLoja() {
        System.out.println("Criar Loja selecionado");
        String nomeLoja = Teclado.leString("Digite o nome da loja: ");
        int qtdFuncionarios = Teclado.leInt("Digite a quantidade de funcionários: ");
        double salarioBase = Teclado.leDouble("Digite o salário base dos funcionários: ");

        System.out.println("Digite o endereço da loja: ");
        String rua = Teclado.leString("Digite a rua: ");
        String numero = Teclado.leString("Digite o número: ");
        String estado = Teclado.leString("Digite o Estado: ");
        String cidade = Teclado.leString("Digite a cidade: ");
        String cep = Teclado.leString("Digite o CEP: ");
        String pais = Teclado.leString("Digite o país: ");
        String complemento = Teclado.leString("Digite o complemento: ");
        Endereco enderecoLoja = new Endereco(rua, cidade, estado, cep, pais, numero, complemento);

        String dataFundacao = Teclado.leString("Digite a data de fundação da loja: (dd/mm/aaaa): ");

        String[] dataQuebrada = dataFundacao.split("/");
        Data data = new Data(
                Integer.parseInt(dataQuebrada[0]),
                Integer.parseInt(dataQuebrada[1]),
                Integer.parseInt(dataQuebrada[2])
        );

        Loja loja = new Loja(nomeLoja, qtdFuncionarios, salarioBase, enderecoLoja, data, 10);

        System.out.println("Loja criada com sucesso!: " + loja);
    }

    private static void criarProduto() {
        System.out.println("Criar Produto selecionado.");
        String nomeProduto = Teclado.leString("Digite o nome do produto: ");
        double precoProduto = Teclado.leDouble("Digite o preço do produto: ");
        String dataValidade = Teclado.leString("Digite a data de validade do produto: (dd/mm/aaaa) ");

        String[] dataQuebrada = dataValidade.split("/");
        Data data = new Data(
                Integer.parseInt(dataQuebrada[0]),
                Integer.parseInt(dataQuebrada[1]),
                Integer.parseInt(dataQuebrada[2])
        );

        Produto produto = new Produto(nomeProduto, precoProduto, data);

        validaValidadeProduto(produto, data);
    }

    private static void validaValidadeProduto(Produto produto, Data data) {
        System.out.println("Verificando a validade do produto... ");

        if(produto == null || data == null) {
            throw new RuntimeException("Produto ou Data inválido");
        }

        if (produto.estaVencido(data)) {
            System.out.println("PRODUTO VENCIDO.");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO.");
        }
    }
}
