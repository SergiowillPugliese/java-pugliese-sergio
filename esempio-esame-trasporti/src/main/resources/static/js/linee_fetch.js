const body2 = document.getElementById('body');
const tbody = document.getElementById('tbody');
const url = 'http://localhost:8090/linee';

fetch(url)
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        let linee = data;
        //console.log(linee)
        linee.map(function (pippo) {
            let tr = document.createElement('tr');
            let id = document.createElement('td');
            let nome = document.createElement('td');
            let numXtrUrb = document.createElement('td');
            let numZone = document.createElement('td');

            id.innerHTML = pippo.id;
            nome.innerHTML = pippo.nome;
            numXtrUrb.innerHTML = pippo.numExtraurbane;
            numZone.innerHTML = pippo.numZone;

            tr.appendChild(id);
            tr.appendChild(nome);
            tr.appendChild(numXtrUrb);
            tr.appendChild(numZone);
            tbody.appendChild(tr);
        })
        linee.map(function (pippo){
            pippo.fermate.map(function (pluto){
            console.log(pippo)
            let tr = document.createElement('tr');
            let nomeLinea2 = document.createElement('td');
            nomeLinea2.innerHTML = pippo.nome;
                //let tr2 = document.createElement("tr")
                let id = document.createElement("td")
                let nome = document.createElement("td")
                let zona = document.createElement("td")
                id.innerHTML = pluto.id
                nome.innerHTML = pluto.nome
                zona.innerHTML = pluto.zona
                tr.appendChild(nomeLinea2);
                tr.appendChild(id)
                tr.appendChild(nome)
                tr.appendChild(zona)
                body2.appendChild(tr)
            })
        })
    })
    .catch(function(error) {
        console.log(error);
    });
