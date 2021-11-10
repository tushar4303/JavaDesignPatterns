package com.Strategy1.model;

import com.Strategy1.controller.ScoreAlgorithmBase;

public class Clown extends ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
         return (taps * multiplier) - 10;
    }
}
