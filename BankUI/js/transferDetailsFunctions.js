$(function () {
    const urlParams = new URLSearchParams(window.location.search);
    const transferId = urlParams.get("id");
  
    showTransfer(transferId);
  });
  
  function showTransfer(transferId) {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/transfers/" + transferId,
      type: "GET",
      contentType: "application/json;",
      success: function (transfer) {
         //show transfer date created value
         $("#transfer-created").append(
          "<label><b>Date Created: </b></label><label> " + transfer.created + "</label>"
        );
        //show transfer account to transfer value
        $("#transfer-account-to-transfer").append(
          "<label><b>Account to Transfer: </b></label><label> " + transfer.accountToTransfer + "</label>"
        );
      
        //show transfer amount value
        $("#transfer-amount").append(
          "<label><b>Amount: </b></label><label> " + transfer.amount + "</label>"
        );
      },
      error: function (XMLHttpRequest, textStatus, errorThrown) {
        console.log(XMLHttpRequest);
        console.log(textStatus);
        console.log(errorThrown);
      },
    });
  }
  