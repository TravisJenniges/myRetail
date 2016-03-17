import com.myRetail.Product

class BootStrap {

    def init = { servletContext ->
        new Product(title: 'hat', description: 'baseball cap', price: '9.95', active: true).save(flush: true)
        new Product(title: 'jersey', description: 'baseball jersey', price: '19.95', active: true).save(flush: true)
        new Product(title: 'stirrup socks', description: 'socks that look like stirrups', price: '9.95').save(flush: true)
        new Product(title: 'pants', description: 'pin-striped baseball pants', price: '19.95').save(flush: true)
    }
    def destroy = {
    }
}
