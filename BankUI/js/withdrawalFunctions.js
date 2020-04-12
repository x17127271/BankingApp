$(function () {
    getAndDisplayWithdrawal();
  });
  
  function getAndDisplayWithdrawal() {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/withdrawals",
      type: "GET",
      contentType: "application/json;",
      success: function (withdrawals) {
        console.log(withdrawals);
        $("#withdrawal-table tbody").empty();
        $(withdrawals).each(function (index, item) {
          console.log(item);
  
          $("#withdrawal-table tbody").append(
            "<tr><td>" +
              item.id +
              "</td><td>" +
              item.created +
              "</td><td>" +
              item.cardCredited +
              "</td><td>" +
              item.amount +
              '</td><td><a class="btn btn-dark btn-sm" href="withdrawal-details.html?id=' +
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
  
  function createWithdrawal() {
    var wCreated = new Date($.now());
    var wCardCredited = $("#forCardCredited").val();   
    var wAmount = $("#forAmount").val();
  
    var withdrawalData = {
      created: wCreated,
      cardCredited: wCardCredited,     
      amount: wAmount,
    };
  
    console.log(withdrawalData);
  
    $.ajax({
      type: "POST",
      url: "http://127.0.0.1:49000/api/customers/1/withdrawals",
      data: JSON.stringify(withdrawalData),
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
  