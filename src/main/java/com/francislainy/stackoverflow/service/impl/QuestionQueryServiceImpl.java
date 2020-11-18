package com.francislainy.stackoverflow.service.impl;

import com.francislainy.stackoverflow.dto.QuestionQueryDto;
import com.francislainy.stackoverflow.repository.QuestionRepository;
import com.francislainy.stackoverflow.service.QuestionQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class QuestionQueryServiceImpl implements QuestionQueryService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public QuestionQueryDto getQuestionItem(UUID id) {
        return null;
    }

    @Override
    public List<QuestionQueryDto> getQuestionList() {

        List<QuestionQueryDto> questionList = new ArrayList<>();

        questionRepository.findAll().forEach(category -> {
            questionList.add(new QuestionQueryDto(category.getId(), category.getTitle()));
        });

        return questionList;
    }
}
