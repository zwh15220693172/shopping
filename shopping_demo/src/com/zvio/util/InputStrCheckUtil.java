package com.zvio.util;

import java.util.regex.Pattern;

/**
 * 对输入进行检验的
 */
public interface InputStrCheckUtil {
    /**
     * 非法输入的数字
     */
    static boolean illegalNum(String numStr) {
        int num = Integer.parseInt(numStr);
        return num < 0 || num > 4;
    }

    /**
     * 检查输入的数据是否是我们需要的
     */
     static boolean checkInput(String numStr) {
        return Pattern.matches("^[1-9]\\d*$", numStr);
    }
}
