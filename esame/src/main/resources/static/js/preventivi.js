//fetch preventivi
const tablepreventivi = document.getElementById("preventivi");
const urlPreventivi = "http://localhost:8091/fermate/preventivi";
fetch(urlPreventivi)
  .then((response) => {
    console.log("response");
    return response.json();
  })
  .then((data) => {
    let preventivo = data;
    preventivo.map(function (preventivi) {
      let tr = document.createElement("tr");
      let id = document.createElement("td");
      let azienda = document.createElement("td");
      let piano = document.createElement("td");
      let maxfermate = document.createElement("td");
      let maxExtraurbane = document.createElement("td");
      let maxZone = document.createElement("td");
      let prezzo = document.createElement("td");
      let tbody = document.getElementById("tbody");

      id.innerHTML = `${preventivi.id}`;
      azienda.innerHTML = `${preventivi.azienda}`;
      piano.innerHTML = `${preventivi.piano}`;
      maxfermate.innerHTML = `${preventivi.maxfermate}`;
      maxExtraurbane.innerHTML = `${preventivi.maxExtraurbane}`;
      maxZone.innerHTML = `${preventivi.maxZone}`;
      prezzo.innerHTML = `${preventivi.prezzo}`;

      tr.appendChild(id);
      tr.appendChild(azienda);
      tr.appendChild(piano);
      tr.appendChild(maxfermate);
      tr.appendChild(maxExtraurbane);
      tr.appendChild(maxZone);
      tr.appendChild(prezzo);
      tbody.appendChild(tr);
    });
  })
  .catch(function (error) {
    console.log(error);
  });
