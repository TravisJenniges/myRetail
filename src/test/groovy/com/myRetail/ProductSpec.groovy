package com.myRetail

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Product)
class ProductSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test required fields"() {
        when: 'product has no values'
        def p = new Product()

        then: 'validation should fail'
        !p.validate()
    }

    void "test blank values"() {
        when: 'product has blank values for title and description'
        def p = new Product(title: ' ', description: ' ', price: new BigDecimal(9.95))

        then: 'validation should fail'
        !p.validate()
    }

    void "test max size"() {
        when: 'product has value for title and description that are too long'
        def p = new Product(title: 'abcdefghijklmnopqrstuvwzyzabcdefghijklmnopqrstuvwzyz',
                        description: 'abcdefghijklmnopqrstuvwzyzabcdefghijklmnopqrstuvwzyzabcdefghijklmnopqrstuvwzyzabcdefghijklmnopqrstuvwzyzabcdefghijklmnopqrstuvwzyzabcdefghijklmnopqrstuvwzyz',
                        price: '9.95')

        then: 'validation should fail'
        !p.validate()
    }

    void "test min price"() {
        when: 'product has blank values for title and description'
        def p = new Product(title: ' ', description: ' ', price: '9.95')

        then: 'validation should fail'
        !p.validate()
    }

    void "test valid instance"() {
        when: 'product has valid values for all properties'
        def p = new Product(title: 'Test', description: 'test', price: '9.95')

        then: 'validation should pass'
        p.validate()
    }
}
