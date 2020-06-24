package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product bread = new Product("Bread");
        Product milk = new Product("Milk");
        Product eggs = new Product("Eggs");
        Product flour = new Product("Flour");

        Item breadOrderItem = new Item(new BigDecimal(5), 50);
        Item milkOrderItem = new Item(new BigDecimal(3), 34);
        Item eggsOrderItem = new Item(new BigDecimal(8), 27);
        Item flourOrderItem = new Item(new BigDecimal(2), 46);

        Invoice invoice = new Invoice("002");

        breadOrderItem.setProduct(bread);
        milkOrderItem.setProduct(milk);
        eggsOrderItem.setProduct(eggs);
        flourOrderItem.setProduct(flour);

        breadOrderItem.setInvoice(invoice);
        milkOrderItem.setInvoice(invoice);
        eggsOrderItem.setInvoice(invoice);
        flourOrderItem.setInvoice(invoice);

        bread.getItems().add(breadOrderItem);
        milk.getItems().add(milkOrderItem);
        eggs.getItems().add(eggsOrderItem);
        flour.getItems().add(flourOrderItem);

        invoice.getItems().add(breadOrderItem);
        invoice.getItems().add(milkOrderItem);
        invoice.getItems().add(eggsOrderItem);
        invoice.getItems().add(flourOrderItem);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        try {
            invoiceDao.deleteById(id);
        } catch (Exception e) {
            //do nothing
        }
    }
}
