package structural.facade;

/**
 * @author xiao
 * @date 2020/4/3 21:29
 */
public class Facade {
    private SubSystemOne subSystem1 = new SubSystemOne();
    private SubSystemTwo subSystem2 = new SubSystemTwo();
    private SubSystemThree subSystem3 = new SubSystemThree();

    public Facade() {
    }
    public void open(){
        subSystem1.open();
        subSystem2.open();
        subSystem3.open();
    }
}
