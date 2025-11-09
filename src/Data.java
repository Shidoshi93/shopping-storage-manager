public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!validadorData(dia, mes, ano)) {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            throw new IllegalArgumentException("Data inválida");
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private boolean validadorData(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasNoMes = {31, (verificaAnoBissexto() ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return dia <= diasNoMes[mes - 1];
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
