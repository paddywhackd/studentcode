package com.techelevator;

public class Exercise04_HotelReservation {

    /*
    Innovator's Inn is a new hotel chain with two simple rates:
        $99.99 per night for stays of 1 or 2 nights
        $89.99 per night for stays of 3 nights or more
    The problems below ask you to implement the logic for determining a guest's total amount for their stay.
     */

    // You can use these constants in your solutions.
    private final double DAILY_RATE = 99.99;
    private final double DISCOUNT_RATE = 89.99;
    private final int MINIMUM_NIGHTS_FOR_DISCOUNT_RATE = 3;

    /*
    Using the rates from above, implement the logic to determine the total amount based on 
    the number of nights a guest stays.

    Examples:
    calculateStayTotal(1) ➔ 99.99
    calculateStayTotal(2) ➔ 199.98
    calculateStayTotal(3) ➔ 269.97
     */
    public double calculateStayTotal(int numberOfNights) {
        if (numberOfNights >= 3) {
            return (numberOfNights * DISCOUNT_RATE);
        } else
            return (numberOfNights * DAILY_RATE);


    }

    /*
    The owners of Innovator's Inn realized weekends are more popular than weekdays. Because of this, they've raised
    the rate for weekend night rates to $99.99 regardless of how many nights a guest is staying.
    If a guest is staying 3 or more nights, the weekday rate is still $89.99 per night. Otherwise, the $99.99 rate applies.
    Implement the logic to return the total amount of the stay based on the total number of nights and the number of weekend nights.
    NOTE: the numOfTotalNights parameter includes weekend nights.

    Examples:
    calculateStayTotal(2, 0) ➔ 199.98
    calculateStayTotal(2, 1) ➔ 199.98
    calculateStayTotal(3, 0) ➔ 269.97
    calculateStayTotal(3, 1) ➔ 279.97
    calculateStayTotal(3, 2) ➔ 289.97
     */

    /**
     * step
     * find week day nights = total - weekend nights
     * 2 find weekend nights = weeknights
     * 3 calc weekday charge = weekdaynights * weekday_charge_rate
     * 4 calc weeknight charge = weeknights * weeknight_charge_rate
     * 5 calc total charge = weeday charge + weeknight charge
     * 5 return total
     * @param numOfTotalNights
     * @param numOfWeekendNights
     * @return
     */
    public double calculateStayTotal(int numOfTotalNights, int numOfWeekendNights) {

        double total = 0;
//        * find week day nights = total - weekend nights
        int weekdaynights = numOfTotalNights - numOfWeekendNights;
//         * 2 find weekend nights = weeknights

//                * 3 calc weekday charge = weekdaynights * weekday_charge_rate
        double weekday_charge = weekdaynights *DAILY_RATE;
//                * 4 calc weeknight charge = weeknights * weeknight_charge_rate
        double weeknight_charge = numOfWeekendNights * DISCOUNT_RATE;
//                * 5 calc total charge = weeday charge + weeknight charge
        total = weekday_charge + weeknight_charge;
//                * 5 return total

        return total;
    }

    /*
    Innovator's Inn continues to grow in popularity and now offers a rewards program to its customers.
    If a guest is a member of the rewards program, they get a rate of $89.99 per night regardless of the number of nights and weekends.
    Otherwise, the rates for weekday and weekend nights apply as described in the previous problem.
    Now implement the logic to return the total amount of a guest's stay based on
    the total number of nights, the number of weekend nights, and if the guest is a member of the rewards program.
    NOTE: the numOfTotalNights parameter includes weekend nights.

    Examples:
    calculateStayTotal(2, 0, false) ➔ 199.98
    calculateStayTotal(2, 0, true) ➔ 179.98
    calculateStayTotal(3, 0, true) ➔ 269.97
    calculateStayTotal(3, 1, true) ➔ 269.97
     */
    public double calculateStayTotal(int numOfTotalNights, int numOfWeekendNights, boolean isRewardsMember) {
        return 0;
    }
}
