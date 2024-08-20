package com.df.probstat.service;

import com.df.probstat.model.WDModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WDService {

    List<WDModel> machines= new ArrayList<>(Arrays.asList(new WDModel(1,false),
            new WDModel(2, true),
            new WDModel(3, false),
            new WDModel(4, false),
            new WDModel(5, false),
            new WDModel(6, false),
            new WDModel(7, false),
            new WDModel(8, false),
            new WDModel(9, false),
            new WDModel(10, false)
    ));

    public String select(int id){
        WDModel w1= get(id+1);
        WDModel w=get(id);
        if(w.isAvailability()==true){
            //logger.warn("Can't book washer, it is not available at: {}",w.getTime());
            return "Can't book, washer and dryer are not available";
        } else if (w1.isAvailability()==true) {
            //logger.warn("Can't book washer, it is not available at: {}",w.getTime());
            return "Can't book, washer and dryer are not available";
        } else{
            //logger.debug("Blocking the washer and dryer for the next 2 hours:{},{}",id,id+1);
            w.setAvailability(true);
            w1.setAvailability(true);
        }
        //logger.info("Booked washer successfully at time:{}",id);
        return "Booked!";
    }

    public List<Integer> getAll(){
        List<Integer> w=new ArrayList<>();
        for(WDModel wd:machines){
            if(wd.isAvailability()==true){
                //logger.warn("Washer not available at: {}",wd.getTime());
                continue;
            }
            w.add(wd.getTime());
        }
        //logger.debug("These are available washers:{}",w);
        return w;
    }

    public WDModel get(int id){
        for(WDModel w:machines){
            if(w.getTime()==id){
                return w;
            }
        }
        //logger.warn("WRONG TIME, washer/dryer isn't started for the day");
        return new WDModel(0,true);
    }

    public String getAvailability(int id){
        WDModel w=get(id);
        WDModel w1=get(id+1);
        if(w.isAvailability()==true){
            //logger.warn("Washer is not available at this time:{}",id);
            return "Not available";
        } else if (w1.isAvailability()==true) {
            //logger.warn("Washer is not available at this time:{}",id);
            return "Not available";
        }
        //logger.info("Washer is available at the time:{}",id);
        return "Available";
    }

    public void add(WDModel m){
        machines.add(m);
    }

    public void addtomodel(int time, boolean avail){
        WDModel w = new WDModel(time, avail);
        machines.add(w);
    }




}
