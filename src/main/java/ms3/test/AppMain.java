package ms3.test;


import ms3.test.entity.Address;
import ms3.test.entity.Identification;
import ms3.test.entity.type.CommunicationType;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import ms3.test.entity.Communication;
import ms3.test.entity.type.Gender;
import ms3.test.repository.IdentificationRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class AppMain {
    private static final Logger log = LoggerFactory.getLogger(AppMain.class);

    public static void main(String[] args) {
        SpringApplication.run(AppMain.class, args);
    }


    @Bean
    public CommandLineRunner ms3demo(IdentificationRepository repository) {
        return (args) -> {

            Address address1 = new Address("Home", "111", "Main st", "", "Sterling", "VA", "34111");
            Address address2 = new Address("Home", "200", "Holden rd", "", "Richmond", "VA", "43111");
            List<Address> addresses = new ArrayList<>();
            addresses.add(address1);
            addresses.add(address2);

            Communication communication1 = new Communication(CommunicationType.CELL, "990-110-1111", true);
            Communication communication2 = new Communication(CommunicationType.EMAIL, "acme@acme.com", true);
            List<Communication> communications = new ArrayList<>();
            communications.add(communication1);
            communications.add(communication2);


            Identification id1 = new Identification("John", "Smith", new Date("10/22/1980"), Gender.MALE, "Manager", addresses, communications);

            repository.save(id1);
        };
    }
}