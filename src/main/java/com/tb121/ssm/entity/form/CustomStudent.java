package com.tb121.ssm.entity.form;

import com.tb121.ssm.entity.Score;
import com.tb121.ssm.entity.Student;

import java.util.List;
public class CustomStudent extends Student{


    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private List<Score> scores;

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }


}
