$(function () {
    const urlParams = new URLSearchParams(window.location.search);
    const withdrawalId = urlParams.get("id");
  
    showWithdrawal(withdrawalId);
  });
  
  function showWithdrawal(withdrawalId) {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/withdrawals/" + withdrawalId,
      type: "GET",
      contentType: "application/json;",
      success: function (withdrawal) {
         //show withdrawal date created value
         $("#withdrawal-created").append(
          "<label><b>Date Created: </b></label><label> " + withdrawal.created + "</label>"
        );
        //show withdrawal card credited value
        $("#withdrawal-card-credited").append(
          "<label><b>Card Credited: </b></label><label> " + withdrawal.cardCredited + "</label>"
        );
      
        //show withdrawal amount value
        $("#withdrawal-amount").append(
          "<label><b>Amount: </b></label><label> " + withdrawal.amount + "</label>"
        );
      },
      error: function (XMLHttpRequest, textStatus, errorThrown) {
        console.log(XMLHttpRequest);
        console.log(textStatus);
        console.log(errorThrown);
      },
    });
  }
  