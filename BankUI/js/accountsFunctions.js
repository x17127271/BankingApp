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
            item.id +
            "</td><td>" +
            item.sortCode +
            "</td><td>" +
            item.accountNumber +
            "</td><td>" +
            item.accountType +
            "</td><td>" +
            item.balance +
            '</td><td><a class="btn btn-dark btn-sm" href="account-details.html?id=' +
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

function createAccount() {
  var accountType = $("#forAccountType option:checked").val();

  var accountData = {
    accountNumber: Math.floor(
      Math.random() * (55555555 - 11111111 + 10) + 11111111
    ),
    accountType: accountType,
    balance: 3255.64,
    sortCode: Math.floor(Math.random() * (666 - 111 + 8) + 111),
  };

  $.ajax({
    type: "POST",
    url: "http://127.0.0.1:49000/api/customers/1/accounts",
    data: JSON.stringify(accountData),
    dataType: "json",
    contentType: "application/json",
    success: function (data) {
      location.reload();
    },
    error: function (jqXhr, textStatus, errorThrown) {
      console.log(errorThrown);
    },
  });
}
