
//e) Em outra classe java, instancie dois objetos Aluno com notas diferentes. Para cada aluno, chame o método verificarSituacao() para ver se ele foi aprovado ou reprovado.
public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João", 01, 8,7,6);
        Aluno a2 = new Aluno("Juninho", 01, 8,7,6);

        a1.verificarSituacao();
        a2.verificarSituacao();

    }
}