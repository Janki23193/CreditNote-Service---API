package com.relay.CS.api.Common;

import com.relay.CS.api.Entity.Creditnote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregationResponse {

    private Creditnote creditnote;
    private String Id;
    private String invoiceNumber;
    private double value;
    private int createdAt;
    private String creditId;
    private String creditNumber;
    private double valuecredit;
    private int createdAtcr;
}
