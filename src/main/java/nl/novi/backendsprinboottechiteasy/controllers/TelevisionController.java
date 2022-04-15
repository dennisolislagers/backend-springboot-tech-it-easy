package nl.novi.backendsprinboottechiteasy.controllers;

// Met de volgende regel importeren we alle annotaties
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//De annotatie maken, het is een controller.
@RestController
//Met de annotatie requestmapping bepalen waar we de gegevens presenteren
@RequestMapping("/alltelevisions")

public class TelevisionController {
//    Het endpoint voor de GET request voor alle televisies
    @GetMapping
    public ResponseEntity<List<Television>>getAllTelevisions(){

        List<Television> stock = List.of(televisions);
        return ResponseEntity.ok(stock);

    }

//  Het endpoint voor de GET request voor een specifieke televisie
    @GetMapping("{id}")
    public ResponseEntity<Television> getTelevisionById(@PathVariable int id) {

        return ResponseEntity.ok();

    }

//    Het endpoint voor de POST request
    @PostMapping
    public ResponseEntity<Television> addNewTelevision(@RequestBody Television newTelevision) {

        return ResponseEntity.created();

    }

//     Het endpoint voor de PUT request
    @PutMapping("{id}")
    public ResponseEntity<Object> updateTelevision(@PathVariable int id, @RequestBody String television) {

        return ResponseEntity.noContent();

    }

//        Het endpoint voor de DELETE request
    @DeleteMapping("{id}")
    public ResponseEntity<Television> deleteTelevision(@PathVariable int id) {

        return ResponseEntity.noContent();

    }

}


