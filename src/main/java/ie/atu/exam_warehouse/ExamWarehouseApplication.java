package ie.atu.exam_warehouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExamWarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamWarehouseApplication.class, args);
    }

}
