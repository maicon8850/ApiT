package com.osiel.ApiT.service;

import com.osiel.ApiT.model.Tenis;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class TenisService {

    private final List<Tenis> tenisList = Arrays.asList(
            new Tenis(1L, "Air Max", "Confortável e estiloso", "Nike", "https://exemplo.com/airmax.jpg"),
            new Tenis(2L, "UltraBoost", "Ideal para corrida", "Adidas", "https://exemplo.com/ultraboost.jpg"),
            new Tenis(3L, "Gel-Kayano", "Suporte para os pés", "Asics", "https://exemplo.com/gelkayano.jpg"),
            new Tenis(4L, "Classic Leather", "Design clássico", "Reebok", "https://exemplo.com/classic.jpg")
    );

    private final Random random = new Random();

    public Tenis getTenisAleatorio(){
        int index = random.nextInt(tenisList.size());
        return tenisList.get(index);
    }


}
