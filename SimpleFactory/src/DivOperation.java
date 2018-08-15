/**
 * @author person guoxi.zhang@hand-china.com
 * @version 1.0
 * @name zgx
 * @description
 * @date 2018/8/15 19:25
 */
public class DivOperation extends Operation {
    @Override
    public long getResult() {
        if(numberB == 0){
            throw new RuntimeException("除数不能为零");
        }
        return numberA/numberB;
    }
}
