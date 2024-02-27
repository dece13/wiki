package com.wiki.wiki;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import java.nio.file.Files;
@RestController
public class StaticResourceController {

    @GetMapping("/static/{filename:.+}")
    public ResponseEntity<byte[]> getStaticResource(@PathVariable String filename) throws IOException {
        Resource resource = new ClassPathResource("static/" + filename);
        byte[] data = Files.readAllBytes(resource.getFile().toPath());
        return ResponseEntity.ok().contentType(MediaType.IMAGE_JPEG).body(data);
    }
}