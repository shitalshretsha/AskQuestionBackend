package com.ask.questin.askquestion.Repository;

import com.ask.questin.askquestion.Entity.QuestionAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionAnswerRepository extends JpaRepository<QuestionAnswer, Long> {
}
