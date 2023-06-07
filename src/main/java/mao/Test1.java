package mao;



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Project name(项目名称)：java报表_iText导出PDF
 * Package(包名): mao
 * Class(类名): Test1
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/7
 * Time(创建时间)： 21:18
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test1
{
    public static void main(String[] args) throws FileNotFoundException, DocumentException
    {
        //建立Document对象的实例。
        Document document = new Document();
        //建立一个书写器(Writer)与document对象关联，通过书写器(Writer)可以将文档写入到磁盘中。
        PdfWriter.getInstance(document, new FileOutputStream("test.pdf"));
        //打开文档。
        document.open();
        //向文档中添加内容。
        document.add(new Paragraph("Hello World"));
        document.add(new Paragraph("1234567"));
        //关闭文档。
        document.close();
    }
}
