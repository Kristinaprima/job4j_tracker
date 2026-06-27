package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void MaxTwoNumber() {
        int first = 10;
        int second = 5;
        Max max = new Max();
        int result = max.max(first, second);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void MaxThreeNumbers() {
        int first = 10;
        int second = 5;
        int third = 11;
        Max max = new Max();
        int result = max.max(first, second, third);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void MaxFourNumbers() {
        int first = 10;
        int second = 5;
        int third = 11;
        int fourth = 21;
        Max max = new Max();
        int result = max.max(first, second, third, fourth);
        int expected = 21;
        assertThat(result).isEqualTo(expected);
    }
}