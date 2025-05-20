package com.ATMV2.ATM.entity;

import java.time.LocalDateTime;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Movent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime date;
    @Enumerated(EnumType.STRING)
    private Typemovimiento type;
    private double amount;
    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Account account;

}
