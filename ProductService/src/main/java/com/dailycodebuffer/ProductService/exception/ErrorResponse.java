package com.dailycodebuffer.ProductService.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private String errorMessage;
    private String errorCode;
}
