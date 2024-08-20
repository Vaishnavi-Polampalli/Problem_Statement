package com.df.probstat.controller;

import com.df.probstat.model.WDModel;
import com.df.probstat.service.WDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Objects;

@Controller
public class WDController {

    @Autowired
    WDService service;

    @GetMapping("/")
    public String show(Model m){
        System.out.println("Controller method invoked");
        m.addAttribute("message","Hello");
        return "welcome";
    }

    @RequestMapping("/form")
    public String showForm() {
        return "index";
    }

    @PostMapping("/submitform")
    @ResponseBody
    //@Operation(description = "To get the data from the user by creating a form in jsp page", summary = "To get the data from the user")
    public String index(@RequestParam("time") int time,
                              @RequestParam(value = "availability", defaultValue = "false") boolean availability, Model m) {
        m.addAttribute("time",time);
        m.addAttribute("availability",availability);
        String avail= service.getAvailability(time);
        if(Objects.equals(avail, "Available")){
            return "Booked";
        }else {
            return "Washer/Dryer is in use, Please choose other time";
        }
    }


    @PostMapping("/add")
    public String add(@RequestBody WDModel wd){
        service.add(wd);
        return "Success";
    }

    //@Operation(description = "To book washer and dryer", summary = "To book a slot")
    @PutMapping("/select/{id}")
    @ResponseBody
    public String select(@PathVariable int id){
        //logger.info("Using washer and dryer if available at:{}", id);
        return service.select(id);
    }

    //@Operation(description = "To get all the available time slots for booking washer and dryer", summary = "To check all slots")
    @GetMapping("/available")
    @ResponseBody
    public List<Integer> available(){
        //logger.info("Getting all available times for using washer and dryer");
        List<Integer> result= service.getAll();
        //logger.debug("Returning all available times for using washer and dryer: {}",result);
        return result;
    }

    //@Operation(description = "To find out whether washer and dryer are available at a particular time", summary = "To check a particular slot")
    @GetMapping("/available/{id}")
    @ResponseBody
    public String getAvailability(@PathVariable int id){
        //logger.info("Checking if washer and dryer are available at time: {}", id);
        String result= service.getAvailability(id);
        //logger.debug("Returning availability at time: {}",id);
        return result;
    }

    //@Hidden
    @GetMapping("/get/{id}")
    @ResponseBody
    public WDModel get(@PathVariable int id){
        //logger.info("Checking if washer and dryer are available at {} time", id);
        WDModel res = service.get(id);
        //logger.debug("Returning time and its availability: {}",result);
        return res;
    }
}
