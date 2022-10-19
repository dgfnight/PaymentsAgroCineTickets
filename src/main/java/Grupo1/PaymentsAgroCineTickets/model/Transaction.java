package Grupo1.PaymentsAgroCineTickets.model;

import Grupo1.PaymentsAgroCineTickets.dto.request.CardRequest;
import Grupo1.PaymentsAgroCineTickets.dto.request.PixRequest;
import Grupo1.PaymentsAgroCineTickets.enums.PaymentType;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.UUID;

@Entity

public class Transaction {

    @Id
    @GeneratedValue
    @Type(type="org.hibernate.type.UUIDCharType")
    private UUID id;
    private UUID userId;
    private Enum paymentType;
    private BigDecimal price;
    private Enum Status;

    public Transaction(CardRequest cardRequest) {
        this.userId = cardRequest.getUserId();
        this.price = cardRequest.getPrice();
        this.paymentType = PaymentType.CARD;
    }

    public Transaction(PixRequest pixRequest){
        this.userId = pixRequest.getUserId();
        this.price = pixRequest.getPrice();
        this.paymentType = PaymentType.PIX;
    }

    public Transaction() {

    }

}
