package com.thecloudthoughts.lambda.rest;

import java.util.Arrays;
import java.util.List;

import com.thecloudthoughts.lambda.entity.User;
import com.thecloudthoughts.lambda.model.Language;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageResource {



    @RequestMapping(path = "/languages", method = RequestMethod.GET)
    public List<Language> listLambdaLanguages() {

        return Arrays.asList(new Language("node"),
                new Language("java"),
                new Language("python"),
                new Language("go"),
                new Language("Pascal"),
                new Language("Native Language"),
                new Language("Ruby-Python"),
                new Language("Artificail Intelligence"),
                new Language("C++")
        );
    }


    @RequestMapping(path = "/addUser", method = RequestMethod.GET)
    public String addUser() {

  String message;

        try{

            message = "Successfull";
        }catch(Exception e) {
            message = "Failed";
        }


        return message;

    }

}