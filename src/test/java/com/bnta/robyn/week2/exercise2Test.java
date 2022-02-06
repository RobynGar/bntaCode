package com.bnta.robyn.week2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class exercise2Test {

    @Test
    void transformSentence() {
        //given
        String input = "   b ri   ght net   work  ";
        //when
        String actual = exercise2.transformSentence(input);
        //then
        String expected = "Bright Network";
        assertThat(actual).isEqualTo(expected);
    }
}