package com.atguigu.Interview.enums;

/**
 * @author lixiang
 * @date 2020-05-19-00:02
 */
public enum CountryEnum {

    ONE(1, "齐"),

    TWO(2, "楚"),

    THREE(3, "燕"),

    FOUR(4, "韩"),

    FIVE(5, "赵"),

    SIX(6, "魏"),

    SEVEN(7, "秦");

    private Integer retCode;
    private String retMessage;

    CountryEnum(Integer retCode, String retMessage) {
        this.retCode = retCode;
        this.retMessage = retMessage;
    }

    public Integer getRetCode() {
        return retCode;
    }

    public void setRetCode(Integer retCode) {
        this.retCode = retCode;
    }

    public String getRetMessage() {
        return retMessage;
    }

    public void setRetMessage(String retMessage) {
        this.retMessage = retMessage;
    }

    public static CountryEnum forEach_CountryEnum(int index) {
        CountryEnum[] myArray = CountryEnum.values();
        for (CountryEnum element : myArray) {
            if (index == element.getRetCode()) {
                return element;
            }
        }
        return null;
    }
}
