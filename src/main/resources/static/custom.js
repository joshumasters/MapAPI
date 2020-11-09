let map;
    

function initMap() {
    var image = {url: '/clipart2158499.png', 
    scaledSize: new google.maps.Size(50, 50)};


    map = new google.maps.Map(document.getElementById('map'), {
        center: coords,
        zoom: 10,
        scrollwheel: false
    });
    var marker = new google.maps.Marker({
        position: coords,
        map: map,
        icon: image,
        animation: google.maps.Animation.BOUNCE
    });

    var contentString = '<h2>' + city + ', ' + state + '</h2>';

    var infowindow = new google.maps.InfoWindow({
    content: contentString
    });

    google.maps.event.addListener(marker, 'click', function() {
    infowindow.open(map,marker);
    });
}