$(function () {
    getAndDisplayTransfer();
  });
  
  function getAndDisplayTransfer() {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/transfers",
      type: "GET",
      contentType: "application/json;",
      success: function (transfers) {
        console.log(transfers);
        $("#transfer-table tbody").empty();
        $(transfers).each(function (index, item) {
          console.log(item);
  
          $("#transfer-table tbody").append(
            "<tr><td>" +
              item.id +
              "</td><td>" +
              item.created +
              "</td><td>" +
              item.accountToTransfer +
              "</td><td>" +
              item.amount +
              '</td><td><a class="btn btn-dark btn-sm" href="transfer-details.html?id=' +
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
  
  function createTransfer() {
    var tCreated = new Date($.now());
    var tAccountToTransfer = $("#forAccountToTransfer").val();   
    var tamount = $("#forAmount").val();
  
    var transferData = {
      created: tCreated,
      accountToTransfer: tAccountToTransfer,     
      amount: tamount,
    };
  
    console.log(transferData);
  
    $.ajax({
      type: "POST",
      url: "http://127.0.0.1:49000/api/customers/1/transfers",
      data: JSON.stringify(transferData),
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
  