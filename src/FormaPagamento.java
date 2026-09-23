import java.time.LocalDate;

public abstract class FormaPagamento {

    private int codigo;
    private LocalDate dataCriacao;

    public FormaPagamento() {
        this.dataCriacao = LocalDate.now();//pega data de agora(do momento do pagamento).
    }
    public int getcodigo() {
        codigo += 1;
        return codigo;
    }
    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    public LocalDate getdataCriacao(){
        return dataCriacao;
    }
    public void setdataCriacao(LocalDate dataCriacao){
        this.dataCriacao = dataCriacao;
    }
    public abstract void processarPagamento();
}
