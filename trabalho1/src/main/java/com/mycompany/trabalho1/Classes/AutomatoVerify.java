package com.mycompany.trabalho1.Classes;

import java.util.ArrayList;

/**
 *
 * @author PedroTxr
 */
public class AutomatoVerify {

    private ArrayList<Transicao> transicoes;
    private ArrayList<Integer> finais;
    private int estadoAtual;

    public AutomatoVerify(ArrayList<Transicao> transicoes, ArrayList<Integer> finais) {
        this.transicoes = transicoes;
        this.finais = finais;
        this.estadoAtual = 0;
    }

    public void executar(String entrada) {
        char[] letras = entrada.toCharArray();

        for (int i = 0; i < letras.length; i++) {
            char letra = letras[i];
            if (!processarLetra(letra)) {
                System.out.printf("Nao ha transicao para " + letra + " a partir do estado " + estadoAtual + ".");
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
        
        boolean aceito = finais.contains(estadoAtual);
        
        if (aceito) {
            System.out.println("A palavra foi aceita pela linguagem!");
        } else {
            System.out.println("A palavra **NAO** foi aceita pela linguagem.");
        }
    }
}
