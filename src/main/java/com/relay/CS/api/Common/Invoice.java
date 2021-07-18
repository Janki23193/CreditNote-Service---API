package com.relay.CS.api.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    private String id;
    private String invoiceNumber;
    private double value;
    private int createdAt;
    private String creditId;
    private String creditNumber;
    private double valuecredit;
    private int createdAtcr;


}
