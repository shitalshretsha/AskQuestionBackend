package com.ask.questin.askquestion.Service.ServiceImpl;

import com.ask.questin.askquestion.Entity.QuestionAnswer;
import com.ask.questin.askquestion.Entity.User;
import com.ask.questin.askquestion.Repository.QuestionAnswerRepository;
import com.ask.questin.askquestion.Repository.UserRepository;
import com.ask.questin.askquestion.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User insert(User user) {
        try {

            return userRepository.save(user);

        } catch (Exception e) {
            throw new RuntimeException("Fail" + e.getMessage());
        }

    }


}
