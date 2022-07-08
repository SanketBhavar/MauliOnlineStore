package com.ecommerce.store.services.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import com.ecommerce.store.entities.dao.Order;
import com.ecommerce.store.entities.dao.OrderItem;
import com.ecommerce.store.entities.dto.OrderDto;
import com.ecommerce.store.exceptions.NoItemsInOrderException;
import com.ecommerce.store.exceptions.ProductNotExistsException;
import com.ecommerce.store.repositories.OrderItemRepository;
import com.ecommerce.store.repositories.OrderRepository;
import com.ecommerce.store.repositories.ProductRepository;
import com.ecommerce.store.services.OrderService;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static java.util.Objects.isNull;

