
 import java.io.FileReader;
 import java.io.BufferedReader;
 import java.io.FileWriter;
 import java.io.IOException;
 class WriteToFile
 {
  public static void main(String...s)
  {
   String filePath="notes.txt";
   try(FileWriter writer=new FileWriter(filePath))
   {
   writer.write("this is a note\n");
   writer.write("here is another note\n");
   System.out.println("notes are written in file");
   }
   catch(IOException e)
   {
   System.out.println("an error occured while writing to the file: "+e.getMessage());
   }
   try(BufferedReader reader=new BufferedReader(new FileReader(filePath)))
   {
	   String line;
	 System.out.println("reading notes from file");  
	 while((line=reader.readLine())!=null)
	 {
		 System.out.println("line");
  }
   }
   catch(IOException e)
   {
   System.out.println("an error occured while writing to the file: "+e.getMessage());
   }

  }
 }  
   
