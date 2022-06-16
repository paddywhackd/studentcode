import java.math.BigDecimal;

public class bookedRoom {


    String name;
    int numberOfNights;
    BigDecimal estimatedTotal =  new BigDecimal(numberOfNights).multiply(BigDecimal.valueOf(59.99));

}
