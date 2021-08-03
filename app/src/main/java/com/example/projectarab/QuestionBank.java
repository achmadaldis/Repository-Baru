package com.example.projectarab;

import androidx.appcompat.app.AppCompatActivity;

public class QuestionBank extends AppCompatActivity {

    private String textQuestions [] = {
            "1. Siapa Nama Menteri Pendidikan dan Kebudayaan?",
            "2. Siapa Presiden Pertama Indonesia?",
            "3. Siapa Presiden Indonesia Sekarang?",
            "4. Apa Nama Ibukota Indonesia?",
            "5. Jika Tahun ini 2020,maka Tahun depan?"

    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"Nadiem Makarim", "Sri Mulyani", "dr Terawan", "Edhy Prabowo"},
            {"Soeharto", "Jokowi", "SBY", "Ir Soekarno"},
            {"Megawati", "Prabowo", "Bj Habibi", "Jokowi"},
            {"Palembang", "Bandung", "Jakarta", "Surabaya"},
            {"1999", "2022", "2010", "2021"}
    };

    private String mCorrectAnswers[] = {"Nadiem Makarim", "Ir Soekarno", "Jokowi", "Jakarta", "2021"};

    public int getLength(){
        return textQuestions.length;
    }

    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}