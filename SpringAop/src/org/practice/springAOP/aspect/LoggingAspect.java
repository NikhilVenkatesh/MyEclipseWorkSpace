package org.practice.springAOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

public class LoggingAspect {

	/*@Before("allGetters()")
	public void loggingAdvice(JoinPoint joinpoint) {
		//System.out.println(joinpoint.toString());
		System.out.println("Advice Run. Get Method Called");
	}*/

	/*
	 * @Before("allGetters()") public void secondAdvice(){ System.out.println(
	 * "Second Advice Run. Get Method Called"); }
	 */

	public Object myAround(ProceedingJoinPoint proceedingJoinPoint) {

		Object returnObject = null;
		try {
			System.out.println("Before Advice");
			returnObject=proceedingJoinPoint.proceed();
			System.out.println("After Returning");
		} catch (Throwable e) {
			System.out.println("After Throwing");
		}

		System.out.println("After Finally");
		return returnObject;
	}

	/*@Pointcut("execution(* get*())")
	public void allGetters() {
	}
*/
	/*@Pointcut("within(org.practice.springAOP.model.Circle)")
	public void allCircleMethods() {
	}*/

	public void loggingAdvice(){
		System.out.println("Logging Advice ");
	}
}
