void main() {
    pagamentoPix pix = new pagamentoPix();
    // Ou FormaPagamento pix = new pagamentoPix()
    IO.println("\n------------------PAGAMENTO PIX--------------\n");

    pix.processarPagamento();
    pix.processarPagamento();

    IO.println("\n------------------PAGAMENTO BOLETO--------------\n");

    Boleto boleto = new Boleto();
    boleto.processarPagamento();
    boleto.processarPagamento();
}