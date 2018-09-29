package edu.drudgedoregonstate.drudgedylangeoquiz;

public class Question {
    private int mQuestionId;
    private boolean mTrueOrFalse;

    public Question(int question, boolean trueOrFalse){
        mQuestionId = question;
        mTrueOrFalse = trueOrFalse;
    }


    public int getmQuestionId() {
        return mQuestionId;
    }

    public void setmQuestionId(int mQuestionId) {
        this.mQuestionId = mQuestionId;
    }

    public boolean ismTrueOrFalse() {
        return mTrueOrFalse;
    }

    public void setmTrueOrFalse(boolean mTrueOrFalse) {
        this.mTrueOrFalse = mTrueOrFalse;
    }
}
