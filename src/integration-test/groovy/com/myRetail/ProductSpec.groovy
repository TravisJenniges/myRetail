package com.myRetail


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class ProductSpec extends Specification {

    def setup() {
        new Product(title: 'Test', description: 'test', price: '9.95').save(flush: true)
        new Product(title: 'Test2', description: 'test2', price: '19.95').save(flush: true)
    }

    def cleanup() {
    }

    void "test count"() {
        expect:
        Product.count() == 2
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
