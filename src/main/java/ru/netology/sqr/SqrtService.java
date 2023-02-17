package ru.netology.sqr;

public class SqrtService {

    public int calcSqrt(int min, int max) {
        int squaresQuantity = 0;
        for (int i = 10; i <= 99; i++) {
            int iSquare = i * i;
            if (iSquare >= min) {
                if (iSquare <= max) {
                    squaresQuantity++;
                }
            }
        }
        return squaresQuantity;
    }
}
