package com.company;

import java.math.BigInteger;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // pessoas
        Pessoa[] pessoas = new Pessoa[10];
        String[] nomes = {"roniscleidson", "joão", "fernando", "gustavo", "camila",
                            "mario", "leopoldina","carmem","robercleto","cleitinho" };

        for (int i = 0; i < pessoas.length; i++){

            String cpf = "3782417583"+String.valueOf(i);

            pessoas[i] = new Pessoa(cpf,nomes[i]);
        }

        // celulares
        Celular[] celulares = new Celular[10];
        String[] numeros = {"+5511987357185", "+5515987357198", "+5541987359861", "+5565987355261", "+5519898735361",
                            "+5527987357895", "+5535987357551", "+5543977357161", "+5569527357161", "+5514988937161" };

        for (int i = 0; i < pessoas.length; i++){

            String holder = String.format("%010d", i);

            celulares[i] = new Celular(numeros[i], holder);
        }

        SortUtil.sort(celulares);

        System.out.println("----- Celular -----");
        System.out.println(Arrays.toString(celulares));

    }
}
