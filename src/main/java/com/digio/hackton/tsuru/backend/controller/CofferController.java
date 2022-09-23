package com.digio.hackton.tsuru.backend.controller;

import com.digio.hackton.tsuru.backend.dto.CofferRequest;
import com.digio.hackton.tsuru.backend.dto.CofferResponse;
import com.digio.hackton.tsuru.backend.exceptions.GenericException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping(value = "api/coffer")
public class CofferController {

    @PostMapping
    public CofferResponse createCoffer(@RequestBody CofferRequest request) {
        return getResponseFromRequest(request);
    }

    @GetMapping
    public List<CofferResponse> getAllCoffers() {
        return mockCoffers();
    }

    @GetMapping("/{idCoffer}")
    public CofferResponse getCoffer(@PathVariable Integer idCoffer) {
        return getMock(idCoffer);
    }

    private CofferResponse getResponseFromRequest(CofferRequest request) {
        return new CofferResponse()
                .setId(new Random().nextInt(10))
                .setName(request.getName())
                .setAmount(request.getAmount())
                .setFinalAmount(request.getFinalAmount())
                .setQuantityToInvestPerMouth(request.getQuantityToInvestPerMouth())
                .setObjective(request.getObjective())
                .setInitialDate(request.getInitialDate())
                .setFinalDate(LocalDate.now().plusDays(new Random().nextInt(100)));
    }

    private CofferResponse getMock(Integer idCoffer){
        return mockCoffers().stream().filter(coffer -> idCoffer.equals(coffer.getId())).findAny()
                .orElseThrow(() -> new GenericException(HttpStatus.NOT_FOUND, "coffer not found"));
    }

    public List<CofferResponse> mockCoffers() {
        CofferResponse cofferResponse1 = new CofferResponse()
                .setId(1)
                .setName("Viagem para conhecer o Mickey")
                .setAmount(600.0)
                .setFinalAmount(2200.0)
                .setQuantityToInvestPerMouth(200.0)
                .setObjective("Disney")
                .setInitialDate(LocalDate.now().plusDays(10))
                .setFinalDate(LocalDate.now().plusDays(150));
        CofferResponse cofferResponse2 = new CofferResponse()
                .setId(2)
                .setName("Viagem para praia")
                .setAmount(2500.0)
                .setFinalAmount(3000.0)
                .setQuantityToInvestPerMouth(50.0)
                .setObjective("Me Bronzear")
                .setInitialDate(LocalDate.now().plusDays(10))
                .setFinalDate(LocalDate.now().plusDays(40));
        CofferResponse cofferResponse3 = new CofferResponse()
                .setId(3)
                .setName("Comprar um carro")
                .setAmount(35000.00)
                .setFinalAmount(120000.90)
                .setQuantityToInvestPerMouth(2000.0)
                .setObjective("Abandonar o transporte publico")
                .setInitialDate(LocalDate.now().plusDays(0))
                .setFinalDate(LocalDate.now().plusDays(365));
        CofferResponse cofferResponse4 = new CofferResponse()
                .setId(4)
                .setName("Comprar o apartamento")
                .setAmount(6000.00)
                .setFinalAmount(200500.99)
                .setQuantityToInvestPerMouth(800.0)
                .setObjective("Sair do aluguel")
                .setInitialDate(LocalDate.now().plusDays(10))
                .setFinalDate(LocalDate.now().plusDays(150));
        return Stream.of(cofferResponse1, cofferResponse2, cofferResponse3, cofferResponse4).collect(Collectors.toList());
    }
}
