package Lotto.Lotto1.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class InputNumberDto {

    @NotNull
    @Range(min = 1, max = 45)
    private Integer number1;

    @NotNull
    @Range(min = 1, max = 45)
    private Integer number2;

    @NotNull
    @Range(min = 1, max = 45)
    private Integer number3;
}
