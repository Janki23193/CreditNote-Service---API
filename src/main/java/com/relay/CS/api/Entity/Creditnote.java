package com.relay.CS.api.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDITNOTE_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Creditnote {
    @Id
    private String id ;
    private String creditNumber;
    private double value;
    private int createdAt;
}
