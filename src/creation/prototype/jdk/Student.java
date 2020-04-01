package creation.prototype.jdk;

/**
 * @author xiao
 * @date 2020/4/1 13:22
 */
public class Student implements Cloneable{
    public Student(){};

    public Student(String name, Integer age, Loc loc) {
        this.name = name;
        this.age = age;
        this.loc = loc;
    }
    String name;
    Integer age;
    Loc loc;
    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student clone = (Student)super.clone();
        clone.loc = (Loc)loc.clone();
        return clone;
    }
}
