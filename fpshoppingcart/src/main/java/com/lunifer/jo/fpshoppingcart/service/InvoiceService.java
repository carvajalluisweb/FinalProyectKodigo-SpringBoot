package com.lunifer.jo.fpshoppingcart.service;

import com.lunifer.jo.fpshoppingcart.dto.InvoiceDTO;


public interface InvoiceService {
    public InvoiceDTO createInvoice(InvoiceDTO invoiceDTO);
    public InvoiceDTO getInvoiceByOrderId(Long orderId);
    public InvoiceDTO updateInvoice(InvoiceDTO invoiceDTO, Long invoiceId);
    public void deleteInvoice(Long invoiceId);
    public void deleteInvoiceByOrderId(long orderId);
}
