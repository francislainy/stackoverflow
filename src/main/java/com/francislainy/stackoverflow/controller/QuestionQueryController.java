package com.francislainy.stackoverflow.controller;

import com.francislainy.stackoverflow.dto.QuestionQueryDto;
import com.francislainy.stackoverflow.service.QuestionQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RequestMapping("/api/so/question")
@RestController
public class QuestionQueryController {

    @Autowired
    private QuestionQueryService questionQueryService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Map<String, List<QuestionQueryDto>> getAllQuestions() {

        Map result = new HashMap();
        result.put("questions", questionQueryService.getQuestionList());
        return result;

    }

}
