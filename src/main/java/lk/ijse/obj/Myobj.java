package lk.ijse.obj;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myObj")// this object like to work with spring using this annotaion
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Myobj {
    public Myobj() {
        System.out.println("Myobj");
    }
}
