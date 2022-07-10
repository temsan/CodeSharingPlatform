package platform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CodeEntity {
    public String code;

    public CodeEntity(String code) {
        this.code = code;
    }
}