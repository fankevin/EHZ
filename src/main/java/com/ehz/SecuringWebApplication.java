package com.ehz;

import com.ehz.service.FileService;
import com.ehz.service.UserService;
import com.ehz.storage.StorageProperties;
import com.ehz.storage.StorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class SecuringWebApplication {

  public static void main(String[] args) throws Throwable {
    SpringApplication.run(SecuringWebApplication.class, args);
  }

  @Bean
  CommandLineRunner init(
      StorageService storageService, FileService fileService, UserService userService) {
    return (args) -> {
      //            storageService.init();
      //            fileService.createRoot();
      //            userService.createUser("kevin", "{noop}140", "Kevin", "ADMIN", true);
      //
      //            userService.createUser("jack", "{noop}140", "Jack", "USER", true);
      //            userService.createUser("mack", "{noop}140", "Jack", "USER", true);
      //            userService.createUser("tom", "{noop}140", "Jack", "USER", true);
      //            userService.createUser("tim", "{noop}140", "Jack", "USER", true);
      //            userService.createUser("lucy", "{noop}140", "Jack", "USER", true);
    };
  }
}
