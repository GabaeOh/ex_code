package com.yojulab.study_springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.yojulab.study_springboot.service.CarInforsService;

@Controller
@RequestMapping("/carInfor")
public class CarInforsController {
    @Autowired
    CarInforsService carInforsService;

     @GetMapping("/exselectSearch")
    public ModelAndView exselectSearch(@RequestParam Map params
                            , ModelAndView modelAndView) {
        Object result = carInforsService.exselectSearch(params);
        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        
        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map_ex.jsp");
        return modelAndView;
    }

    // delete with MVC
    @PostMapping("/deleteAndSelectSearch/{UNIQUE_ID}")
    public ModelAndView deleteAndSelectSearch(@RequestParam Map params,
                            @PathVariable String UNIQUE_ID , ModelAndView modelAndView) {
        Object result = carInforsService.deleteAndSelectSearch(UNIQUE_ID, params); //호출 
        modelAndView.addObject("params", params); //modelAndView 객체에 params와 result를 추가
        modelAndView.addObject("result", result);

        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map_ex.jsp");
        return modelAndView;
    }
    // INSERT
    
    @PostMapping("/insertForm")
    public ModelAndView insertForm(@RequestParam Map params, ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/views/carinfor/InsertForm.jsp");
        return  modelAndView;
    }

    @PostMapping("/insertAndSelectSearch")
    public ModelAndView insertAndSelectSearch(@RequestParam Map params,
                             ModelAndView modelAndView) {
        Object result = carInforsService.insertAndSelectSearch(params);

        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map_ex.jsp");

        return modelAndView;
    }


    @PostMapping("/updateForm/{UNIQUE_ID}")
    public ModelAndView update_Com(@PathVariable String UNIQUE_ID, @RequestParam Map params, ModelAndView modelAndView) {

               modelAndView.setViewName("/WEB-INF/views/carinfor/UpdateForm.jsp");
        return  modelAndView;
    }
    
     @PostMapping("/updateAndSelectSearch/{UNIQUE_ID}")
    public ModelAndView updateAndSelectSearch(@PathVariable String UNIQUE_ID, @RequestParam Map params, ModelAndView modelAndView) {
        Object result = carInforsService.updateAndSelectSearch(UNIQUE_ID, params);

        modelAndView.addObject("params", params);
        modelAndView.addObject("result", result);
        modelAndView.setViewName("/WEB-INF/views/carinfor/list_map_ex.jsp");

        return modelAndView;
    }

    }


    // // create
    // @PostMapping("/insert")
    // public ResponseEntity insert(@RequestBody Map paramMap) {
    //     Object result = carInforsService.insert(paramMap);
    //     return ResponseEntity.ok().body(result);
    // }

    


    // @GetMapping("/selectInUID")
    // public ResponseEntity selectInUID(@RequestBody Map paramMap) {
    //     Object result = null;
    //     try {
    //         result = carInforsService.selectInUID(paramMap);
    //     } catch (Exception e) {
    //         return ResponseEntity.badRequest().body(result);
    //     }
    //     return ResponseEntity.ok().body(result);
    // }

    // /selectSearch?search=YEAR&words=2020
    // /selectSearch/CAR_NAME/소
    // @GetMapping("/selectSearch")
    // public ModelAndView selectSearch(@RequestParam Map params
    //                         , ModelAndView modelAndView) {
    //     Object result = carInforsService.selectSearch(params);
    //     modelAndView.addObject("params", params);
    //     modelAndView.addObject("result", result);
        
    //     modelAndView.setViewName("/WEB-INF/views/carinfor/list_map.jsp");
    //     return modelAndView;
    // }

    // /selectSearch?search=YEAR&words=2020
    // /exselectSearch/PARENT_COMMON_CODE_ID/
    
   
    // create
    // @PostMapping("/InsertForm")
    // public ModelAndView insertAndSelectSearch(@RequestParam Map params,
    //                         @PathVariable String UNIQUE_ID , ModelAndView modelAndView) {
        
    //     Object result = carInforsService.insertAndSelectSearch(UNIQUE_ID, params);
    //     modelAndView.addObject("params", params);
    //     modelAndView.addObject("result", result);
    //     modelAndView.setViewName("/WEB-INF/views/carinfor/list_map_ex.jsp");
    //     return modelAndView;
    // }


    // delete with MVC
    // @PostMapping("/delete")
    // public ModelAndView delete(@RequestParam Map params
    //                         , ModelAndView modelAndView) {
    //     Object result = carInforsService.delete(params);
    //     modelAndView.addObject("params", params);

    //     modelAndView.setViewName("/WEB-INF/views/carinfor/list_map_ex.jsp");
    //     return modelAndView;
    // }

    // @GetMapping("/selectAll/{CAR_INFOR_ID}")
    // public ResponseEntity selectAll(@PathVariable String CAR_INFOR_ID) {
    //     Object result = carInforsService.selectAll(CAR_INFOR_ID);
    //     return ResponseEntity.ok().body(result);
    // }

    // // /selectDetail/CI002
    // @GetMapping("/selectDetail/{CAR_INFOR_ID}")
    // public ResponseEntity selectDetail(@PathVariable String CAR_INFOR_ID) {
    //     Object result = carInforsService.selectDetail(CAR_INFOR_ID);
    //     return ResponseEntity.ok().body(result);
    // }



    

    // // update
    // @PutMapping("/update")
    // public ResponseEntity update(@RequestBody Map paramMap) {
    //     Object result = carInforsService.update(paramMap);
    //     return ResponseEntity.ok().body(result);
    // }

    // // 2PC create
    // @PostMapping("/insertDouble")
    // public ResponseEntity insertDouble(@RequestBody Map paramMap) {
    //     Object result = null;
    //     try {
    //         result = carInforsService.insertDouble(paramMap);
    //     } catch (Exception e) {
    //         return ResponseEntity.badRequest().body(result);
    //     }
    //     return ResponseEntity.ok().body(result);
    // }


