package com.example;

import java.util.ArrayList;

import java.lang.String;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MyClass {
    public static  void main(String[] args)
    {
        QuestionRet Q =new QuestionRet();
        Gson gson=new Gson();
        JsonObject Object=new JsonObject();
        JsonArray array=new JsonArray();

        JsonObject lan1=new JsonObject();
        lan1.addProperty("question","who are you");
        lan1.addProperty("date","20170101");
        lan1.addProperty("userId","000000");
        lan1.addProperty("questionId","000");
        lan1.addProperty("answerIds","111111");
        array.add(lan1);

        JsonObject lan2=new JsonObject();
        lan2.addProperty("question","who are you");
        lan2.addProperty("date","20170101");
        lan2.addProperty("userId","000000");
        lan2.addProperty("questionId","000");
        lan2.addProperty("answerIds","111111");
        array.add(lan2);

        Object.add("information",array);
        String S=Object.toString();
        System.out.println(S);
        //String jsonData = response.body().string();
        JsonObject jsonObject = new JsonParser().parse(S).getAsJsonObject();
        JsonArray jsonArray=jsonObject.getAsJsonArray("information");

        ArrayList<QuestionRet> questionsRetArrayList=new ArrayList<>();
        String m=new String();
        for(JsonElement question :jsonArray)
        {
            QuestionRet questionsRet=gson.fromJson(question,new TypeToken<QuestionRet>() {}.getType());
            questionsRetArrayList.add(questionsRet);
        }
        System.out.print(m);
    }
}
