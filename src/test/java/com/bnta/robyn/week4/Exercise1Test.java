package com.bnta.robyn.week4;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {

    @Test
    void check() {
        // Given
        Exercise1 exercise1 = new Exercise1(); //Instance of the class
        String input = "2,5,2,5,8,5";
        // When
         HashMap actual= exercise1.check(input);


        // Then
        HashMap<String, Integer> expected = new HashMap<>();
        expected.put("2", 2);
        expected.put("5", 3);
        expected.put("8", 1);

        assertThat(actual).isEqualTo(expected);
    }
}