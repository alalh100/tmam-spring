package com.tmam.springtmam;

import com.tmam.springtmam.model.Age;
import com.tmam.springtmam.model.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping("/{name}/{birthday}")
    public List<Info> getInfo(@PathVariable String name, @PathVariable String birthday) {
        LinkedList<Info> infos = new LinkedList<>();
        Info age = new Age(birthday);
        infos.add(age);
        return infos;
    }

}
