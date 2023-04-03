public class Main {

    public static String inverterPalavras(String texto) {
        Pilha pilha = new Pilha(texto.length());
        StringBuilder resultado = new StringBuilder(texto.length());

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c != ' ') {
                pilha.empilhar(c);
            } else {
                while (!pilha.estaVazia()) {
                    resultado.append(pilha.desempilhar());
                }
                resultado.append(' ');
            }
        }

        while (!pilha.estaVazia()) {
            resultado.append(pilha.desempilhar());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String texto1 = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado1 = inverterPalavras(texto1);
        System.out.println(resultado1); 

        String texto2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG";
        String resultado2 = inverterPalavras(texto2);
        System.out.println(resultado2);
    }
}
