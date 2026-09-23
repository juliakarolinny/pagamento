import java.time.LocalDate;

public class Boleto extends FormaPagamento {

    private LocalDate dataVencimento;

    public LocalDate getdataVencimento() {
        return dataVencimento = getdataCriacao().plusDays(10);
    }

    @Override
    public void processarPagamento() {
        IO.println("O seu boleto foi gerado com sucesso!"
                + "\n o codigo da operação é : "
                + getcodigo()
                + "\nData de criação : "
                +  getdataCriacao()
                + "\nData de Vencimento é : "
                + getdataVencimento()
        );
    }
}
