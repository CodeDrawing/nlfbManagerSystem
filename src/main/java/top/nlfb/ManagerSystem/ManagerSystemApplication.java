package top.nlfb.ManagerSystem;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("top.nlfb.ManagerSystem.mapper")
@SpringBootApplication

public class ManagerSystemApplication {
	public static void main(String[] args) {
		SpringApplication.run(ManagerSystemApplication.class, args);
	}

}
