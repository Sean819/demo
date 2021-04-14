package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * @author sean
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Book {
    private String name;
    private String description;
}
