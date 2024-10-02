package com.osiel.ApiT.service;

import com.osiel.ApiT.model.Tenis;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class TenisService {

    private final List<Tenis> tenisList = Arrays.asList(
            // Nike
            new Tenis(1L, "Air Max", "Confortável e estiloso", "Nike", "https://exemplo.com/airmax.jpg"),
            new Tenis(2L, "Air Zoom Pegasus", "Para corridas longas", "Nike", "https://exemplo.com/pegasus.jpg"),
            new Tenis(3L, "React Infinity", "Estabilidade e conforto", "Nike", "https://exemplo.com/infinity.jpg"),
            new Tenis(4L, "Air Force 1", "Ícone de estilo", "Nike", "https://exemplo.com/airforce.jpg"),
            new Tenis(5L, "Cortez", "Design retrô", "Nike", "https://exemplo.com/cortez.jpg"),
            new Tenis(6L, "Blazer", "Estilo clássico", "Nike", "https://exemplo.com/blazer.jpg"),
            new Tenis(7L, "Joyride", "Amortecimento inovador", "Nike", "https://exemplo.com/joyride.jpg"),
            new Tenis(8L, "Metcon", "Para treinos intensos", "Nike", "https://exemplo.com/metcon.jpg"),
            new Tenis(9L, "ZoomX Vaporfly", "Alta performance", "Nike", "https://exemplo.com/vaporfly.jpg"),
            new Tenis(10L, "SB Dunk", "Skateboarding", "Nike", "https://exemplo.com/sbdunk.jpg"),

            // Adidas
            new Tenis(11L, "UltraBoost", "Ideal para corrida", "Adidas", "https://exemplo.com/ultraboost.jpg"),
            new Tenis(12L, "NMD", "Estilo urbano", "Adidas", "https://exemplo.com/nmd.jpg"),
            new Tenis(13L, "Stan Smith", "Design minimalista", "Adidas", "https://exemplo.com/stansmith.jpg"),
            new Tenis(14L, "Superstar", "Clássico dos anos 70", "Adidas", "https://exemplo.com/superstar.jpg"),
            new Tenis(15L, "ZX 2K Boost", "Amortecimento moderno", "Adidas", "https://exemplo.com/zx2k.jpg"),
            new Tenis(16L, "Adizero", "Performance de corrida", "Adidas", "https://exemplo.com/adizero.jpg"),
            new Tenis(17L, "Terrex", "Aventura ao ar livre", "Adidas", "https://exemplo.com/terrex.jpg"),
            new Tenis(18L, "Ozweego", "Visual retrô", "Adidas", "https://exemplo.com/ozweego.jpg"),
            new Tenis(19L, "Falcon", "Inspirado nos anos 90", "Adidas", "https://exemplo.com/falcon.jpg"),
            new Tenis(20L, "4D Run", "Tecnologia de impressão 3D", "Adidas", "https://exemplo.com/4drun.jpg"),

            // Asics
            new Tenis(21L, "Gel-Kayano", "Suporte para os pés", "Asics", "https://exemplo.com/gelkayano.jpg"),
            new Tenis(22L, "Gel-Nimbus", "Amortecimento macio", "Asics", "https://exemplo.com/gelnimbus.jpg"),
            new Tenis(23L, "Gel-Cumulus", "Conforto para longas distâncias", "Asics", "https://exemplo.com/gelcumulus.jpg"),
            new Tenis(24L, "Gel-Quantum", "Amortecimento responsivo", "Asics", "https://exemplo.com/gelquantum.jpg"),
            new Tenis(25L, "Gel-Venture", "Corrida em trilha", "Asics", "https://exemplo.com/gelventure.jpg"),
            new Tenis(26L, "Metarun", "Alta performance", "Asics", "https://exemplo.com/metarun.jpg"),
            new Tenis(27L, "Dynaflyte", "Leveza e velocidade", "Asics", "https://exemplo.com/dynaflyte.jpg"),
            new Tenis(28L, "Tartheredge", "Rápido e ágil", "Asics", "https://exemplo.com/tartheredge.jpg"),
            new Tenis(29L, "Noosa", "Visual vibrante", "Asics", "https://exemplo.com/noosa.jpg"),
            new Tenis(30L, "Hyper Speed", "Para corridas rápidas", "Asics", "https://exemplo.com/hyperspeed.jpg"),

            // Reebok
            new Tenis(31L, "Classic Leather", "Design clássico", "Reebok", "https://exemplo.com/classic.jpg"),
            new Tenis(32L, "Club C", "Minimalismo e conforto", "Reebok", "https://exemplo.com/clubc.jpg"),
            new Tenis(33L, "Nano X", "Para crossfit e treinos", "Reebok", "https://exemplo.com/nanox.jpg"),
            new Tenis(34L, "Zig Kinetica", "Design futurista", "Reebok", "https://exemplo.com/zigkinetica.jpg"),
            new Tenis(35L, "Floatride", "Para longas distâncias", "Reebok", "https://exemplo.com/floatride.jpg"),
            new Tenis(36L, "Instapump Fury", "Tecnologia pump", "Reebok", "https://exemplo.com/instapump.jpg"),
            new Tenis(37L, "Sole Fury", "Visual moderno", "Reebok", "https://exemplo.com/solefury.jpg"),
            new Tenis(38L, "Legacy Lifter", "Para levantamento de peso", "Reebok", "https://exemplo.com/legacylifter.jpg"),
            new Tenis(39L, "Reebok Royal", "Estilo casual", "Reebok", "https://exemplo.com/royal.jpg"),
            new Tenis(40L, "Reebok Flexagon", "Para treinos de alta intensidade", "Reebok", "https://exemplo.com/flexagon.jpg"),

            // Puma
            new Tenis(41L, "RS-X", "Design ousado", "Puma", "https://exemplo.com/rsx.jpg"),
            new Tenis(42L, "Suede Classic", "Clássico de todos os tempos", "Puma", "https://exemplo.com/suedeclassic.jpg"),
            new Tenis(43L, "Future Rider", "Visual retrô", "Puma", "https://exemplo.com/futurerider.jpg"),
            new Tenis(44L, "Cali", "Estilo casual", "Puma", "https://exemplo.com/cali.jpg"),
            new Tenis(45L, "Ignite", "Amortecimento energizado", "Puma", "https://exemplo.com/ignite.jpg"),
            new Tenis(46L, "Hybrid", "Tecnologia híbrida de amortecimento", "Puma", "https://exemplo.com/hybrid.jpg"),
            new Tenis(47L, "LQDCell", "Estabilidade e conforto", "Puma", "https://exemplo.com/lqdcell.jpg"),
            new Tenis(48L, "Carson", "Design leve", "Puma", "https://exemplo.com/carson.jpg"),
            new Tenis(49L, "Defy", "Estilo arrojado", "Puma", "https://exemplo.com/defy.jpg"),
            new Tenis(50L, "Thunder Spectra", "Visual robusto", "Puma", "https://exemplo.com/thunder.jpg")
    );

    private final Random random = new Random();

    public Tenis getTenisAleatorio(){
        int index = random.nextInt(tenisList.size());
        return tenisList.get(index);
    }


}
