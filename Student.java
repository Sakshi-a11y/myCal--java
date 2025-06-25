 import java.util.*;
 class Student
 {
  int id;
  String name;
  int marks;
  Student(int id,String name,int marks)
  {
	  this.id=id;
	  this.name=name;
	  this.marks=marks;
  }
  public String toString()
  {
	  return"id:"+id+ ",name:"+name+ ",marks:"+marks;
  }
   public static void main(String...s)
   {
   ArrayList<Student> arr=new ArrayList<>();
   arr.add(new Student(1 ,"sakshi",20));
   arr.add(new Student(2, "hari",15));
   arr.add(new Student(3, "vishnu",19));
   arr.add(new Student(4, "sara",18));
   for(Student st:arr)
   {
   System.out.println(st);
   }
   arr.set(1,new Student (5,"isha",13));// value set at position 1
  
   arr.remove(2);// remove value at second index
   System.out.println("after updation");   
    for(Student st:arr)
   {
   System.out.println(st);
   }
  }
}  
   
   
   