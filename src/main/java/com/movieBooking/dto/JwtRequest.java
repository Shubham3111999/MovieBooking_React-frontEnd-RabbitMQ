package com.movieBooking.dto;

import lombok.Data;

@Data
public class JwtRequest {
	
	private String email;

	private String password;
}