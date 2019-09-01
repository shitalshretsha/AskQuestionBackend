package com.ask.questin.askquestion.Service.ServiceImpl;

import com.ask.questin.askquestion.Entity.QuestionAnswer;
import com.ask.questin.askquestion.Repository.QuestionAnswerRepository;
import com.ask.questin.askquestion.Service.QstAnsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QstAnsServiceImpl implements QstAnsService{
    private QuestionAnswerRepository questionAnswerRepository;

    private QstAnsServiceImpl(QuestionAnswerRepository questionAnswerRepository){
        this.questionAnswerRepository = questionAnswerRepository;
    }
    @Override
    public String  insert(QuestionAnswer questionAnswer) {
        questionAnswerRepository.save(questionAnswer);
        return "success";
    }

    @Override
    public QuestionAnswer getOne(long id) {
        return questionAnswerRepository.findById(id).get();
    }


    @Override
    public List<QuestionAnswer> getAll() {
        List<QuestionAnswer> QandAList =questionAnswerRepository.findAll();
        return QandAList;
    }

}
