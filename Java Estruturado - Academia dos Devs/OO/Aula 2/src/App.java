public class App {
    public static void main(String[] args) throws Exception {
    
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.level = 2;
        heroi.forca = 16;
        heroi.HP = 100;
        // "Personagems: <nome> (lvl <nivel>) com <forca> de força"
        
        heroi.mostrarStatus();
        heroi.atacar("Chutulhu", "Adaga");
        heroi.atacar("John", "");
    }
}
