import java.io.FileNotFoundException;
public class PE_3 {
   PE_3(String msg) {
       msg = "this is bound to execute";
       System.out.println(msg);
   }

   public static void main(String[] args) throws Exception {
       try {
           // Suppose here you are looking for any resource for eg.File
           // If program is unable to find file
           throw new FileNotFoundException();
       } catch (FileNotFoundException e) {
           throw new Exception("File not found");
       } catch (Exception e) {
    	  
           System.out.println("dhiuehd");
       } finally {
           // This block will get get executed whether exception occures or
           // not.
           System.out.println("It be printed");
       }

   }
}