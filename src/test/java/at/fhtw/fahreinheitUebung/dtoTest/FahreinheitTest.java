package at.fhtw.fahreinheitUebung.dtoTest;

import at.fhtw.fahreinheitUebung.dto.Fahreinheit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FahreinheitTest {

    @Test
    void fahreinheitberechnenTest() {
        double Value = Fahreinheit.fahreinheitberechnen(100.0);
        assertEquals(37.77777777777778,Value);
    }
}