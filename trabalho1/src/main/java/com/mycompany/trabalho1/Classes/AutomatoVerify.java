package com.mycompany.trabalho1.Classes;

import java.util.Arrays;

/**
 *
 * @author PedroTxr
 */
public class AutomatoVerify {

    private Transicao[] transicoes;
    private Integer[] finais;
    private int estadoAtual;

    public AutomatoVerify(Transicao[] transicoes, Integer[] finais) {
        this.transicoes = transicoes;
        this.finais = finais;
        this.estadoAtual = 0;
    }

    public void executar(String entrada) {
        char[] letras = entrada.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            char letra = letras[i];
            if (!processarLetra(letra)) {
                System.out.printf("Nao ha transiçao para " + letra + "  a partir do estado" + estadoAtual);
                return;
            }

            if (i == letras.length - 1) {
                verificarEstadoFinal();
            }
        }
    }

    private boolean processarLetra(char letra) {    //Se a origem da transição for igual ao estado atual, e a letra for correspondente, vamos para o próximo
        for (Transicao transitions : transicoes) {
            if (transitions.getOrigem() == estadoAtual && transitions.getLetra() == letra) {
                estadoAtual = transitions.getDestino();
                return true;
            }
        }
        return false;
    }

    private void verificarEstadoFinal() {
        System.out.println("Chegou na ultima letra!");
        boolean aceito = Arrays.stream(finais).anyMatch(f -> f == estadoAtual); //Arrays.stream(finais).anyMatch(f -> f == estadoAtual); (Equivalente ao for) 

        if (aceito) {
            System.out.println("A sequencia e compativel com esse automato.");
        } else {
            System.out.println("A sequencia **nao** e compativel com esse automato.");
        }
    }
}
