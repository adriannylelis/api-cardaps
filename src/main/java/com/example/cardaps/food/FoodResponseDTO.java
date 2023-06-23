package com.example.cardaps.food;

public record FoodResponseDTO(Long id, String title, String imageURL, Integer price) { // declarado as propriedades
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImageURL(), food.getPrice());
    }
}
