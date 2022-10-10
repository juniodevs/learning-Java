public class Artistas {
    private String artista;
    private boolean solo;

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setSoloArtista(boolean solo) {
        this.solo = solo;
    }

    public String getArtista() {
        return artista;
    }

    public String soloToString() {
        String soloToStringVar;
        if (solo == true) {
            soloToStringVar = "Sim";
        } else {
            soloToStringVar = "Não";
        }
        return soloToStringVar;

    }

    public boolean isSolo() {
        return solo;
    }

    @Override
    public String toString() {
        return "\nArtista: '"
                + artista
                + '\''
                + "\nSolo: "
                + soloToString();
    }
}