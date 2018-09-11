package com.rabo.statementprocessor.validation;
import java.io.IOException;

import com.rabo.statementprocessor.pojo.*;
import com.rabo.statementprocessor.validation.ValidationClass;

public class FileReaderProcessingClass {

	
	public static void fileReader(CsvANDXmlPojo[] filearray) throws ClassNotFoundException, IOException {
		
		
		String[] value = new String[filearray.length];

		for (int i = 0; i < filearray.length; i++) {
			value[i] = filearray[i].getReference() + "," + filearray[i].getAccountNumber() + ","
					+ filearray[i].getDescription() + "," + filearray[i].getStartBal() + "," + filearray[i].getMutation()
					+ "," + filearray[i].getEndBal();
			
		}
		ValidationClass.validationMethod(value);

	}
}
