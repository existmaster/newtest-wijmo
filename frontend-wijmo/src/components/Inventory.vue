<template>
    <div>
        <String label="상품아이디" v-model="value.productId" :editMode="editMode"/>
        <Date label="매입일" v-model="value.purchaseDate" :editMode="editMode"/>
        <Number offline label="재고량" v-model="value.inventoryAmount" :editMode="editMode" @change="change"/>
        <Money offline label="가격" v-model="value.price" :editMode="editMode" @change="change"/>
        <Money offline label="매입금액" v-model="value.purchaseAmount" :editMode="editMode" @change="change"/>

        <v-divider class="border-opacity-100 my-divider"></v-divider>
        <v-layout row justify-end>
            <v-btn
                width="64px"
                color="primary"
                @click="save"
            >
                저장
            </v-btn>
        </v-layout>
    </div>
</template>


<script>

import BaseEntity from './base-ui/BaseEntity'

export default {
    name: 'Inventory',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "inventories"
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>

