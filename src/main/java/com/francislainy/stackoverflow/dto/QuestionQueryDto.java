package com.francislainy.stackoverflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@AllArgsConstructor
@Data
public class QuestionQueryDto {

    private UUID id;
    private String title;

}
