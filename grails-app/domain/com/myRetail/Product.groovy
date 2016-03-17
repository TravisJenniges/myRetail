package com.myRetail

class Product {

    String description
    String title
    BigDecimal price
    boolean active = false;

    static constraints = {
        description size: 1..150, blank: false
        title size: 1..50, blank: false
        price min: 0.01
    }
}
