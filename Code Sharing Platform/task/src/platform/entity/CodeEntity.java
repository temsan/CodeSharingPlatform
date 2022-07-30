package platform.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CodeEntity {
    private String code;

    public CodeEntity(String code) {
        this.code = code;
    }
}