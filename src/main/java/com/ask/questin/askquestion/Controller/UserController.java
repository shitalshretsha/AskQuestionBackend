package com.ask.questin.askquestion.Controller;

import com.ask.questin.askquestion.Dto.LoginDto;
import com.ask.questin.askquestion.Entity.User;
import com.ask.questin.askquestion.Repository.UserRepository;
import com.ask.questin.askquestion.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin
@RestController
public class UserController {
    UserRepository userRepository;
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<User> insert(@RequestBody User user) throws IOException {
        //try {

        return new ResponseEntity<User>(userService.insert(user), HttpStatus.OK);

//        }catch (Exception e){
//            return new ResponseEntity<User>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }

    @RequestMapping(value = "/userlogin", method = RequestMethod.POST)
    public ResponseEntity<User> insert(@RequestParam String userName, @RequestParam String password) throws IOException {
        User response = userRepository.findByUserNameAndPassword(userName, password);
        return new ResponseEntity<User>(response,HttpStatus.OK);
    }
}
