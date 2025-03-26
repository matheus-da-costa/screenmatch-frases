package br.com.alura.screenmatch_frases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repository;

    public FraseDTO obterFraseAleatoria() {
        Frase frase = repository.buscaFraseAleatoria();
        return new FraseDTO(frase.getFrase(), frase.getTitulo(), frase.getPersonagem(), frase.getPoster());
    }

}
