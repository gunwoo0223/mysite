<template>
    <div>
        test
    </div>
</template>

<script>
import axios from 'axios';

export default {
    created(){
        console.log('create function entered.');
        axios.get('http://localhost:8080/axiosTest').then(response => console.log('gogo'));
    }
}
</script>