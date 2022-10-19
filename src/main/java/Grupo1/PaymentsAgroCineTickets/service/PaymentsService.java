package Grupo1.PaymentsAgroCineTickets.service;

import Grupo1.PaymentsAgroCineTickets.dto.request.CardRequest;
import Grupo1.PaymentsAgroCineTickets.dto.request.PixRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaymentsService {

    private final EmailService emailService;
    private final PointsProgramService pointsProgramService;

    public void cardPayment(CardRequest cardRequest) {
        cardValidator();
        generatePaymentVoucher();
        pointsProgramService.generatePoints();

        emailService.sendEmail();
    }

    public void cardValidator() {

    }

    public void pixPayment(PixRequest pixRequest) {
        validatePaymentKey();
        generatePaymentVoucher();
        pointsProgramService.generatePoints();

        emailService.sendEmail();
    }

    public void pixValidator() {

    }


    public void generatePaymentVoucher() {

    }

    public void paymentReversal(UUID transactionId) {

    }

    public void paymentReport() {

    }

}
