package com.example.amodu.geoquiz;

/**
 * Created by amodu on 9/22/2016.
 */

class Question {
    private int mTestResId;
    private boolean mAnswerTrue;

    Question(int textResId, boolean answerTrue) {
        mTestResId = textResId;
        mAnswerTrue = answerTrue;
    }

    int getTestResId() {
        return mTestResId;
    }

    public void setTestResId(int testResId) {
        mTestResId = testResId;
    }

    boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
