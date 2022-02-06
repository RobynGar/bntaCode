package com.bnta.robyn.week2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class exercise4Test {

    @Test
    void isItPrimeWhenGivenPrimeNumber() {
        //given
        int input = 229;
        //when
        boolean actual = exercise4.prime(input);
        //then
        boolean expected = true;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void isItPrimeWhenNotPrimeNumber() {
        //given
        int input = 110;
        //when
        boolean actual = exercise4.prime(input);
        //then
        boolean expected = false;
        assertThat(actual).isEqualTo(expected);
    }
}