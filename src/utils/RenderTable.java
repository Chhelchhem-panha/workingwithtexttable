package utils;

import model.Student;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.List;

public class RenderTable {
   public static void renderMenu(List<String> menu){
        CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,
                ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);

        table.setColumnWidth(0 ,5,6);
        table.setColumnWidth(1,25,45);
        table.addCell("No",cellStyle);
        table.addCell("Operation",cellStyle);

        for(int i = 0; i < menu.size() ; i++){
             table.addCell((i+1)+"",cellStyle);
             table.addCell(menu.get(i),cellStyle);
        }

        System.out.println(table.render());
    }
    public static void renderStudents(List<Student> studentList){
         CellStyle cellStyle = new CellStyle(CellStyle.HorizontalAlign.center);
         Table table = new Table(4, BorderStyle.UNICODE_BOX_DOUBLE_BORDER,
                 ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);

         // render menu
        List<String> studentMenu = new ArrayList<>(List.of("ID", "Name","Gender","Classroom"));

        table.setColumnWidth(1,25,30);
        table.setColumnWidth(2,15,25);
        table.setColumnWidth(3,20,25);
        for(String menu : studentMenu){
            table.addCell(menu);
        }

         for (Student student : studentList){
             table.addCell(student.getId()+"");
             table.addCell(student.getName());
             table.addCell(student.getGender());
             table.addCell(student.getClassroom());
         }

         table.addCell("Total Students:",2);
         table.addCell(studentList.size()+" students",2);

        System.out.println(table.render());
    }
}
