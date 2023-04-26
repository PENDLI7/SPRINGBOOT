package com.ciq.controller;

import java.awt.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.ciq.bean.Employee;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;

public class PdfController {
	
	public List<Employee>list;

	public PdfController(List<Employee> list) {
		super();
		this.list = list;
	}
	
	private void WriteTableHeader(PdfPTable table) {
		
		PdfPCell cell=new PdfPCell();
		cell.setBackgroundColor(Color.DARK_GRAY);
		cell.setPadding(5);
		Font font=FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setColor(Color.RED);
		cell.setPhrase(new Phrase("Employee Id", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Name", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee designation", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Experience", font));
		table.addCell(cell);
		cell.setPhrase(new Phrase("Employee Department", font));
		table.addCell(cell);
		
		
	}
	private void WriteTableData(PdfPTable table) {
		for (Employee employee : list) {
			table.addCell(String.valueOf(employee.getId()));
			table.addCell(employee.getName());
			table.addCell(employee.getDesignation());
			table.addCell(String.valueOf(employee.getExp()));
			table.addCell(employee.getDept());
			
		}
	}
	public void export(HttpServletResponse response) throws DocumentException, IOException {
		Document doc=new Document(PageSize.A4);
		PdfWriter.getInstance(doc, response.getOutputStream());
		doc.open();
		Font font=FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		font.setSize(19);
		font.setColor(Color.BLACK);
		Paragraph p=new Paragraph("List Of Employee",font);
		p.setAlignment(Paragraph.ALIGN_CENTER);
		doc.add(p);
		PdfPTable table=new PdfPTable(5);
		table.setWidthPercentage(100f);
		table.setWidths(new float[] {1.0f,3.4f,2.5f,2.5f,2.0f});
		table.setSpacingBefore(10);
		WriteTableHeader( table);
		WriteTableData(table);
		doc.add(table);
		doc.close();
	}

}
