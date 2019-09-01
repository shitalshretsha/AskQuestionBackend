package com.ask.questin.askquestion.Service;

import com.ask.questin.askquestion.Entity.QuestionAnswer;

import java.util.List;

public interface QstAnsService {
    String  insert(QuestionAnswer questionAnswer);

    QuestionAnswer getOne(long id);

    List<QuestionAnswer> getAll();
}
