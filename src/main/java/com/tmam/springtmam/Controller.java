package com.tmam.springtmam;

import com.tmam.springtmam.model.Info;
import com.tmam.springtmam.services.InfoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/info")
public class Controller {

    private final InfoService infoService = new InfoService();

    /**
     * Sending the calculated informations as REST to the frontend application
     *
     * @param name     name of the person
     * @param birthday birthday of the person
     * @return Informations out of the name and the birthday
     */

    @GetMapping("/{name}/{birthday}")
    public List<Info> getInfo(@PathVariable final String name,
                              @PathVariable final String birthday) {
        return infoService.getAllInfo(name, birthday);
    }

}
