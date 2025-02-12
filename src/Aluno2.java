public class Aluno2 {
    private String nome;
    private double notas;
    private int totalDeNotas = 0;

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas = notas;
        totalDeNotas++;
    }

    public double calcularMedia(){
        return notas / totalDeNotas;
    }
}
