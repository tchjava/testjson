package com.tb121.ssm.form;

import lombok.Data;
import org.apache.ibatis.type.Alias;


@Data
@Alias("accountContactVo")
public class AccountContactVo{
    private String id;
    private String username;
    private String gender;
    private String phone;


}
