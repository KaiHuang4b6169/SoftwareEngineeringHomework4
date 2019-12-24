package com.company;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest4b {
    @org.junit.jupiter.api.Test
    void letterGradeBoundary100 () {
        assertEquals('X', LetterGrade.letterGrade(101));
        assertEquals('A', LetterGrade.letterGrade(100));
    }

    @org.junit.jupiter.api.Test
    void letterGradeBoundary90() {
        assertEquals('A', LetterGrade.letterGrade(99));
        assertEquals('A', LetterGrade.letterGrade(90));
    }

    @org.junit.jupiter.api.Test
    void letterGradeBoundary80() {
        assertEquals('B', LetterGrade.letterGrade(89));
        assertEquals('B', LetterGrade.letterGrade(80));
    }

    @org.junit.jupiter.api.Test
    void letterGradeBoundary70() {
        assertEquals('C', LetterGrade.letterGrade(79));
        assertEquals('C', LetterGrade.letterGrade(70));
    }

    @org.junit.jupiter.api.Test
    void letterGradeBoundary60() {
        assertEquals('D', LetterGrade.letterGrade(69));
        assertEquals('D', LetterGrade.letterGrade(60));
    }

    @org.junit.jupiter.api.Test
    void letterGradeBoundary0() {
        assertEquals('F', LetterGrade.letterGrade(59));
        assertEquals('F', LetterGrade.letterGrade(0));
        assertEquals('X', LetterGrade.letterGrade(-1));
    }
}