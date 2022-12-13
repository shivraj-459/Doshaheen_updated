package com.doshaheen.exception;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class MyErrorController {
	
	private LocalDateTime timeStamp;
	
	private String details;

	private String message;
	
	
}
