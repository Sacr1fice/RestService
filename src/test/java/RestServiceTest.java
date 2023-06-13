package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/rest.csv")
    public void shouldCalcucaleExact(int expected, int income, int expences, int threshold) {
        RestService service = new RestService();
        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
