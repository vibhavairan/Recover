import java.util.*;
class Student implements Comparable {
    int id;
    String name;

    @Override
    public int compareTo(Object o) {
        Student a = (Student) o;
        if(this.id>a.id)
            return 1;
        else
            return -1;
    }
}
public class Temp {



    public static void main(String args[])
    {
       /* Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Student> list = new ArrayList<>();

        for(int x=0;x<n;x++)
        {
            Student temp = new Student();
            temp.id = sc.nextInt();
            temp.name = sc.next();
            list.add(temp);
        }

        Collections.sort(list);

        for(Student e : list)
        {
            System.out.println(e.id);
            System.out.println(e.name);
        }*/
        String s = "Hello";
        //System.out.println(s.charAt(12));
    }
}
