public class Dvd {
    private Artistas artistaDoDvd;
    private String generoDoDvd;
    private String nomeDoDvd;
    private String studioGravadora;
    private int IdDoDvd;
    private int anoDoDvd;
    private Double preco;

    public Artistas getAutor() {
        return artistaDoDvd;
    }

    public String getTitulo() {
        return nomeDoDvd;
    }

    public String getGenero() {
        return generoDoDvd;
    }

    public String getGravadora() {
        return studioGravadora;
    }

    public void setAutor(Artistas artistaDoDvd) {
        this.artistaDoDvd = artistaDoDvd;
    }

    public void setTitulo(String nomeDoDvd) {
        this.nomeDoDvd = nomeDoDvd;
    }

    public void setCodigo(int IdDoDvd) {
        this.IdDoDvd = IdDoDvd;
    }

    public void setAno(int anoDoDvd) {
        this.anoDoDvd = anoDoDvd;
    }

    public void setGenero(String generoDoDvd) {
        this.generoDoDvd = generoDoDvd;
    }

    public void setValor(Double preco) {
        this.preco = preco;
    }

    public void setGravadora(String studioGravadora) {
        this.studioGravadora = studioGravadora;
    }

    public int getCodigo() {
        return IdDoDvd;
    }

    public int getAno() {
        return anoDoDvd;
    }

    public Double getValor() {
        return preco;
    }

    @Override
    public String toString() {
        return "\nDVD: "
                + artistaDoDvd
                + "\nTítulo: '"
                + nomeDoDvd
                + '\''
                + "\nCódigo: "
                + IdDoDvd
                + "\nAno: "
                + anoDoDvd
                + "\nGênero: '"
                + generoDoDvd
                + '\n'
                + "\nValor: "
                + preco
                + "\nGravadora: '"
                + studioGravadora
                + '\n';
    }
}