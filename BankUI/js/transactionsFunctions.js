$(function () {
  
  fillAccountDropDown();
  $("#forAccount").change(function(){
    var accountId = $("#forAccount option").filter(":selected").val();
    getAndDisplayTransactions(accountId);
  });
});



function getAndDisplayTransactions(accountId) {
  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1/accounts/"+ accountId +"/transactions",
    type: "GET",
    contentType: "application/json;",
    success: function (transactions) {
      console.log(transactions);
      $("#transaction-table tbody").empty();
      $(transactions).each(function (index, item) {
        console.log(item);

        $("#transaction-table tbody").append(
          "<tr><td>" +
            item.id +
            "</td><td>" +
            item.created +
            "</td><td>" +
            item.type +
            "</td><td>" +
            item.description +
            "</td><td>" +
            item.upatedBalance +
            '</td><td><a class="btn btn-dark btn-sm" href="transaction-details.html?transactionid=' +
            item.id + '&&accountid=' + accountId +
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
  var tCreated = new Date($.now());
  var tType = $("#forType option:checked").val();
  var tDescription = $("#forDescription").val();
  var tamount = $("#forAmount").val();
  var accountId = $("#forAccount option").filter(":selected").val();

  var transactionData = {
    created: tCreated,
    type: tType,
    description: tDescription,
    upatedBalance: tamount,
  };

  console.log(transactionData);

  $.ajax({
    type: "POST",
    url: "http://127.0.0.1:49000/api/customers/1/accounts/"+ accountId +"/transactions",
    data: JSON.stringify(transactionData),
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
