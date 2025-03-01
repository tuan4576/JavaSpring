package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
@RestController
@RequestMapping("/api/products")
public class DemoApplication {
	// @RequestMapping("/")
	// String home() {
	// 	System.out.println("Hello");
	// 	return "Hello World!";
	// }
	@GetMapping 
    public String getAllProducts() {  
        return "Lấy danh sách sản phẩm";  
    }
	@PostMapping  
    public String createProduct() {  
        return "Tạo sản phẩm mới";  
    }  

    @PutMapping("/{id}")  
    public String updateProduct(@PathVariable int id) {  
        return "Cập nhật sản phẩm có ID: " + id;  
    }  

    @DeleteMapping("/{id}")  
    public String deleteProduct(@PathVariable int id) {  
        return "Xóa sản phẩm có ID: " + id;  
    }  

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}