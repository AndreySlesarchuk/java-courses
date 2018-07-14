package by.atmm.sample;

/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
*/

import java.io.*;

import static java.lang.System.out;
public class Main1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		out.println("������ ������������");
		BufferedReader reader = new BufferedReader
			(new InputStreamReader (System.in));	
		out.print("������� ����� 1:");
		String s1 = reader.readLine();
		int x1 = Integer.parseInt(s1);
		
		out.print("������� ����� 2:");
		String s2 = reader.readLine();
		int x2 = Integer.parseInt(s2);
		
		double x3 = (x1 + x2)/2.0;
		out.println("������� ���� ��������:"+x3);
		

		BufferedReader reader2 = new BufferedReader
				(new InputStreamReader (System.in));	
		out.print("T(F)= ");
		
		double tf = Double.parseDouble(reader2.readLine ());
		double tc = (tf-32.0)*5.0/9.0;
		
		out.printf("T(C) = %g\n", tc);
		
	}

}
