package com.example;

/**
 * Created by Denny on 2017/11/12.
 */

public class QuestionRet {
    String question;
    String date;
    String userId;
    String questionId;
    String answerIds;

    public void setQuestion(String question) {this.question=question;}
    public void setDate(String data) {this.date=data;}
    public void setUserid(String userid) {this.userId=userid;}
    public void setQuestionId(String questionId) {this.questionId=questionId;}
    public  void setAnswerIds(String answerids) {this.answerIds=answerids;}
    public String getQuestion()
    {
        return question;
    }
    public String getDate()
    {
        return date;
    }
    public String getUserId()
    {
        return userId;
    }
    public String getQuestionId ()
    {
        return questionId;
    }
    public String getAnswerIds()
    {
        return answerIds;
    }

    public String toString()
    {
        return  question+" "+questionId+" "+userId+" "+answerIds+" "+date;
    }
}
