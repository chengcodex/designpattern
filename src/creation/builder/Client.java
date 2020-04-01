package creation.builder;

/**
 * @author xiao
 * @date 2020/4/1 13:54
 * * 例子参考effective java 3
 * 用来构造复杂对象。可以向NutritionFacts使用
 * 也可以通过引入一个Director类，将构建对象过程固定（类似于模板模式），将构建的过程与使用分离。
 * {@link StringBuilder}
 */
public class Client {
    public static void main(String[] args) {
        NutritionFacts build = new NutritionFacts.Builder(1, 2)
                .calories(3)
                .fat(4)
                .carbohydrate(5)
                .sodium(6)
                .build();
    }
}
