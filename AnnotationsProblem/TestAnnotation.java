package AnnotationsProblem;

import java.lang.reflect.Method;

public class TestAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException 
	{
		// TODO Auto-generated method stub
		Annotation a = new Annotation();
		Method m = a.getClass().getMethod("Rubbu");
		
		customAnnotation ca = m.getAnnotation(customAnnotation.class);
		System.out.println("data supplied using annotation = " + ca.salary());
		System.out.println("data supplied using annotation = " + ca.roll());
		Annotation[] all = (Annotation[]) a.getClass().getAnnotations();
		System.out.println(all.toString());
		

	}

}