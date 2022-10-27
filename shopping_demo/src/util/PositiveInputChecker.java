package util;

import java.util.regex.Pattern;

/**
 * 校验输入的字符串是不是正整数
 */
public class PositiveInputChecker implements InputChecker<String> {
    @Override
    public boolean checkInput(String inputData) {
        return Pattern.matches("^[1-9]\\d*$", inputData);
    }
}