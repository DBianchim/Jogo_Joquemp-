/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.joquempo;

/**
 *
 * @author 202228319
 */
public class Jogada {
    
    private int jogada; // 0 -> Pedra, 1 -> Papel, 2 -> Tesoura

    public Jogada(int jogada) {
        this.jogada = jogada;
    }

    public int getJogada() {
        return jogada;
    }

    public void setJogada(int jogada) {
        this.jogada = jogada;
    }
    
    public String resultado(Jogada jAdversario){
        if(this.jogada == jAdversario.getJogada()){
            return "Empate";
        } 
        
        switch(this.jogada){
            case 0: // pedra
                return(jAdversario.getJogada() == 2) ? "Ganhou!" : "Nao foi desta vez!";
            case 1: // papel
                return(jAdversario.getJogada() == 0) ? "Ganhou!" : "Nao foi desta vez!";
            case 2: // tesoura
                return(jAdversario.getJogada() == 1) ? "Ganhou!" : "Nao foi desta vez!";
            default:
                return "Jogada invalida!";
        }

    }
    
}
