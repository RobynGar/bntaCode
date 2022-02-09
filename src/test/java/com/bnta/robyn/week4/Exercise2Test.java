package com.bnta.robyn.week4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void modeWhenOnlyMode() {
        // Given
        Exercise2 exercise2 = new Exercise2(); //Instance of the class
        String input = "2,5,2,5,8,5";
        // When
        List<String> actual= exercise2.mode(input);


        // Then
        List<String> expected = Arrays.asList("5");

        // when
        assertThat(actual).isEqualTo(expected);
    }
}