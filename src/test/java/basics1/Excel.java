package basics1;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("C://Users//chinni//Desktop//login_details.xlsx");
		XSSFWorkbook excel = new XSSFWorkbook();
		int sheet_count = excel.getNumberOfSheets();
	
		for (int i = 0; i < sheet_count; i++) {
			
			if (excel.getSheetName(i).equalsIgnoreCase("sheet1")) {
				XSSFSheet sheet = excel.getSheetAt(i);
				Iterator<Row> row = sheet.iterator();
				Row first = row.next();
				Iterator<Cell> c = first.cellIterator();
				int column=0,k=0;
				while (c.hasNext()) {
					Cell cell = c.next();
					if (cell.getStringCellValue().equalsIgnoreCase("username")) {
						column=k;
						//System.out.println(column);

					}
					k++;

				}
				System.out.println(column);
				
				while(row.hasNext()) {
					Row rw=row.next();
				if(rw.getCell(column).getStringCellValue().equalsIgnoreCase("pavan")) {
					
					Iterator<Cell> cell=rw.cellIterator();
					while(cell.hasNext()) {
						System.out.println(cell.next().getStringCellValue());
					}
				}
				}
				
				

			}
			
			
		}
		//System.out.println(column);
		

	}


	}


