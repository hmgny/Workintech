package com.workintech.zoo.validations;

import com.workintech.zoo.entity.Kangaroo;
import com.workintech.zoo.exceptions.ZooException;
import org.springframework.http.HttpStatus;

import java.util.Map;

public class KangarooValidation {

    public static void isIdValid(Integer id){
        if(id== null || id<0){
            throw new ZooException("Id is not valid" + id, HttpStatus.BAD_REQUEST);
        }
    }

    public static void checkKangarooExistence(Map<Integer, Kangaroo> kangaroos, Integer id, Boolean existence){
        if(existence){
            if(!kangaroos.containsKey(id)){
                throw new ZooException("Record is not exist: "+ id, HttpStatus.NOT_FOUND);
            }
        }else {
            if(kangaroos.containsKey(id)){
                throw new ZooException("Record is already exist: "+ id, HttpStatus.BAD_REQUEST);
            }
        }
    }

    public static void checkKangarooWeight(Double weight){
        if(weight == null || weight<=0){
            throw new ZooException("Weight can not less than zero or null: "+ weight, HttpStatus.BAD_REQUEST);

        }
    }

    public static void checkKangarooHeight(Double height){
        if(height== null || height <=0){
            throw new ZooException("Height can not less than zero or null" + height, HttpStatus.BAD_REQUEST);
        }
    }



}
