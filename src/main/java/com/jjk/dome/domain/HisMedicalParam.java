package com.jjk.dome.domain;

import lombok.Data;

/**
 * @author jq
 */
@Data
public class HisMedicalParam {
    /**
     * 当前调用者
     */
    private String currentUser;

    /**
     * 密文
     */
    private String text;
}
