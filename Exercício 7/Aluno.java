    // A) Criar uma classe para representar um aluno e suas notas. Atributos: nome, matrícula, nota1, nota2, notaTrabalho.
    
public class Aluno {
        // Atributos
         String nome;
         int matrícula;
         double nota1;
         double nota2;
         double notaTrabalho;
    
        //B) (Construtor) Crie um construtor que receba todos os dados (nome, matrícula e as três notas) para inicializar um objeto Aluno.
        public Aluno(String nome, int matrícula, double nota1, double nota2, double notaTrabalho) {
            this.nome = nome;
            this.matrícula = matrícula;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.notaTrabalho = notaTrabalho;
        }
    
        // Métodos
        //C) Crie um método calcularMedia() que retorna um double com a média aritmética das notas.
        public double calcularMedia() {
            double ValorMedia = (nota1 + nota2 + notaTrabalho) / 3;
            return ValorMedia;
        }
        //D) Crie um método verificarSituacao() que não retorna nada. Este método deve chamar o calcularMedia() e, com base no resultado, imprimir "APROVADO" se a média for 7 ou superior, e "REPROVADO" caso contrário.
        public void verificarSituacao() {
            double media = calcularMedia();
            if (media >= 7) {
                System.out.println("APROVADO");
            } else {
                System.out.println("REPROVADO");
            }
           }
}
