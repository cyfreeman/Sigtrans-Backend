package com.sigtrans.sigtrans;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.sigtrans.sigtrans.model.estado.Estado;
import com.sigtrans.sigtrans.repository.EstadoRepository;

@Configuration
@Slf4j
public class LoadDatabase {
    @Bean
    CommandLineRunner initDatabase(EstadoRepository estadoRepository) {
        estadoRepository.save(new Estado(-1, "Paraná", "PR"));
        estadoRepository.findAll().forEach(order -> {
            log.info("Preloaded " + order);
        });
        return args -> {
            log.info("Lul");
        };
    }
}