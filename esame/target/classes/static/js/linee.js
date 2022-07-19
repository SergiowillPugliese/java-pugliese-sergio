//fetch linee
const tablelinee = document.getElementById("linee");
const urlLinee = "http://localhost:8091/fermate/linee";
fetch(urlLinee)
  .then((response) => {
    console.log("response");
    return response.json();
  })
  .then((data) => {
    let linee = data;
    linee.map(function (linee) {
      let tr = document.createElement("tr");
      let id = document.createElement("td");
      let nome = document.createElement("td");
      let tbody = document.getElementById("tbody");

      id.innerHTML = `${linee.id}`;
      nome.innerHTML = `${linee.nome}`;

      tr.appendChild(id);
      tr.appendChild(nome);
      tbody.appendChild(tr);
    });
  })
  .catch(function (error) {
    console.log(error);
  });
