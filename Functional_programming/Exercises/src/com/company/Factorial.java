package com.company;

public class Factorial {

    int facR (int n){
        int result;
        if (n==1) return 1;
        result=facR(n-1)*n;
        return result;
    }

    // Esto es un equivalente iterativo
    int facI (int n){
        int t, result;

        result=1;
        for (t=1; t<=n; t++) result *=t;
        return result;
    }

}
