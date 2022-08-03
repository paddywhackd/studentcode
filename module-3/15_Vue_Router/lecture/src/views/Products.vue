<template>
  <div class="products">
    <h1>Products</h1>
    <product-list></product-list>
  </div>
</template>

<script>
import Productlist from "@/components/ProductsList.vue";
export default {
  components: {
    Productlist,
  },
};
</script>

<style scoped>
</style>