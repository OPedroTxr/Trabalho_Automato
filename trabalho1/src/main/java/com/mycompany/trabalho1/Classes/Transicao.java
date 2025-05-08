/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho1.Classes;

/**
 *
 * @author Gabeews
 */
public class Transicao {
    
    private int origem;
    private char letra;
    private int destino;

    public Transicao() {
        this.origem = 0;
        this.letra = ' ';
        this.destino = 0;
    }

    public Transicao(int origem, char letra, int destino) {
        this.origem = origem;
        this.letra = letra;
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Transicao{" + "origem=" + origem + ", letra=" + letra + ", destino=" + destino + '}';
    }
    
    public int getOrigem() {
        return origem;
    }

    public void setOrigem(int origem) {
        this.origem = origem;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }
    
    
    
}
