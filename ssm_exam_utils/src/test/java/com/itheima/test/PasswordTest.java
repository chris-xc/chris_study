package com.itheima.test;

import com.itheima.utils.MD5Util;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @Author 王磊
 * @Date 2019/8/16/016
 */
public class PasswordTest {

    public static void main(String[] args) {
        /**
         * MD5加密的特点
         * 1. 一个固定的明文字符串,不管加密多少次,获取的密文字符串都是一样的
         * 2. MD5加密是不可逆的
         */
        //String encode = MD5Util.MD5Encode("123", "UTF-8");
        //System.out.println(encode);

        /**
         * BCrypt 加密算法特点
         * 1. 一个固定的明文字符串,每次加密得到的结果都是不一样的     盐 : 随机字符串
         */
        //$2a$10$fWqNfq0Q3CmG1tgoYGAMt.DWrSE12/h7LdV6m0Bp/PjtYY60lMVBO
        //$2a$10$5oIntg8e7aYslLoxLIwxEOtffEyyTR45QvbrTIuPAzPu6pXWjjGaa
        //$2a$10$zwRigLPAVkYKKh2k/enMvOpvsSuc0pO/Nfh0lvMAiHRn4TVKInIgK --> 提取盐 + 用户输入的字符串加盐 --> 加密 --> 比对
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encode = passwordEncoder.encode("123");
        System.out.println(encode);
    }
}
