import java.io.*; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class file
{
    public static void main(String[] args)
    {
        String data="";
        try /*reading the data of file1 (already created file)*/
        {
            File myObj = new File("file1.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                data = myReader.nextLine();
                System.out.println("content of file1");
                System.out.println(data);//displaying data of file 1
            }
            myReader.close();
        }
        catch (FileNotFoundException e) //if the file is not present in the folder
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try /*creating a new file (file2) to copy data of file1*/
        {
            File myObj = new File("file2.txt");
            if (myObj.createNewFile())
            {
                System.out.println("File created: " + myObj.getName());
            }
            else
            {
                System.out.println("File already exists.");//message in case the file whit this name is already present
            }
        }
        catch (IOException e) //to deal with input-output exceptions
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try /*wriring the content in file2*/
        {
            FileWriter myWriter = new FileWriter("file2.txt");
            myWriter.write(data);
            System.out.println("Successfully coppied to the file2");
            myWriter.close();
        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
