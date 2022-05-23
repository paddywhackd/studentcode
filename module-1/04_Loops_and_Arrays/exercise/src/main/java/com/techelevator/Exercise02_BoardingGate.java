package com.techelevator;

public class Exercise02_BoardingGate {
    /*
    Local Jetways is a regional airline operating at local airports.
    They use a basic passenger manifest to represent seat occupancy on their plane.
        Each passenger seat is represented as an element in a boolean array.
        A value of TRUE indicates that seat is currently available.
        A value of FALSE indicates the seat is not available.
     */

    /*
    A nearby airport has an incoming flight from Local Jetways. As the passengers disembark, the gate
    attendant's first responsibility is to generate a new seating chart with each seat initially available.

    Implement the logic to generate a seating chart using the required number of seats. Make sure to indicate
    that each seat is initially available (TRUE).

    Note: The number of seats is guaranteed not to be negative.

    Examples:
    generateSeatingChart(7) → [true, true, true, true, true, true, true]
    generateSeatingChart(5) → [true, true, true, true, true]
    generateSeatingChart(2) → [true, true]
     */
    public boolean[] generateSeatingChart(int numberOfSeats) {
        boolean[] isThisSeatTakenMaam = new boolean[numberOfSeats];

        for (int i = 0; i < numberOfSeats; i++)

            isThisSeatTakenMaam[i] = true;


        return isThisSeatTakenMaam;
    }


    /*
    Once passengers begin boarding the plane, gate attendants need a way to determine how many available
    seats there are on the plane.

    Using the array provided, implement the logic to count the number of available seats in the seating chart.
    A seat is available if the value is TRUE.

    Examples:
    getAvailableSeatCount([true, false, false, false]) → 1
    getAvailableSeatCount([false, false, false, false, false, false]) → 0
    getAvailableSeatCount([true, true, true, false]) → 3
    getAvailableSeatCount([]) → 0

     they are asking to run through each seat in a row and return whether or not that seat is available using a boolean.
     because my availableSeatCount is a whole number it'll be represented by an integer.
     seatingChart would relate to the total amount of seats(unkown) hence why i need to express seatingChart.length
     starting at index spot 0, check to see if every seat is available going up by 1 after returning a true or false
     depending on whether or not that seat is available.
     */
    public int getAvailableSeatCount(boolean[] seatingChart) {
        int musicalChairs = 0;
        for (int i = 0; i < seatingChart.length; i++) {
            if (seatingChart[i])
                musicalChairs++;
        }

        return musicalChairs;
    }

    /*
    The crew determined that it would be nice to know how many rows on the plane are at full occupancy.
    Each row has three seats and a row is at full occupancy if all three seats have someone sitting in them.

    Using the boolean array, implement the logic to count the number of full rows on the plane.
    Note: A new row starts at every third element. For example, row one begins with index 0, row two begins with index 3, and so on.

    Examples:
    getNumberOfFullRows([false, false, false, true, true, true]) → 1
    getNumberOfFullRows([true, true, true, true, true, true]) → 0
    getNumberOfFullRows([false, true, true, false, true, true]) → 0
     */
    public int getNumberOfFullRows(boolean[] seatingChart) {return 0;
    }

}
