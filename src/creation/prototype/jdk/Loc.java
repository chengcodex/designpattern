package creation.prototype.jdk;

/**
 * @author xiao
 * @date 2020/4/1 13:33
 * 表示居住信息
 */
public class Loc implements Cloneable{
    String address;

    public Loc(String address) {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
