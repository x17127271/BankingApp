$(function () {
    const urlParams = new URLSearchParams(window.location.search);
    const transactionId = urlParams.get("id");
  
    showTransaction(transactionId);
  });
  
  function showTransaction(transactionId) {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/transactions/" + transactionId,
      type: "GET",
      contentType: "application/json;",
      success: function (transaction) {
         //show transaction created value
         $("#transaction-created").append(
          "<label><b>Date Created: </b></label><label> " + transaction.created + "</label>"
        );
        //show transaction type value
        $("#transaction-type").append(
          "<label><b>Type: </b></label><label> " + transaction.type + "</label>"
        );
        //show transaction description value
        $("#transaction-description").append(
          "<label><b>Description: </b></label><label> " +
          transaction.description +
            "</label>"
        );
        //show transaction updated balance value
        $("#transaction-balance").append(
          "<label><b>Updated Balance: </b></label><label> " + transaction.upatedBalance + "</label>"
        );
      },
      error: function (XMLHttpRequest, textStatus, errorThrown) {
        console.log(XMLHttpRequest);
        console.log(textStatus);
        console.log(errorThrown);
      },
    });
  }
  