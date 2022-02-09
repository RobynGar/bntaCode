package com.bnta.robyn.week4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void modeWhenOnlyOneModeAndTheModeIsNotFirstElementInString() {
        // Given
        Exercise2 exercise2 = new Exercise2(); //Instance of the class
        String input = "1,4,1,4,4,4";
        // When
        List<String> actual= exercise2.mode(input); //calling method from the class


        // Then
        List<String> expected = Arrays.asList("4");

        // when
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void modeWhenOnlyOneModeAndTheModeIsFirstElementInString() {
        // Given
        Exercise2 exercise2 = new Exercise2(); //Instance of the class
        String input = "1,4,1,1,1,4";
        // When
        List<String> actual= exercise2.mode(input);


        // Then
        List<String> expected = Arrays.asList("1");

        // when
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void modeWhenMoreThanOneMode() {
        // Given
        Exercise2 exercise2 = new Exercise2(); //Instance of the class
        String input = "1,4,1,4,4,1";
        // When
        List<String> actual= exercise2.mode(input);


        // Then
        List<String> expected = Arrays.asList("1", "4");

        // when
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void modeWhenStringIsEmpty() {
        // Given
        Exercise2 exercise2 = new Exercise2(); //Instance of the class
        String input = "";
        // When
        List<String> actual= exercise2.mode(input);


        // Then
        List<String> expected = Arrays.asList();

        // when
        assertThat(actual).isEqualTo(expected);
    }

    
}