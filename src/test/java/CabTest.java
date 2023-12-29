import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.params.provider.Arguments.arguments;

import com.example.CabInvoice;

public class CabTest {
    static CabInvoice cabInvoice;

    @BeforeAll
    public static void init() {
        cabInvoice = new CabInvoice();
    }

    @ParameterizedTest
    @MethodSource("distanceAndTime")
    public void calculateFareTest(double distance, double time, double expected) {
        assertEquals(expected, cabInvoice.calculateFare(distance, time));
    }

    private static Stream<Arguments> distanceAndTime() {
        return Stream.of(
                arguments(0.2, 1, 5.0),
                arguments(20, 50, 250.0),
                arguments(0.1, 1, 5.0));
    }
}
