package Grupo1.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.time.YearMonth;

@Getter
@Setter
public class CardRequest {

    @NotEmpty
    private String number;
    @NotEmpty
    private String name;
    private String cvv;
    @JsonFormat(pattern = "MM/yy")
    private YearMonth expirationDate;

}
