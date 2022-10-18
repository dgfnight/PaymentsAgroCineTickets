package Grupo1.PaymentsAgroCineTickets.dto.response;

import Grupo1.PaymentsAgroCineTickets.model.Transaction;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class PixResponse {

    private String key;
    private UUID userId;
    private ZonedDateTime transctionTime;
    private BigDecimal price;

    public PixResponse(Transaction transaction){

    }

}
