package com.lyh.service;

import com.lyh.dao.TblpurchaseDao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TblpurchaseService {
    //全查
    public Map tbl_purchaseService(Map map1){
        TblpurchaseDao dao = new TblpurchaseDao();
        List<Map> maps = dao.selectAllTB(map1);
        Map codeMap = new HashMap();
        codeMap.put("code",0);
        codeMap.put("data",maps);
        codeMap.put("msg","ok");
        return codeMap;
    }
    //模糊查询
    public Map likePname(Map map) {
        TblpurchaseDao dao = new TblpurchaseDao();
        List<Map> maps = dao.likePname(map);
        Map codeMap = new HashMap();
        codeMap.put("code", 0);
        codeMap.put("data", maps);
        codeMap.put("msg", "ok");
        return codeMap;
    }

}
