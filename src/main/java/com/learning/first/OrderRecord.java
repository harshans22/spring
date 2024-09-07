package com.learning.first;


//for record, we don't need to use @JsonProperty annotation and getter setter and toString method it does it automatically
public record OrderRecord(String customerName,
                         String productName,
                         int quantity) {

}
