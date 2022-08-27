package festas;
public class FestaVip {


    private int quantidadedeCafe = 30;
    private int quantidadedeSalgados = 30;


    public void entrar()
    {
        beberCafe();
        comerSalgado();
        beberCafe();
    }
    
    private void beberCafe(){
        quantidadedeCafe = quantidadedeCafe - 1;
        System.out.println("bebeu uma xicara de café");
    }

    private void comerSalgado()
    {
        quantidadedeSalgados = quantidadedeSalgados - 5;
        System.out.println("Comeu 5 salgados");
    }
}
