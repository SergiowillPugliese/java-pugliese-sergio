
const table = document.getElementById('linee-fermate');
const url = 'http://localhost:8090/linee-fermate';

fetch(url)
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        let fermate = data;
        console.log(fermate)
        fermate.map(function(fermata) {
            let tr = document.createElement('tr');
            let idFermata = document.createElement('td');
            let nomeFermata = document.createElement('td');
            let idLinea = document.createElement('td');
            let nomeLinea = document.createElement('td');
            let zona = document.createElement('td');
            let tbody = document.getElementById('tbody');

            idFermata.innerHTML = `${fermata.idFermata}`;
            nomeFermata.innerHTML = `${fermata.nomeFermata}`;
            idLinea.innerHTML = `${fermata.idLinea}`;
            nomeLinea.innerHTML = `${fermata.nomeLinea}`;
            zona.innerHTML = `${fermata.zona}`;


            tr.appendChild(idFermata);
            tr.appendChild(nomeFermata);
            tr.appendChild(idLinea);
            tr.appendChild(nomeLinea);
            tr.appendChild(zona);
            tbody.appendChild(tr);
        });
    })
    .catch(function(error) {
        console.log(error);
    });


