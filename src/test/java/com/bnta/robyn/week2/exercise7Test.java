package com.bnta.robyn.week2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class exercise7Test {

    @Test
    void shouldGiveYouTheLongestStringInArray() {
        //give
    String[] input = {"long", "longer", "longest"};
        //then
    String actual = exercise7.longest(input);
        //when
    String expected = "longest";
    assertThat(actual).isEqualTo(expected);
    }
    @Test
    void whenDuplicateShouldOnlyGiveYouLongestWordOnce() {
        //give
        String[] input = {"long", "longer", "longest", "longest"};
        //then
        String actual = exercise7.longest(input);
        //when
        String expected = "longest";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void whenSameLengthButDifferentWordShouldGiveBoth() {
        //give
        String[] input = {"long", "longer", "longest", "tongest"};
        //then
        String actual = exercise7.longest(input);
        //when
        String expected = "longest, tongest";
        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void whenGivenNullShouldGiveEmptyString() {
        //give
        String[] input = null;
        //then
        String actual = exercise7.longest(input);
        //when
        String expected = "";
        assertThat(actual).isEqualTo(expected);
    }

}