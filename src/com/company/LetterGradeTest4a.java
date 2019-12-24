package com.company;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest4a {
    @org.junit.jupiter.api.Test
    void letterGradePartitionA() {
        assertEquals('A', LetterGrade.letterGrade(95));
    }

    @org.junit.jupiter.api.Test
    void letterGradePartitionB() {
        assertEquals('B', LetterGrade.letterGrade(85));
    }

    @org.junit.jupiter.api.Test
    void letterGradePartitionC() {
        assertEquals('C', LetterGrade.letterGrade(75));
    }

    @org.junit.jupiter.api.Test
    void letterGradePartitionD() {
        assertEquals('D', LetterGrade.letterGrade(65));
    }

    @org.junit.jupiter.api.Test
    void letterGradePartitionF() {
        assertEquals('F', LetterGrade.letterGrade(5));
    }

    @org.junit.jupiter.api.Test
    void letterGradePartitionX() {
        assertEquals('X', LetterGrade.letterGrade(-1));
        assertEquals('X', LetterGrade.letterGrade(101));
    }
}