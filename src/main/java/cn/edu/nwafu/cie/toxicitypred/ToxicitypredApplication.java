package cn.edu.nwafu.cie.toxicitypred;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.nwafu.cie.toxicitypred.dao")
public class ToxicitypredApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToxicitypredApplication.class, args);
    }
}
