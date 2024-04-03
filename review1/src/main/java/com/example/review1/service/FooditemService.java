package com.example.review1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.review1.repository.FooditemRepo;
import com.example.review1.model.Fooditem;
@Service
public class FooditemService {
     @Autowired
     FooditemRepo ev;
     public Fooditem create(Fooditem e){
      return ev.save(e);
     }
     public List<Fooditem> getAll(){
      return ev.findAll();
     }
     public Fooditem getId(int eid){
      return ev.findById(eid).orElse(null);
     }
     public boolean update(int eid,Fooditem ee){
          if(this.getId(eid)==null)
          {
              return false;
          }
          try{
              ev.save(ee);
          }
          catch(Exception ex)
          {
              return false;
          }
          return  true;
     }
     public boolean delete(int eid){
          if(this.getId(eid)==null){
             return false;
          }
          ev.deleteById(eid);
          return true;
     }
}