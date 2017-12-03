//This script uses jQuery to consume the REST service at http://localhost:8080/greeting.
// It is loaded by index.html
$(document).ready(function() {
    $.ajax({
        url: "http://rest-service.guides.spring.io/greeting"
    }).then(function(data, status, jqxhr) {
        $('.greeting-id').append(data.id);
        $('.greeting-context').append(data.content);
        console.log(jqxhr);
    });
});