package com.example.sweproject;

public class scoreReport {
    private String student_user;
    private String student_name;
    private float score;
    private String subject;

    public scoreReport(String student_user, String student_name, float score, String subject) {
        this.student_user = student_user;
        this.student_name = student_name;
        this.score = score;
        this.subject = subject;
    }

    public String getStudent_user() {
        return student_user;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getSubject() {
        return subject;
    }

    public float getScore() {
        return score;
    }
}

