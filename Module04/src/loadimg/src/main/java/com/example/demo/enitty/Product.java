package com.example.demo.enitty;


import javax.persistence.*;




@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String image;



    public Product(ProductBuilder productBuilder) {
        this.name = productBuilder.name;
        this.description = productBuilder.description;
        this.image = productBuilder.image;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public static class ProductBuilder {
        private final String name;
        private String description;
        private String image;
        public ProductBuilder(String name) {
            this.name = name;
        }


        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }
        public Product build() {
            return new Product(this);
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}
