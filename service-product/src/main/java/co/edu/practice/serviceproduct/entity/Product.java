package co.edu.practice.serviceproduct.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@Entity
@Table(name = "tbl_products")
@Data
@AllArgsConstructor @NoArgsConstructor @Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "The name should not be empty")
    private String name;
    private String description;
    @Positive(message = "The stock must be greater than zero")
    private Double stock;

    private Double price;
    private String status;

    @NotNull(message = "The category should not be empty")
    @Column(name = "creat_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creatAt;

    @ManyToOne(fetch =  FetchType.LAZY)
    @JoinColumn(name = "category_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Category category;



}
