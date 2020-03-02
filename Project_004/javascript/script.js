function selectMateria() {

  var checkboxes = document.getElementsByName('ckMateria');
  var dvContent = document.getElementById('dvContent');

  for (var i = 0; i < checkboxes.length; i++) {

    if (checkboxes[i].checked) {
      alert(checkboxes[i].id);
      // Dynamically inserting HTML on div.
      dvContent.innerHTML += checkboxes[i].id;
    }
  }
}
