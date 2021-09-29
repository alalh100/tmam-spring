package com.tmam.springtmam.services;

import com.tmam.springtmam.model.*;
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
    public final List<Info> getAllInfo(final String name,
                                       final String birthday) {
        List<Info> infos = new LinkedList<>();
        Info age = new Age(birthday);
        Info luck = new LuckNumber(name);
        Info ageInDays = new AgeInDays(birthday);
        Info dayOfWeek = new DayOfBirth(birthday);
        Info nextBirthday = new NextBirthday(birthday);
        infos.add(age);
        infos.add(ageInDays);
        infos.add(dayOfWeek);
        infos.add(nextBirthday);
        infos.add(luck);
        return infos;
    }
}
