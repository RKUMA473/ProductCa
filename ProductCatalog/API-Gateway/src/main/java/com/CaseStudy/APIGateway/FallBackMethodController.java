package com.CaseStudy.APIGateway;

import com.CaseStudy.APIGateway.Constant.Constant;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/productServiceFallBack")
    public String userServiceFallBackMethod() {
        return Constant.USER_FALLBACK;
    }

}
