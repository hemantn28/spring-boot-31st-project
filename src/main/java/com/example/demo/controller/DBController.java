package com.example.demo.controller;

import com.example.demo.model.Car;
import com.example.demo.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBController {

    //Create
    @Autowired
    DBService service;

    @RequestMapping(value = "add_car_db", method = RequestMethod.POST)
    public String add(@RequestBody Car car){
        return service.add(car);

    }

    //Get

    @RequestMapping(value = "get_car_db", method = RequestMethod.GET)
    public List<Car> getAll(){
        return service.getAll();
    }

    //Update

    @RequestMapping(value = "update_car_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name, @RequestParam Integer id){
        service.update("Maruti",127);
        return "car updated in db successfully...";

    }

    @RequestMapping(value = "delete_car_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        service.delete(126);
        return "car deleted in db successfully...";


    }
}
