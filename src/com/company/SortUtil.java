package com.company;

public class SortUtil {

    public static <T> void sort(Precedente<T>[] arr){

        boolean troca = true;
        T aux;
        while (troca) {
            troca = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i].precedeA((T) arr[i + 1]) < 0) {
                    aux = (T) arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = (Precedente<T>) aux;
                    troca = true;
                }
            }
        }

    }


}
