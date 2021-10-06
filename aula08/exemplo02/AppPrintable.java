package exemplo02;

public class AppPrintable {
    public static void main(String[] args) {
        EscreverResposta resposta = new EscreverResposta();
        
        resposta.gravar(new EscritaArquivo());
}

}
