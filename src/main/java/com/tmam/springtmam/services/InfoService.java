package com.tmam.springtmam.services;

import com.tmam.springtmam.model.Age;
import com.tmam.springtmam.model.Info;
import com.tmam.springtmam.model.LuckNumber;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class InfoService {

    /**
     * Getting all model objects to give it to the controller
     *
     * @param name     input name
     * @param birthday input birthday
     * @return list of all the objects that contains the informations
     */
    public final List<Info> getAllInfo(final String name, final String birthday) {
        List<Info> infos = new LinkedList<>();
        Info age = new Age(birthday);
        Info luck = new LuckNumber(name);
        infos.add(age);
        infos.add(luck);
        return infos;
    }
}
