package com.tmam.springtmam;

import com.tmam.springtmam.model.Age;
import com.tmam.springtmam.model.Info;
import com.tmam.springtmam.model.LuckNumber;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/info")
public class Controller {

    @GetMapping("/{name}/{birthday}")
    public List<Info> getInfo(@PathVariable String name, @PathVariable String birthday) {
        LinkedList<Info> infos = new LinkedList<>();
        Info age = new Age(birthday);
        Info luck = new LuckNumber(name);
        infos.add(age);
        infos.add(luck);
        return infos;
    }

}
