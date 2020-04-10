$(function () {

  getAndDisplayAccounts();
});

function getAndDisplayAccounts() {
  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1/accounts",
    type: "GET",
    contentType: "application/json;",
    success: function (accounts) {
      console.log(accounts);
      $("#account-table tbody").empty();
      $(accounts).each(function (index, item) {
        console.log(item);
       
        $("#account-table tbody").append(
          "<tr><td>" +
            item.shortCode +
            "</td><td>" +
            item.accountNumber +
            "</td><td>" +
            item.balance +
            '</td><td><a class="btn btn-dark btn-sm" href="account-details.html?id='+item.id+'">Show</a></td></tr>'
        );
      });
    },
    error: function (XMLHttpRequest, textStatus, errorThrown) {
      console.log(XMLHttpRequest);
      console.log(textStatus);
      console.log(errorThrown);
    },
  });
}


