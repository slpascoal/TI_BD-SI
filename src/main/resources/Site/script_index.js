const API_KEY = '12dc34704a0747b6b3110d3e44b4e42e';


function exibeNoticias (response) {
    let divTela = document.getElementById('telaC');
    let texto = '';

    // Montar texto HTML das noticias
    for (i=0; i < 3; i++) {
        let noticia = response.articles[i];
        let data = new Date (noticia.publishedAt);
         
       texto +=  i === 0 ? ` 
            <div class="carousel-item active">
                <img src="${noticia.urlToImage}" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5><a href="${noticia.url}" >${noticia.title}</a></h5>
                    <p>${noticia.description}</p>
                </div>
            </div>` 
            : `
            <div class="carousel-item">
                <img src="${noticia.urlToImage}" class="d-block w-100" alt="...">
                <div class="carousel-caption d-none d-md-block">
                    <h5><a href="${noticia.url}" >${noticia.title}</a></h5>
                    <p>${noticia.description}</p>
                </div>
            </div>
            `
    };

    // Preencher a DIV com o texto HTML
    console.log(texto);
    divTela.innerHTML = texto;

}

window.onload = function () {

    var url = 'https://newsapi.org/v2/top-headlines?' +
    'country=br' +
    '&category=business'+
    '&apiKey='+ API_KEY;

    var req = new Request(url);

    fetch(req)
        .then(function (response) {
            return response.json()
        }).then(function (response) {
            exibeNoticias(response);
            console.log(response);
        })
}