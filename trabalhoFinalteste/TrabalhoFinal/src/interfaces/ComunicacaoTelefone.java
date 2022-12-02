package interfaces;

public interface ComunicacaoTelefone {
    public abstract void ligar(String telefone);
    public abstract void enviarSMS(String telefone, String sms);
}

