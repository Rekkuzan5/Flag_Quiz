package com.example.flagquiz;

public class QuestionBank {

    public String questions [] = {
            "US",
            "Japan",
            "Australia",
            "Australia",
            "Australia",
            "Australia",
            "Australia",
            "Australia",
            "Australia",
            "Australia",
            "Australia",
    };

    private String choices [][] = {
            {"China", "US", "Canada"},
            {"Mexico", "Scotland", "Peru"},
            {"Bulgaria", "Germany", "Sweden"},
            {"China", "US", "Canada"},
            {"Japan", "New Zealand", "Thailand"},
            {"Egypt", "Scotland", "Russia"},
            {"Canada", "Peru", "Germany"},
            {"India", "Sweden", "Iceland"},
            {"Bulgaria", "Russia", "US"},
            {"Egypt", "India", "Canada"},
            {"Egypt", "India", "Canada"},
    };

    private String correctAnswers [] = {"US", "Peru", "Sweden", "Canada", "Japan", "Egypt", "Germany", "Iceland", "Bulgaria", "India", "India"};

// need to somehow get these to be flags instead of strings
    public String getQuestion(int a) {
            String questionA = questions[a];
            return questionA;
    }

    public String getChoice1(int b) {
        String choice1 = choices[b][0];
        return choice1;
    }

    public String getChoice2(int c) {
        String choice2 = choices[c][1];
        return choice2;
    }

    public String getChoice3(int d) {
        String choice3 = choices[d][2];
        return choice3;
    }

    public String correctAnswer(int e) {
        String answer = correctAnswers[e];
        return answer;
    }

}
