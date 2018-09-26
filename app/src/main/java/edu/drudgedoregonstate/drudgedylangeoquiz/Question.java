package edu.drudgedoregonstate.drudgedylangeoquiz;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question {
    private int mQuestionId;
    private boolean mTrueOrFalse;

    Question(){

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
