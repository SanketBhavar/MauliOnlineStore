package com.ecommerce.store.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ecommerce.store.entities.dao.Product;
import com.ecommerce.store.entities.dto.ProductCreationDto;
import com.ecommerce.store.entities.dto.ProductUpdationDto;
import com.ecommerce.store.services.ProductService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping ("/api/v1/products")
@Api (value = "Product Controller", description = "Available operations on Products")
@RequiredArgsConstructor
@Slf4j
public class ProductController {

    private final ProductService productService;

    @ApiOperation (value = "Create a new Product", response = ResponseEntity.class)
    @ApiResponses ({
        @ApiResponse (code = 201, message = "Created"),
        @ApiResponse (code = 400, message = "Bad Request"),
        @ApiResponse (code = 403, message = "Forbidden"),
        @ApiResponse (code = 409, message = "Conflict")
    })
    @PostMapping (produces = "application/json")
    @ResponseBody
    public ResponseEntity createProduct(@RequestBody @Valid ProductCreationDto product) {
        log.info("### New Product creation request - {}", product);

        Product created = productService.createProduct(product);
        return new ResponseEntity(created, HttpStatus.CREATED);
    }

   
