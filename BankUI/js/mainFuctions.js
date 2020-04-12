$(function () {
  fillAccountDropDown();
});

function fillAccountDropDown() {
  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1/accounts",
    type: "GET",
    contentType: "application/json;",
    success: function (accounts) {
      console.log(accounts);
      $("#forAccount").empty();
      $(accounts).each(function (index, item) {
        console.log(item);

        $("#forAccount").append(
          $("<option></option>").val(item.id).text(item.accountNumber)
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

function requestBalance() {
  var accountId = $("#forAccount option").filter(":selected").val();

  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1/accounts/" + accountId,
    type: "GET",
    contentType: "application/json;",
    success: function (account) {
      console.log(account);
      $("#balance-result").empty();
      $("#balance-result").append(
        "Your current balance for Account #"+ account.accountNumber +" is <b>" + account.balance + "</b> euros."
      );
    },
    error: function (XMLHttpRequest, textStatus, errorThrown) {
      console.log(XMLHttpRequest);
      console.log(textStatus);
      console.log(errorThrown);
    },
  });
}
