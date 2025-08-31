package silva.wandeilson.springboot2.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import silva.wandeilson.springboot2.domain.Anime;
import silva.wandeilson.springboot2.util.DateUtil;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    @GetMapping(path = "list")
    public List<Anime> list(){
        log.info("Data Hora-> " + dateUtil.formartLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("aaaa"), new Anime("Berserk"));
    }

    @GetMapping(path = "list2")
    public List<Anime> list2(){
        log.info("Data Hora-> " + dateUtil.formartLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return List.of(new Anime("bbbbb"), new Anime("Berserk"));
    }

}
