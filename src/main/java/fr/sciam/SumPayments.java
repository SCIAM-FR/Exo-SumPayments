package fr.sciam;

import java.math.BigDecimal;
import java.util.List;

public class SumPayments {

    // TODO
    public static BigDecimal sumNonFeePayments(List<Payment> payments) {
        throw new UnsupportedOperationException("not implemented yet");
    }

    private record Payment(BigDecimal amount, boolean isFee) {
    }

}
