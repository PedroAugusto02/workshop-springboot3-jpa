package com.pedro.primeiro.services.exceptions;

public class DatabaseException extends RuntimeException{

	private static final long serialVersionUID = 4835506363890422838L;
	
	public DatabaseException(String msg) {
		super(msg);
	}
}
