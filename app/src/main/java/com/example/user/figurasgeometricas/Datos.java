package com.example.user.figurasgeometricas;

import java.util.ArrayList;



public class Datos {
   private static ArrayList<Resultado>resultados=new ArrayList<>();

    public static void guardar(Resultado r){
        resultados.add(r);
    }

    public static ArrayList<Resultado> getResultados() {
        return resultados;
    }
}
