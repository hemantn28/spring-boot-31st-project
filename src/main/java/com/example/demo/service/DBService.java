package com.example.demo.service;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class DBService {

    @Autowired
    CarRepository repository;

    public String add(Car car){
        repository.save(car);
        return "car added to db Successfully...";

    }

    public List<Car> getAll(){
        return repository.findAll();
    }


    public String update(@RequestParam String name,@RequestParam Integer id){
        Car car=repository.getById(id);
        car.setName("Maruti");
        repository.save(car);
        return "car updated in Db successfully...";


    }


    public String delete(@PathVariable Integer id){
        repository.deleteById(id);
        return "car deleted in db successfully...";

    }

}
