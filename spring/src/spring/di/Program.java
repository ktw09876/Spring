package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
//		스프링에게 지시하는 방법으로 변경
//		Exam exam = new NewlecExam();
//		ExamConsole console = new GridExamConsole();
//		
//		console.setExam(exam);
		
		ApplicationContext context =
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
				//new ClassPathXmlApplicationContext("spring/di/setting.xml"); 
		
//		Exam exam = context.getBean(Exam.class);
//		System.out.println(exam.toString());
		
		ExamConsole console = (ExamConsole) context.getBean("console");
//		ExamConsole console = context.getBean(ExamConsole.class);		
		console.print();
		
//		List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<> ();
//		exams.add(new NewlecExam(1,1,1,1));
		
//		for(Exam e : exams)
//			System.out.println(e);
		
	}

}
