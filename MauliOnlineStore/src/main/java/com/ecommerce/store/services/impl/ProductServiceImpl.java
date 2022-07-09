package com.ecommerce.store.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.ecommerce.store.entities.dao.Product;
import com.ecommerce.store.entities.dto.ProductCreationDto;
import com.ecommerce.store.entities.dto.ProductUpdationDto;
import com.ecommerce.store.exceptions.ProductNotExistsException;
import com.ecommerce.store.repositories.ProductRepository;
import com.ecommerce.store.services.ProductService;
import java.util.List;
import static java.util.Objects.nonNull;
import static org.springframework.util.StringUtils.hasLength;

