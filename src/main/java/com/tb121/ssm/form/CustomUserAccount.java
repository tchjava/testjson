package com.tb121.ssm.form;

import com.tb121.ssm.entity.UserAccountInfo;
import com.tb121.ssm.entity.UserContactInfo;
import com.tb121.ssm.entity.UserStaffInfo;
import lombok.Data;

import java.util.List;

/**
 * @author weng
 */
@Data
public class CustomUserAccount extends UserAccountInfo {
    private UserContactInfo userContactInfo;
    private List<UserStaffInfo> userStaffInfos;
}
