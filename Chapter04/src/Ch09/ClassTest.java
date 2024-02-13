package Ch09;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;


public class ClassTest {

	
	public static void main(String[] args) throws ClassNotFoundException{
		
		
			Class userClass = Class.forName("Ch09.User");
			
			System.out.println("==== Field list ====");
			for (Field field : userClass.getFields()) {
				System.out.println(field.getName());
			}
			
			
			
			
			System.out.println("==== Constructor List ====");
			for (Constructor constructor : userClass.getConstructors()) {	
				System.out.println("개수"+constructor.getParameterTypes()+"= ");
		
			
			for (Class parameter : constructor.getParameterTypes()) {
				System.out.println(parameter.getName()+"/");
			}
			System.out.println();
		
		}
		
		System.out.println("==== Method List ====");
		for (Method method : userClass.getMethods()) {
			System.out.println(method.getName());
		}
	}
	
}
