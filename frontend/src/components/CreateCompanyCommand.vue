<template>
    <v-card outlined>
        <v-card-title>
            CreateCompany
        </v-card-title>

        <v-card-text>
            <String label="Name" v-model="value.name" :editMode="editMode"/>
            <String label="Industry" v-model="value.industry" :editMode="editMode"/>
            <Date label="FoundedDate" v-model="value.foundedDate" :editMode="editMode"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="createCompany"
            >
                CreateCompany
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'CreateCompanyCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.name = '';
            this.value.industry = '';
            this.value.foundedDate = '2023-10-06';
        },
        watch: {
        },
        methods: {
            createCompany() {
                this.$emit('createCompany', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

