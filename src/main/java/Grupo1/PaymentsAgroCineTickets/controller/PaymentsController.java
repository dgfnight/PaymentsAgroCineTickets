package Grupo1.PaymentsAgroCineTickets.controller;

import Grupo1.PaymentsAgroCineTickets.dto.request.CardRequest;
import Grupo1.PaymentsAgroCineTickets.dto.request.PixRequest;
import Grupo1.PaymentsAgroCineTickets.service.PaymentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentsController {

    private final PaymentsService paymentsService;

    @PostMapping("/card")
    public ResponseEntity<?> cardPayment(@RequestBody @Valid CardRequest cardRequest) {
        paymentsService.cardPayment(cardRequest);
        return ResponseEntity.ok().body();
    }

    @PostMapping("/pix")
    public void pixPayment(@RequestBody @Valid PixRequest pixRequest) {

    }

    @PostMapping("/{id}")
    public void paymentReversal(@PathVariable UUID transactionId) {

    }

    @GetMapping
    public void paymentReport() {

    }

    @GetMapping("/{id}")
    public void pointsByUserId(@PathVariable UUID userId) {

    }
}
