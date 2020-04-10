$(function () {
  getAndDisplayTransactions();
});

function getAndDisplayTransactions() {
  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1/transactions",
    type: "GET",
    contentType: "application/json;",
    success: function (accounts) {
      console.log(accounts);
      $("#transaction-table tbody").empty();
      $(accounts).each(function (index, item) {
        console.log(item);

        $("#transaction-table tbody").append(
          "<tr><td>" +
            item.type +
            "</td><td>" +
            item.description +
            "</td><td>" +
            item.upatedBalance +
            '</td><td><a class="btn btn-dark btn-sm" href="transaction-details.html?id=' +
            item.id +
            '">Show</a></td></tr>'
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

function createTransaction() {
  
}
