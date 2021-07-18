package com.relay.CS.api.controller;

import com.relay.CS.api.Common.AggregationRequest;
import com.relay.CS.api.Common.AggregationResponse;
import com.relay.CS.api.Common.Invoice;
import com.relay.CS.api.Entity.Creditnote;
import com.relay.CS.api.service.CreditnoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creditnote")
public class CreditnoteController {
    @Autowired
    private CreditnoteService service;   // injecting the creditnote service

    @PostMapping("/bookcreditnote")
    public AggregationResponse bookcreditnote(@RequestBody AggregationRequest aggregationRequest){

        return service.saveCreditnote(aggregationRequest);
    }

}
