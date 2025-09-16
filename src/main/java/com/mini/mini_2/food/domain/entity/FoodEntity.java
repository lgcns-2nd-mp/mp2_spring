package com.mini.mini_2.food.domain.entity;

import com.mini.mini_2.rest_area.domain.entity.RestAreaEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "food")

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FoodEntity {
    
    // PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer foodId;
    
    // FK
    @ManyToOne(fetch = FetchType.LAZY, 
               optional = false)
    @JoinColumn(name = "rest_area_id", 
                nullable = false)
    private RestAreaEntity restArea;
    
    @Column(nullable = false , 
            length = 50)
    private String foodName ;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String isSignature;

    @Column(length = 1000)
    private String description;

}
