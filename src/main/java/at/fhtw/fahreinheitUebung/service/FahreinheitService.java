package at.fhtw.fahreinheitUebung.service;

import at.fhtw.fahreinheitUebung.dto.Fahreinheit;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Service
public class FahreinheitService {
    private final Fahreinheit fahreinheit = new Fahreinheit();

    public void fahreinheitberechnen(double zahl) { fahreinheit.fahreinheitberechnen(zahl);
    }

    public double getFahreinheit() { return fahreinheit.getConvert();
    }

}
