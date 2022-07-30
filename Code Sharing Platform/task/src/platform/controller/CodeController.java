package platform.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import platform.entity.CodeEntity;

import javax.servlet.http.HttpServletResponse;

import static platform.Constants.codeExample;

@RestController
public class CodeController {

    public static CodeEntity codeEntity = new CodeEntity(codeExample);

    @GetMapping("/api/code")
    public ResponseEntity<CodeEntity> getJson() {
//        HttpHeaders responseHeaders = new HttpHeaders();
//        responseHeaders.set("Content-Type", "application/json");

        return new ResponseEntity<>(codeEntity, HttpStatus.OK);
    }

    @GetMapping("/code")
    public ModelAndView getHtml(HttpServletResponse response) {
        response.addHeader("Content-Type", "text/html");

        ModelAndView model = new ModelAndView();
        model.addObject("codeBody", codeEntity.getCode());
        model.setViewName("code");
        return model;
    }
}