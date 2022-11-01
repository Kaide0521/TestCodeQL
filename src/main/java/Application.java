import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.test.model")
@EnableAsync //
@EnableCaching//
public class Application {
    public static void main(String[] args) {
        System.getProperties().setProperty("mail.mime.splitlongparameters", "false");
        SpringApplication.run(Application.class, args);
        log.info("start success");
    }
}
