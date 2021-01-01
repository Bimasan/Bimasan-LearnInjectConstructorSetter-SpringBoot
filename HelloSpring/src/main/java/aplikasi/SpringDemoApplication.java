package aplikasi;

import com.bimasan.SpringDemo.InjectViaContructor;
import com.bimasan.SpringDemo.InjeksiViaSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:/config/configSpring.xml")
@ComponentScan("com.bimasan.SpringDemo")
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		InjectViaContructor injectViaContructor = (InjectViaContructor) context.getBean("injectViaContructor");
		injectViaContructor.getMessage();


		InjeksiViaSetter injeksiViaSetter =(InjeksiViaSetter) context.getBean("injeksiViaSetter");
		injeksiViaSetter.getMessage();
	}

}
