$(function () {
    const urlParams = new URLSearchParams(window.location.search);
    const transactionId = urlParams.get("transactionid");
    const accountId = urlParams.get("accountid");
  
    showTransaction(accountId,transactionId);
  });
  
  function showTransaction(accountId, transactionId) {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/accounts/"+ accountId +"/transactions/" + transactionId,
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
         //show transaction accountId value
         $("#transaction-account").append(
          "<label><b>AccountId: </b></label><label> " +
          transaction.accountId +
            "</label>"
        );
        //show transaction description value
        $("#transaction-description").append(
          "<label><b>Description: </b></label><label> " +
          transaction.description +
            "</label>"
        );
        //show transaction amount value
        $("#transaction-balance").append(
          "<label><b>Updated Balance: </b></label><label> " + transaction.amount + "</label>"
        );
      },
      error: function (XMLHttpRequest, textStatus, errorThrown) {
        console.log(XMLHttpRequest);
        console.log(textStatus);
        console.log(errorThrown);
      },
    });
  }
  