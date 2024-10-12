package Exeption_Handaling;

import java.io.FileInputStream;
import java.io.IOException; 

public class CheckedExecption {
    
    public static void main(String[] args) throws IOException   {
        FileInputStream file=new FileInputStream("C:/Users/Dell/Downloads/ts.txt");

        int c;

        while ((c=file.read())!=-1) {
            System.out.println((char)c);
        }
        file.close();
    }
}

/*
 * 
 * if we don't add throws then  
 * Exeption_Handaling.CheckedExecption' : 
 * At line:1 char:2
+ [?1; d:; cd 'd:\JAVA Question'; & 'C:\Program Files\Java\jdk-17\bin\j ...
+  ~
Missing type name after '['.
    + CategoryInfo          : ParserError: (:) [], ParentContainsErrorRecordException
    + FullyQualifiedErrorId : MissingTypename
 
 */
