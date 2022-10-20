package Grupo1.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
public class PixRequest {

    @NotEmpty
    private String key;
    private UUID userId;
    private ZonedDateTime transctionTime;
    private BigDecimal price;

}

