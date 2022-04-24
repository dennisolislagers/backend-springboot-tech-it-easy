package nl.novi.backendspringboottechiteasy.controllers;

// Met de volgende regel importeren we alle annotaties
import nl.novi.backendspringboottechiteasy.models.Television;
import nl.novi.backendspringboottechiteasy.repositories.TelevisionRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

//De annotatie maken, het is een controller.

//Met de annotatie requestmapping bepalen waar we de gegevens presenteren
@RestController
@RequestMapping("/alltelevisions")
public class TelevisionController {

    private TelevisionRepository televisionRepository;

    @Autowired
    public TelevisionController(TelevisionRepository televisionRepository) {
        this.televisionRepository = televisionRepository;
    }

    //    Het endpoint voor de GET request voor alle televisies
    @GetMapping
    public ResponseEntity<List<Television>>getAllTelevisions(){
        televisionRepository.findAll();
        return ResponseEntity.ok().body(televisionRepository.findAll());

    }

//  Het endpoint voor de GET request voor een specifieke televisie
    @GetMapping("{id}")
    public ResponseEntity<Television> getTelevisionById(@PathVariable Long id) {
        return ResponseEntity.ok().body(televisionRepository.findById(id).get());

    }

//    Het endpoint voor de POST request
    @PostMapping
    public ResponseEntity<Television> addNewTelevision(@RequestBody Television newTelevision) throws URISyntaxException {
        televisionRepository.save(newTelevision);
        URI location = new URI("location");
        return ResponseEntity.created(location).build();

    }

//     Het endpoint voor de PUT request
    @PutMapping("{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable Long id, @RequestBody String television) {
        return ResponseEntity.noContent().build();

    }

//        Het endpoint voor de DELETE request
    @DeleteMapping("{id}")
    public void deleteTelevision(@PathVariable Long id) {
        televisionRepository.deleteById(id);

    }

}


