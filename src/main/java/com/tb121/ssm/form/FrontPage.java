package com.tb121.ssm.form;

import com.baomidou.mybatisplus.plugins.Page;
import lombok.Data;

import java.util.List;
@Data
public class FrontPage {
   private int rows;
   private int page;
   private String sidx;
   private String sort;


}
