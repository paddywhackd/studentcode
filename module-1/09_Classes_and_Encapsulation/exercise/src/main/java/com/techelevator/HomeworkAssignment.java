package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        double score = earnedMarks / (double)possibleMarks;
        if(score >= 0.9) {
            return "A";
        } else if(score >= 0.8) {
            return "B";
        } else if(score >= 0.7) {
            return "C";
        } else if(score >= 0.6) {
            return "D";
        } else {
            return "F";
        }
    }
    public int getEarnedMarks() {
        return earnedMarks;
    }
    public int getPossibleMarks() {
        return possibleMarks;
    }
    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

}