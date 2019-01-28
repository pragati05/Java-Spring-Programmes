package testPrgram.java;

import java.io.File;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.SpreadsheetMLPackage;


public class Test 
{
	
public static void main(String[] args) {
	File file = new File("C:/Users/pragati/Desktop/Medical_Insurance_Dependants_List.xlsx");
	System.out.println("Does File exist: "+ file.exists());
	SpreadsheetMLPackage excelMLPackage = null;
	try {
		excelMLPackage = SpreadsheetMLPackage.load(file);
	} catch (Docx4JException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		excelMLPackage .save(new File("C:/Users/pragati/Desktop/ExcelBook.xml"));
	} catch (Docx4JException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}}