package annotations.RepeatAnnoDemo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
	@MyAnno(str = "First annotation", val = -1)
	@MyAnno(str = "Second annotation", val = 100)
	public static void myMeth(String str, int i) {
		RepeatAnno ob = new RepeatAnno();
		
		try {
			Class<?> c = ob.getClass();
			
			Method m = c.getMethod("myMeth", String.class, int.class);
			
			Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
			System.out.println(anno);
			
			Annotation[] annos = m.getAnnotationsByType(MyAnno.class);
			for(Annotation a : annos)
				System.out.println(a);
		} catch (NoSuchMethodException e) {
			System.out.println("Method Not Found.");
		}
	}
	
	public static void main(String[] args) {
		myMeth("test", 10);
	}
}
