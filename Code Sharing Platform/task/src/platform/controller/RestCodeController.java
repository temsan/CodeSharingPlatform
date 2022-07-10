package platform.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.entity.CodeEntity;
import platform.Constants;

import java.util.HashMap;
import java.util.Map;

import static platform.Constants.codeExample;

@RestController
public class RestCodeController {

    public static CodeEntity codeEntity = new CodeEntity(codeExample);

    @GetMapping("/api/code")
    public ResponseEntity<CodeEntity> getCode() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type", "application/json");

        return new ResponseEntity<>(codeEntity, HttpStatus.OK);
    }
}
