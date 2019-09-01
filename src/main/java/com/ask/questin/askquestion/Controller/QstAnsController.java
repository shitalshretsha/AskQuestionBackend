package com.ask.questin.askquestion.Controller;

import com.ask.questin.askquestion.Entity.QuestionAnswer;
import com.ask.questin.askquestion.Service.QstAnsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class QstAnsController {
    public QstAnsService qstAnsService;

    public QstAnsController(QstAnsService qstAnsService){
        this.qstAnsService = qstAnsService;
    }

    @RequestMapping(value = "/QstAns", method = RequestMethod.POST)
    public ResponseEntity<String> insert(@RequestBody QuestionAnswer questionAnswer) throws IOException{
        return  new ResponseEntity<String>(qstAnsService.insert(questionAnswer), HttpStatus.OK);
    }
    @GetMapping("/id")
    public ResponseEntity<QuestionAnswer> getOne(@PathVariable Long id) {
        QuestionAnswer qa = qstAnsService.getOne(id);
        return new ResponseEntity<QuestionAnswer>(qa, HttpStatus.OK);
    }

//    @GetMapping("/")
//    public ResponseEntity<List<>> getAll() {
//        List<>  = qstAnsService.getAll();
//        System.out.println();
//        return new ResponseEntity<List<>>(, HttpStatus.OK);
//    }
}
