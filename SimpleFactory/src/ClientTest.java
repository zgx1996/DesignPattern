/**
 * @author person guoxi.zhang@hand-china.com
 * @version 1.0
 * @name zgx
 * @description
 * @date 2018/8/15 19:31
 */
public class ClientTest {
    public static void main(String[] args) {
        Operation operation = SimpleFactory.create("+");
        operation.numberA = 10L;
        operation.numberB = 20L;
        long result = operation.getResult();
        System.out.println(result);

    }

}
