package com.myRetail.rest

import grails.rest.*
import com.myRetail.Product

class ProductsController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ProductsController() {
        super(Product)
    }

    def index() {
        respond Product.findAll {
            active == true
        }
    }

    def show(Product product) {
        if(product?.active) {
            respond product
        }else{
            render status:404
        }
    }
}
