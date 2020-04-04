package creation.singleton;

public enum SingletonSix {
    INSTANCE();
    private String objName;

    public String getObjName() {
        return objName;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public static void main(String[] args) {
        // 单例测试
        SingletonSix firstSingleton = SingletonSix.INSTANCE;
        firstSingleton.setObjName("firstName");
        System.out.println(firstSingleton.getObjName());
        SingletonSix secondSingleton = SingletonSix.INSTANCE;
        secondSingleton.setObjName("secondName");
        System.out.println(firstSingleton.getObjName());
        System.out.println(secondSingleton.getObjName());

        System.out.println("反射获取结果-------------------");
        //反射获取
        SingletonSix[] enumConstants = SingletonSix.class.getEnumConstants();
        for (SingletonSix constant : enumConstants) {
            System.out.println(constant.getObjName());
        }
    }
}