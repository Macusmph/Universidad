public class Classroom{
    public int capacity;
    public String subject;
    private Student[] students;
    private int counter;

    public Classroom(int capacity){
        this.capacity=capacity;//we put this. to refer to capacity as attribute (the one that is at the top)
        //without the "this."it refers to the capacity inside the method
        students=new Student[capacity];//you can put this.students instead of "students" and it`s the same
    }
    
    public void addStudent(Student s){
        students[counter]=s;
        counter++;
    }

    public int countAdults(){
        int adults=0;
        for(int i=0;i<counter;i++){//instead of  counter, it can´t be students.length because there can be less students added
            if(students[i].age>=10)
                adults++;//when you have one instruction, you can omit the {}
        }
        return adults;
    }
}