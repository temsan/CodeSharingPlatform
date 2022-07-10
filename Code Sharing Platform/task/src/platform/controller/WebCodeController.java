package platform.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

import static platform.Constants.codeExample;

@Controller
public class WebCodeController {

    @GetMapping("/code")
    public String getCode(Map<String, Object> model) {
        model.put("code", codeExample);
        return "template";
    }
}