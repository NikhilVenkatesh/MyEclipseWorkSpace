package org.practice.shapes;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	private Point center;
	
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name = "pointC")
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("drawing.circle", null,"Default drawing Circlr", null));
		System.out.println(messageSource.getMessage("drawing.point", new Object[] {center.getX(),center.getY()},"Default drawing point", null));
		//System.out.println("Circle Center is: " + "(" + center.getX() + "," + center.getY() + ")");
		
		System.out.println(messageSource.getMessage("greeting", null,"Default Greeting", null));
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	}

	@PostConstruct
	public void myInit() {
		System.out.println("My Init method called");

	}

	@PreDestroy
	public void cleanUp() {
		System.out.println("My Destroy method called");

	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}
}
