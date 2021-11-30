package com.example;

public class Alice {
    public Integer g;
    public Integer p;
    private Integer a; //prime number
    private Integer _a;
    public Integer _b;
    public Integer secretKey;

    public Alice(Integer g, Integer p) {
        this.g = g;
        this.p = p;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer sendToBob() {
        return _a;
    }

    public Integer calculateRemainderOfTheDivision() {
        _a = (int) (Math.pow(g, a) % p);
        return _a;
    }

    public Integer calculateSecretKey() {
        secretKey = (int)(Math.pow(_b, a) % p);
        return secretKey;
    }
}
