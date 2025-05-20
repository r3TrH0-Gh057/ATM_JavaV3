package com.ATMV2.ATM.entity;

import lombok.*;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String number;
    private double balance;
    @Enumerated(EnumType.STRING)
    private TypeAccount type;
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
    private List<Movent> movents;





    


}
