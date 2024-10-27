package com.example.postfija;

import com.example.postfija.dinamicos.Pila;

public class CalculadoraService {
    public String convertirPostfija(String input) {
        Pila<String> ops = new Pila<>();
        Pila<String> postfija = new Pila<>();
        String[] caracteres = input.split(" ");

        for(String caracter: caracteres) {
            if(caracter.equals("(")) {
                ops.agregar(caracter);
            } else if(caracter.equals("+") || caracter.equals("-") || caracter.equals("*") || caracter.equals("/")) {

            }
        }
    }
}
