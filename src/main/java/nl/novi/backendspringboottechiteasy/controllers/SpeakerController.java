package nl.novi.backendspringboottechiteasy.controllers;

import nl.novi.backendspringboottechiteasy.models.Speaker;
import nl.novi.backendspringboottechiteasy.models.Television;
import nl.novi.backendspringboottechiteasy.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/allspeakers")

public class SpeakerController {
    private SpeakerRepository speakerRepository;

    @Autowired
    public SpeakerController(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @GetMapping
    public ResponseEntity<List<Speaker>>getAllSpeakers(){
        speakerRepository.findAll();
        return ResponseEntity.ok().body(speakerRepository.findAll());
    }

    @GetMapping("{id}")
    public ResponseEntity<Speaker> getSpeakerById(@PathVariable Long id) {
        return ResponseEntity.ok().body(speakerRepository.findById(id).get());
    }

    @PostMapping
    public ResponseEntity<Speaker> addNewSpeaker(@RequestBody Speaker newSpeaker) throws URISyntaxException {
        speakerRepository.save(newSpeaker);
        URI location = new URI("location");
        return ResponseEntity.created(location).build();
    }

    @PutMapping("{id}")
    public ResponseEntity<Object> updateSpeaker(@PathVariable Long id, @RequestBody String speaker) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public void deleteSpeaker(@PathVariable Long id) {
        speakerRepository.deleteById(id);

    }
}
