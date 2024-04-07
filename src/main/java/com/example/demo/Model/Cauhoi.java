package com.example.demo.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cauhoi {
    private String content;
    private List<String> answer;

    private int correctAnsser;

    public Cauhoi() {
    }

    public Cauhoi(String content, List<String> answer, int correctAnsser) {
        this.content = content;
        this.answer = answer;
        this.correctAnsser = correctAnsser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }

    public int getCorrectAnsser() {
        return correctAnsser;
    }

    public void setCorrectAnsser(int correctAnsser) {
        this.correctAnsser = correctAnsser;
    }
    public static List<Cauhoi> getListCauHoi (){
        List<Cauhoi> ls = new ArrayList<>();
        String content = "Trong các loại động vật sau đây, loài nào là loài động vật thông minh nhất?";
        List<String> listAnser = new ArrayList<>(Arrays.asList("Vịt "," Cá heo","Gấu trúc","Khỉ"));
        ls.add(new Cauhoi(content,listAnser,1));
        String content1 = "Trong thế giới thần thoại Hy Lạp, ai là vị thần của biển cả?";
        List<String> listAnser1 = new ArrayList<>(Arrays.asList("Zeus","Poseidon","Athena","Apollo"));
        ls.add(new Cauhoi(content1,listAnser1,1));

        String content2 = "Nơi nào được coi là thủ đô của Italia?";
        List<String> listAnser2 = new ArrayList<>(Arrays.asList("Milano","Roma","Venice","Florence"));
        ls.add(new Cauhoi(content2,listAnser2,1));
        return ls;
    }
}

