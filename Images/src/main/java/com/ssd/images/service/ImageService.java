package com.ssd.images.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ssd.images.model.Image;
import com.ssd.images.repository.ImageRepository;

@Service
public class ImageService {
	
	@Autowired
	public ImageRepository imageRepository;
	
	public Image storeImage(MultipartFile file) throws IOException {
        byte[] imageData = file.getBytes();
        Image image = new Image();
        image.setName(file.getOriginalFilename());
        image.setImagedata(imageData);
        return imageRepository.save(image);
    }
	
	  public Optional<Image> getImageById(String id) {
	        return imageRepository.findById(id);
	    }
    public List<Image> getAllImages(String id) {
        return imageRepository.findAll();
    }
	

}
