package com.annotation.after;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackOperation {
	@Pointcut("execution(* Operation.*(..))")
	public void k() {
	}// pointcut name

	@After("k()") // applying pointcut on before advice
	public void myadvice(JoinPoint jp)// it is advice (before advice)
	{
		System.out.println("additional concern");
		// System.out.println("Method Signature: " + jp.getSignature());
	}
}