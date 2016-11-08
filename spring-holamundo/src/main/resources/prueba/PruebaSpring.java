package prueba;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.BeansSpring;

public class PruebaSpring {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			BeanFactory factory = context;
			BeansSpring miBean = (BeansSpring) factory.getBean("miBean");
			System.out.println("Mensaje: " + miBean.getMensaje());
			}

	

}
