import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        GregorianCalendar calender = new GregorianCalendar();

        funcionario.validarDatadeNascimento(calender);

    }
}