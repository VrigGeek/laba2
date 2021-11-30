package com.example;

public class Bob {
    public Integer g;
    public Integer p;
    private Integer b; //prime number
    private Integer _b;
    public Integer _a;
    public Integer secretKey;

    public Bob(Integer g, Integer p) {
        this.g = g;
        this.p = p;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer sendToAlice() {
        return _b;
    }

    public Integer calculateRemainderOfTheDivision() {
        _b = (int) (Math.pow(g, b) % p);
        return _b;
    }

    public Integer calculateSecretKey() {
        secretKey = (int) (Math.pow(_a, b) % p);
        return secretKey;
    }
}
