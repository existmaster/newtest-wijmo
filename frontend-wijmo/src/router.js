
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import CompanyManager from "./components/ui/CompanyGrid"

import SalesOrderManager from "./components/ui/SalesOrderGrid"

import InventoryManager from "./components/ui/InventoryGrid"
import InventoryManager from "./components/ui/InventoryGrid"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/companies',
                name: 'CompanyManager',
                component: CompanyManager
            },

            {
                path: '/salesOrders',
                name: 'SalesOrderManager',
                component: SalesOrderManager
            },

            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },
            {
                path: '/inventories',
                name: 'InventoryManager',
                component: InventoryManager
            },



    ]
})