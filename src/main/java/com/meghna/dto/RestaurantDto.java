package com.meghna.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Embeddable

public class RestaurantDto {
    private String title;
   @Column(length = 1000)
   private List<String> images;
    private Long id;
    private String description;



}
