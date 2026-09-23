public class pagamentoPix extends FormaPagamento{
    @Override
    public void processarPagamento() {
        IO.println("O seu pix foi realizado com sucesso! "
                + "\n o codigo da operação é : "
                + getcodigo()
                + "Data de Pagamento : "
                + getdataCriacao());
    }
}
