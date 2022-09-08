package com.american.used_cars_inc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

//not implemented yet
@Entity
@Getter
@Setter
public class Transaction {
    @Id
    private long id;
    private TransactionType transactionType;
}
