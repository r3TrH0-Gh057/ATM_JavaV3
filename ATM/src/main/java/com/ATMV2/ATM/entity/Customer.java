package com.ATMV2.ATM.entity;

import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    private String name;
    private String identification;
    private String pin;
    private boolean blocked;
    private int failedAttempts;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List <Account> accounts;

    //Métodos para intentos
    public int getAttempts() {
        return this.failedAttempts;
    }

    public void setAttempts(int attempts) {
        this.failedAttempts = attempts;

    }

    public void increaseAttempts() {
        this.failedAttempts++;
    }

    public void reebotAttempts() {
        this.failedAttempts = 0;
    }

    public String getCompleteName(){
        return this.name;
    }

    





    


}
