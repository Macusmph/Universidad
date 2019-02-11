public class DemoClass{
    public static void main(String[]args){
        Student s1=new Student();
        s1.ID="A01650354";
        s1.age=17;
        s1.major="ITC";

        Student s2=new Student();
        s2.ID="A012345";
        s2.age=18;
        s2.major="ITI";
        
        Student s3=new Student();
        s3.ID="A0124135";
        s3.age=17;
        s3.major="ITC";

        Classroom c=new Classroom(30);
        c.addStudent(s1);
        c.addStudent(s2);
        c.addStudent(s3);

        System.out.print("Adults ");
        System.out.println(c.countAdults());

        
    }
}