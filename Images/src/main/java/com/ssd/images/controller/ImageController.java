package com.ssd.images.controller;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssd.images.model.Image;
import com.ssd.images.service.ImageService;

@RestController
@RequestMapping("/main")
public class ImageController {
	
	
	@Autowired
	public ImageService imageService;
	
	
	@PostMapping("/image")
	public ResponseEntity<String> uploadImage(@RequestParam("name") MultipartFile file) {
        try {
            imageService.storeImage(file);
            return new ResponseEntity<>("Image uploaded successfully!", HttpStatus.CREATED);
        } catch (IOException e) {
            return new ResponseEntity<>("Failed to upload image.", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    

	}
	@GetMapping("/image/{id}")
    public ResponseEntity<byte[]> getImageById(@PathVariable String id) {
        Optional<Image> imageOptional = imageService.getImageById(id);
        if (imageOptional.isPresent()) {
            Image image = imageOptional.get();
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_JPEG) 
                    .body(image.getImagedata());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
