package com.example.review1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.review1.model.Fooditem;
public interface FooditemRepo extends JpaRepository<Fooditem,Integer> {

}