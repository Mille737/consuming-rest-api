$(document).ready(function() {
    $.ajax({
        url: "http://api.openweathermap.org/data/2.5/weather?zip=2300,dk&appid=ba9a981561e610c76c035a625f3c1511"
    }).then(function(data) {
        console.log(data);
        $('.coord').append(data.coord);
        $('.weather').append(data.content);
    });
});

