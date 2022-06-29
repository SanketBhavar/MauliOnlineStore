package com.ecommerce.store.entities.dao;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@ApiModel (description = "The Order Entity")
@Entity
@Table (name = "orders")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    private static final long serialVersionUID = -8832862623919132232L;

    @Id
    @GeneratedValue (generator = "UUID")
    @GenericGenerator (
        name = "UUID",
        strategy = "org.hibernate.id.UUIDGenerator")
    @Column (name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column (name = "buyer_email", nullable = false)
    private String buyerEmail;

    @OneToMany (mappedBy = "order", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<OrderItem> items;

    @CreationTimestamp
    @Column (name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column (name = "updated_at")
    private LocalDateTime updatedAt;

}

