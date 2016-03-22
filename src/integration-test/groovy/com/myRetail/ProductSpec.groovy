package com.myRetail


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class ProductSpec extends Specification {

    def setup() {
        //no need to load data since we do it via bootstrap
    }

    def cleanup() {
    }

    void "test count"() {
        expect:
        Product.count() == 4 //matches the number of products loaded via bootstrap
    }

    void "test read and update"() {
        when:
        def products = Product.findAll()
        def prodId = products[0].id
        products[0].title = 'updated title'
        products[0].save()

        then:
        Product.get(prodId).title == 'updated title'
    }
}
