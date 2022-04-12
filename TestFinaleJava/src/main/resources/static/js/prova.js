
const table = document.getElementById('staff');
const url = 'http://localhost:8090/staff';

fetch(url)
    .then((response) => {
        return response.json();
    })
    .then((data) => {
        let staff = data;
        console.log(staff)
        staff.map(function(staff) {
            let tr = document.createElement('tr');
            let id = document.createElement('td');
            let nome = document.createElement('td');
            let cognome = document.createElement('td');
            let mansione = document.createElement('td');
            let admin = document.createElement('td');
            let tbody = document.getElementById('tbody');

            id.innerHTML = `${staff.id}`;
            nome.innerHTML = `${staff.nome}`;
            cognome.innerHTML = `${staff.cognome}`;
            mansione.innerHTML = `${staff.mansione}`;
            admin.innerHTML = `${staff.admin}`;


            tr.appendChild(id);
            tr.appendChild(nome);
            tr.appendChild(cognome);
            tr.appendChild(mansione);
            tr.appendChild(admin);
            tbody.appendChild(tr);
        });
    })
    .catch(function(error) {
        console.log(error);
    });