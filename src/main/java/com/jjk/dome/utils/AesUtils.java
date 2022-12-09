package com.jjk.dome.utils;
import org.apache.commons.codec.binary.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;


/**
 * @author jq
 */

public class AesUtils {

    private static final String CHARSET_NAME = "utf-8";
    private static final String ALGORITHM = "AES";
    private static final String ECB = "AES/ECB/Pkcs7Padding";
    private static final String CBC = "AES/CBC/Pkcs7Padding";

    private static final char[] CHARS = {
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
    };

    /**
     * AES加密算法
     * @param key 私钥
     * @param iv 盐
     * @param body   需要加密的请求报文
     */
    public static String encode(String key, String iv, String body) {
        try {
            SecretKeySpec sKeySpec = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(CBC);
            IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.ENCRYPT_MODE, sKeySpec,ivSpec);
            byte[] original = cipher.doFinal(body.getBytes(CHARSET_NAME));
            return Base64.encodeBase64String(original);
        } catch (Exception e) {
            System.out.println("加密异常"+e.getMessage());
            return "";
        }
    }

    /**
     * AES解密算法
     * @param key  私钥
     * @param iv   盐
     * @param body 需要解密的字符串
     */
    public static String decode(String key, String iv, String body) {
        try {
            SecretKeySpec sKeySpec = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(CBC);
            IvParameterSpec ivSpec = new IvParameterSpec(iv.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, sKeySpec,ivSpec);
            byte[] original = cipher.doFinal(Base64.decodeBase64(body));
            return new String(original, CHARSET_NAME);
        } catch (Exception e) {
            System.out.println("解密异常"+e.getMessage());
            return "";
        }
    }

    public static String randomString(int size) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = size; i > 0; --i) {
            stringBuilder.append(CHARS[(int) Math.floor(Math.random() * CHARS.length)]);
        }
        return stringBuilder.toString();
    }
}
