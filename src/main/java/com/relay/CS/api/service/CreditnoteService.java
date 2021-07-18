package com.relay.CS.api.service;

import com.relay.CS.api.Common.AggregationRequest;
import com.relay.CS.api.Common.AggregationResponse;
import com.relay.CS.api.Common.Invoice;
import com.relay.CS.api.Entity.Creditnote;
import com.relay.CS.api.repository.CreditnoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class CreditnoteService {
    @Autowired
    private CreditnoteRepository repository;
    @Autowired
    private RestTemplate template;

    public AggregationResponse saveCreditnote(AggregationRequest aggregationRequest){

        Creditnote creditnote = aggregationRequest.getCreditnote();
        creditnote.setId(UUID.randomUUID().toString());
        creditnote.setCreatedAt(UUID.randomUUID().hashCode());

        Invoice invoice = aggregationRequest.getInvoice();
        invoice.setId(invoice.getId());
        invoice.setInvoiceNumber(invoice.getInvoiceNumber());
        invoice.setValue(invoice.getValue());
        invoice.setCreatedAt(invoice.getCreatedAt());
        invoice.setCreditId(creditnote.getId());
        invoice.setCreditNumber(creditnote.getCreditNumber());
        invoice.setValuecredit(creditnote.getValue());
        invoice.setCreatedAtcr(creditnote.getCreatedAt());



        Invoice invoiceResponse = template.postForObject("http://localhost:9192/invoice/bookInvoice",invoice,Invoice.class);

        repository.save(creditnote);
        return new AggregationResponse(creditnote,invoiceResponse.getId(),invoiceResponse.getInvoiceNumber(),invoiceResponse.getValue(),invoiceResponse.getCreatedAt(),creditnote.getId(),invoiceResponse.getCreditNumber(),invoiceResponse.getValuecredit(),creditnote.getCreatedAt());

    }

}
