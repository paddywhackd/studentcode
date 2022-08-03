import Vue from 'vue'
import VueRouter from 'vue-router'
import Products from '@/views/Products'
import ProductDetail from '@/views/ProductDetail'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'products',
    component: Products,
  },
  {
    path: '/products/:id', //path variable or route variable
    name: 'product-details',
    component: ProductDetail,
  },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
