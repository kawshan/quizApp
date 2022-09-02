package com.example.quizapp;

public class Question {
    private int answerResId;
    private boolean answeTrue;

    public Question(int answerResId, boolean answeTrue) {
        this.answerResId = answerResId;
        this.answeTrue = answeTrue;
    }

    public int getAnswerResId() {
        return answerResId;
    }

    public void setAnswerResId(int answerResId) {
        this.answerResId = answerResId;
    }

    public boolean isAnsweTrue() {
        return answeTrue;
    }

    public void setAnsweTrue(boolean answeTrue) {
        this.answeTrue = answeTrue;
    }
}
