package com.lionel.wom.controller;

import com.lionel.wom.model.BaseResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("health")
    BaseResponse<Boolean> health() {
        return BaseResponse.createSuccessResult(Boolean.TRUE);
    }
}
