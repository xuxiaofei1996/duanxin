package com.javaxxf;

public class Run {
    //直接运行这个main方法即可获取严重嘛
    public static void main(String[] args) {
        String phone = "13535154153"; //此处可输入你的手机号码进行测试
        VerificationCode vc=new VerificationCode();
        vc.getPhonemsg(phone);
    }

}
