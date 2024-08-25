import lk.ijse.aop.Transaction;
import lk.ijse.config.AppConfig;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appinit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext(); //create application context(bajanaya)
        ctx.register(AppConfig.class);
        ctx.refresh();
//        var myObj = ctx.getBean("myObj");
//        System.out.println(myObj);
//        ConfigurableListableBeanFactory beanFactory = ctx.getBeanFactory();
//        System.out.println("Is bean singleton" + beanFactory.isSingleton("myObj"));

        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();
        ctx.registerShutdownHook();


    }
}
