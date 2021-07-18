package com.relay.CS.api.Common;

import com.relay.CS.api.Entity.Creditnote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregationRequest {

    private Creditnote creditnote;
    private Invoice invoice;
}
