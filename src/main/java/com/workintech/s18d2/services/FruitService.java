package com.workintech.s18d2.services;

import com.workintech.s18d2.entity.Fruit;

import java.util.List;

public interface FruitService {
     List<Fruit> getByPriceDesc();
     Fruit getById(Long id);
     List<Fruit> getByPriceAsc();
     Fruit save(Fruit fruit);
     List<Fruit> searchByName(String name);
     Fruit delete(Long id);

}
