package com.backend.interesteds.DTOs;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorDTO {
    private String message;
}

