package beancycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanlifeCycleAnnotation {
    @PostConstruct
    public void innit() throws Exception{
        System.out.println("Innit method is called");
    }
    @PreDestroy
    public void destroy() throws Exception{
        System.out.println("Destroy method is called");
    }
}
