package com.example.cardaps.food;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "foods")
@Entity(name = "foods")
@Getter
@NoArgsConstructor //Declara um constructor q n recebe nenhum argumento
@AllArgsConstructor //Declarar um constructor que recebe todos argumentos
@EqualsAndHashCode(of = "id") //indicacao que o ID é a representacao unica da FOOD9
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String imageURL;
    private Integer price;


    public Food(FoodRequestDTO data){
        this.title = data.title();
        this.imageURL = data.imageURL();
        this.price = data.price();
    }

}
