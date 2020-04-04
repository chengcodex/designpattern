package creation.prototype.jdk;

/**
 * @author xiao
 * @date 2020/4/1 13:22
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("xiao", 18,new Loc("beijing"));
        Student clone = student.clone();
        //默认浅拷贝，这里修改了
        //false
        System.out.println(student == clone);
        //true
        System.out.println(student.age == clone.age);
        //true
        System.out.println(student.name == clone.name);
        //false
        System.out.println(student.loc == clone.loc);

    }
}
