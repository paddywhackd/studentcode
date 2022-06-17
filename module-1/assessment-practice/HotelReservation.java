import java.math.BigDecimal;

public class HotelReservation {
    

    

        String name;
        int numberOfNights;
        BigDecimal estimatedTotal;
        // BigDecimal dailyRate = BigDecimal.valueOf(59.99); // now inside constructor

        public HotelReservation(String name, int numberOfNights) {
            this.name = name;
            this.numberOfNights = numberOfNights;
            estimatedTotal = new BigDecimal(59.99).multiply(BigDecimal.valueOf(numberOfNights)); // constant
        }  // .multiply(big.... was added to convert the int (numberOfNights) to BigDecimal

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfNights() {
            return numberOfNights;
        }

        public void setNumberOfNights(int numberOfNights) {
            this.numberOfNights = numberOfNights;
        }

        public BigDecimal getEstimatedTotal() {
            return estimatedTotal;
        }

        public void setEstimatedTotal(BigDecimal estimatedTotal) {
            this.estimatedTotal = estimatedTotal;
        }

        public BigDecimal finalizedGrandTotal(boolean requiresCleaning, boolean usedMiniBar) {
            // BigDecimal grandTotal = null;
            //You don't want this set to null.
            BigDecimal grandTotal = BigDecimal.ZERO;
            BigDecimal cleaningFee = new BigDecimal(34.99);
            BigDecimal miniBarFee = new BigDecimal(12.99);
            BigDecimal cleaningFeeFactor = new BigDecimal("2");

            if (requiresCleaning && usedMiniBar) {
                grandTotal = cleaningFee
                        .multiply(cleaningFee)
                        .add(miniBarFee); // (cleaning fee*) + miniBarFee = grandTotol
            }

                return grandTotal;


        }
}
