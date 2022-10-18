package Grupo1.PaymentsAgroCineTickets.dto.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
public class CardRequest {

    private UUID userId;
    @NotEmpty
    private String number;
    @NotEmpty
    private String name;
    private short cvv;
    private YearMonth expirationDate;
    private BigDecimal price;
    private ZonedDateTime transctionTime;
}
