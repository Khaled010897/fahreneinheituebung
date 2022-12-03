package at.fhtw.fahreinheitUebung.controller;

import at.fhtw.fahreinheitUebung.service.FahreinheitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
//implimentation von MainController
@RestController
public class FahreinheitController {
    private final FahreinheitService fahrService;

    public FahreinheitController(FahreinheitService fahrService) {
        this.fahrService = fahrService;
    }


    @GetMapping("/convert")
    double getFahr() {
        return fahrService.getFahreinheit();
    }

    @GetMapping("/convert/{number}")
    double fahreinheit(@PathVariable double number) {
        fahrService.fahreinheitberechnen(number);
        return fahrService.getFahreinheit();
    }
}
