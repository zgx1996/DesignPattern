/**
 * @author person guoxi.zhang@hand-china.com
 * @version 1.0
 * @name zgx
 * @description
 * @date 2018/8/15 18:43
 */
public class SimpleFactory {


    public static Operation create(String operation){
        Operation op = null;
        switch (operation){
            case "+":
                op = new AddOperation();
                break;
            case "-":
                op = new SubOperation();
                break;
            case "*":
                op = new MulOperation();
                break;
            case "/":
                op = new DivOperation();
                break;
            default:
                break;
        }
        return op;
    }

}
