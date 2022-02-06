package com.bnta.robyn.week2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class exercise1Test {

    @Test
    void reverse() {
        //Given
        String input = "esoom";

        // When
        String actual = exercise1.reverse(input);

        //Then
        String expected = "moose";

        assertThat(actual).isEqualTo(expected);
    }
}