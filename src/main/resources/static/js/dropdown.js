$(".dropdown-item").click(function () {

    // Tager data fra knappen
    let dropdownValue = $(this).attr("value");
    let dropdownText = $(this).text();
    let dropdownName = $(this).attr("name");
    let dropdownId = '#' + dropdownName;

    // Fejlfinding
    // console.log(dropdownValue);
    // console.log(dropdownText);
    // console.log(dropdownName);
    // console.log(dropdownId);

    // Skal ikke gøre noget hvis Value = 0
    if (dropdownValue === 0) {
        $(dropdownId).html(dropdownText);
    } else {
        $(dropdownId).html(dropdownText);

        // Skal ligge tiden til rækken under

    }
});