package lk.ijse.config;

import lk.ijse.aop.Logs;
import lk.ijse.aop.Transaction;
import lk.ijse.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {Logs.class, Transaction.class})//check the object like work with spring(boundrie eka)
public class AppConfig { //Configuration class(spring ekk wada krnn kamthi object application context ekt gihin danwa)as per agent
//    @Bean
//    OtherObj otherObj(){
//    return new OtherObj();
//}

}
