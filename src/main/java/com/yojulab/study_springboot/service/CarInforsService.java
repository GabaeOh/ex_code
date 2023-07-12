package com.yojulab.study_springboot.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yojulab.study_springboot.dao.SharedDao;

@Service
@Transactional
public class CarInforsService {
    @Autowired
    SharedDao sharedDao;

    public Map exselectSearch(Map dataMap) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarInfors.excode";
        
        HashMap result = new HashMap<>();
        result.put("resultList", sharedDao.getList(sqlMapId, dataMap));
        return result;
    }
    
    // MVC view
    public Object delete(Map dataMap) {
        String sqlMapId = "CarInfors.delete";

        Object result = sharedDao.delete(sqlMapId, dataMap);
        return result;
    }

    // MVC view
    public Object deleteAndSelectSearch(String UNIQUE_ID, Map dataMap) {
        dataMap.put("COMMON_CODE_ID", UNIQUE_ID);

        HashMap result = new HashMap<>();
        result.put("deleteCount", this.delete(dataMap));
        result.putAll(this.exselectSearch(dataMap));
        return result;
    }
     
    public Object insert(Map dataMap) {
        String sqlMapId = "CarInfors.insert";
        Object result = sharedDao.insert(sqlMapId, dataMap);
        return result;
    }
    
     public Object insertAndSelectSearch(Map dataMap) {
        HashMap result = new HashMap<>();
        result.put("insertCount", this.insert(dataMap));
        result.putAll(this.exselectSearch(dataMap));
        return result;
    }
    
        public Object update(Map dataMap) {
        String sqlMapId = "CarInfors.update";
        Object result = sharedDao.update(sqlMapId, dataMap);
        return result;
    }
    public Object updateAndSelectSearch(String UNIQUE_ID, Map dataMap) {
        dataMap.put("COMMON_CODE_ID", UNIQUE_ID); //유니크 아이디 받아와서 dataMap에 저장
        HashMap result = new HashMap<>();
        result.put("updateCount", this.update(dataMap));
        result.putAll(this.exselectSearch(dataMap));
        return result;
    }

    public Object selectDetail(String COMMON_CODE_ID, Map dataMap) {
        // Object getOne(String sqlMapId, Object dataMap)
        String sqlMapId = "CarInfors.detail";
        dataMap.put("COMMON_CODE_ID", COMMON_CODE_ID); 
        Object result = sharedDao.getOne(sqlMapId, dataMap);
        return result;
    }
}

  