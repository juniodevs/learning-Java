public class ContaDeLuz {
    private String idDaConta;
    private int dataDaLeitura;
    private int faturaVencimento;
    private int qntKwGasto;
    private double precoDaFatura;
    private boolean contaFoiPaga;
    private boolean foiPagaNoPrazo;

    public ContaDeLuz(String idDaConta, int dataDaLeitura, int qntKwGasto, double precoDaFatura, int faturaVencimento, boolean foiPagaNoPrazo, boolean contaFoiPaga) {
        this.idDaConta = idDaConta;
        this.dataDaLeitura = dataDaLeitura;
        this.qntKwGasto = qntKwGasto;
        this.precoDaFatura = precoDaFatura;
        this.faturaVencimento = faturaVencimento;
        this.foiPagaNoPrazo = foiPagaNoPrazo;
        this.contaFoiPaga = contaFoiPaga;
    }
    
    public int getLeitura() {
        return dataDaLeitura;
    }
    public int getQntKw() {
        return qntKwGasto;
    }
    public int getVencimentoFatura() {
        return faturaVencimento;
    }
    public boolean contaFoiPaga() {
        return contaFoiPaga;
    }
    public boolean isFoiPagaEmDias() {
        return foiPagaNoPrazo;
    }
    public void setPaga(boolean contaFoiPaga) {
        this.contaFoiPaga = contaFoiPaga;
    }
    public void setPagoEmDias(boolean foiPagaNoPrazo) {
        this.foiPagaNoPrazo = foiPagaNoPrazo;
    }
    public void setDataDaLeitura(int dataDaLeitura) {
        this.dataDaLeitura = dataDaLeitura;
    }
    public void setidCodeConta(String idDaConta) {
        this.idDaConta = idDaConta;
    }
    public void setKwGasto(int qntKwGasto) {
        this.qntKwGasto = qntKwGasto;
    }
    public void setDataVencimento(int faturaVencimento) {
        this.faturaVencimento = faturaVencimento;
    }
    public void setPrecoDaConta(double precoDaFatura) {
        this.precoDaFatura = precoDaFatura;
    }
    public double getPrecoDaConta() {
        return precoDaFatura;
    }
    public String getIDCodeConta() {
        return idDaConta;
    }

    @Override
        public String toString(){
            String Final =  this.contaFoiPaga() ? "\nFatura paga no Prazo " + this.isFoiPagaEmDias() :"" ;  
        return "Dia/Mes/Ano da Leitura: " + this.getLeitura() +
                "\nDia/Mes/Ano do Vencimento: " + this.getVencimentoFatura() +
                "\nQauntidade de Kw Gasto: " + this.getQntKw() +
                "\nCodigo/id da Fatura: " + this.getIDCodeConta() +
                "\nValor da Fatura: R$ " + this.getPrecoDaConta() +
                "\nFatura paga? " + this.contaFoiPaga() +
                Final ;
        }
}
