//fetch fermate
const table = document.getElementById('fermate');
const url = 'http://localhost:8091/fermate/fermate';
console.log('prima della fetch')
fetch(url)
    .then((response) => {
        console.log('response')
        return response.json();
    })
    .then((data) => {
        let fermate = data;
        console.log(fermate)
        fermate.map(function(fermata) {
            let tr = document.createElement('tr');
            let id = document.createElement('td');
            let nome = document.createElement('td');
            let zona = document.createElement('td');
            let tbody = document.getElementById('tbody');

            id.innerHTML = `${fermata.id}`;
            nome.innerHTML = `${fermata.nome}`;
            zona.innerHTML = `${fermata.zona}`;

            tr.appendChild(id);
            tr.appendChild(nome);
            tr.appendChild(zona);
            tbody.appendChild(tr);
        });
    })
    .catch(function(error) {
        console.log(error);
    });