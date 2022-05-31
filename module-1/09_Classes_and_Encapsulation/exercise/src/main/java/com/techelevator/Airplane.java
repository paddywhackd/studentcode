package com.techelevator;

public class Airplane {
       private int totalFirstClassSeats;
       private int totalCoachSeats;
       private String planeNumber;
       private int bookedFirstClassSeats = 0;
       private int bookedCoachSeats = 0;

        public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
            this.planeNumber = planeNumber;
            this.totalCoachSeats = totalCoachSeats;
            this.totalFirstClassSeats = totalFirstClassSeats;

        }
        public int getTotalFirstClassSeats() {
            return totalFirstClassSeats;
        }
        public int getTotalCoachSeats() {
            return totalCoachSeats;
        }
        public String getPlaneNumber() {
            return planeNumber;
        }
        public int getBookedFirstClassSeats() {
            return bookedFirstClassSeats;
        }
        public int getBookedCoachSeats() {
            return bookedCoachSeats;
        }
        public int getAvailableFirstClassSeats() {
            return totalFirstClassSeats - bookedFirstClassSeats;
        }
        public int getAvailableCoachSeats() {
            return totalCoachSeats - bookedCoachSeats;
        }
        public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
           if(forFirstClass && getAvailableFirstClassSeats() >= totalNumberOfSeats) {
               bookedFirstClassSeats += totalNumberOfSeats;
               return true;
           } else if (!forFirstClass && getAvailableCoachSeats() >= totalNumberOfSeats) {
               bookedCoachSeats += totalNumberOfSeats;
                return true;
           }
           return false;
        }





}
