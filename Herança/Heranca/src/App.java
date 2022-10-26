public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno = new Aluno("John", "559.585.559-02", 11111);
        aluno.imprime();
        Professor professor = new Professor("Lucas", "1111111111", 3500.00f);
        professor.imprime();
    }
}
