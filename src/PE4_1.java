public class PE4_1 {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       Pe obj = new Pe("Jennipalli", 216758);
   
       System.out.println(obj.Name);
       System.out.println(obj.id);
       
       Pe obj1 = new Pe(null, 0);
       String sname = obj1.fullname("Tejaswini J V");
       System.out.println(sname);

   }

}

class Pe {
   String Name;
   int id;
   
   Pe (String f_name, int i) {
       Name = f_name;
       id = i;
   }
   
   static String fullname (String aName) {
       String f_name = aName;
       return f_name;
   }
   
}