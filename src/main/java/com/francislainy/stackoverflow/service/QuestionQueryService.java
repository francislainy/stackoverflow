package com.francislainy.stackoverflow.service;

import com.francislainy.stackoverflow.dto.QuestionQueryDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface QuestionQueryService {

    QuestionQueryDto getQuestionItem(UUID id);

    List<QuestionQueryDto> getQuestionList();
}
