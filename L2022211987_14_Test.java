import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L2022211987_14_Test {

//    测试用例设计的总体原则：等价类划分原则
//    1.有效IP地址的等价类
//    2.无效IP地址的等价类

//    测试目的：测试有效IP地址的生成
//    测试用例：25525511135
    @Test
    public void testRestoreIpAddresses1() {
        Solution14 solution = new Solution14();
        String input1 = "25525511135";
        List<String> result1 = solution.restoreIpAddresses(input1);
        assertNotNull(result1);
        assertTrue(result1.contains("255.255.11.135") && result1.contains("255.255.111.35"));
    }


//    测试目的：测试无效IP地址的生成
//    测试用例：000 00000 256256256256
    @Test
    public void testRestoreIpAddresses2() {
        Solution14 solution = new Solution14();

//        段数不足的无效IP地址字符串
        String input1 = "000";
        List<String> result1 = solution.restoreIpAddresses(input1);
        assertTrue(result1.isEmpty());

//        段数超出的无效IP地址字符串
        String input2 = "00000";
        List<String> result2 = solution.restoreIpAddresses(input2);
        assertTrue(result2.isEmpty());

//        数字超出范围的无效IP地址字符串
        String input3 = "256256256256";
        List<String> result3 = solution.restoreIpAddresses(input3);
        assertTrue(result3.isEmpty());


    }

}