package Grupo1.controller;

import Grupo1.request.CardRequest;
import Grupo1.request.PixRequest;
import Grupo1.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService paymentService;

    @PostMapping("/card")
    public ResponseEntity<?> cardValidator(@RequestBody CardRequest cardRequest) {
        return ResponseEntity.ok(paymentService.cardValidator(cardRequest));
    }

    @PostMapping("/pix")
    public ResponseEntity<?> pixValidator(PixRequest pixRequest) {
        return ResponseEntity.ok(paymentService.pixValidator());
    }
}
