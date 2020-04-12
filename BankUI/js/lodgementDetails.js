$(function () {
    const urlParams = new URLSearchParams(window.location.search);
    const lodgementId = urlParams.get("id");
  
    showLodgement(lodgementId);
  });
  
  function showLodgement(lodgementId) {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/lodgements/" + lodgementId,
      type: "GET",
      contentType: "application/json;",
      success: function (lodgement) {
         //show lodgement date created value
         $("#lodgements-created").append(
          "<label><b>Date Created: </b></label><label> " + lodgement.created + "</label>"
        );
        //show lodgement credit card debited value
        $("#lodgements-credit-card-debited").append(
          "<label><b>Credit Card Debited: </b></label><label> " + lodgement.creditCardDebited + "</label>"
        );
      
        //show lodgement amount value
        $("#lodgements-amount").append(
          "<label><b>Amount: </b></label><label> " + lodgement.amount + "</label>"
        );
      },
      error: function (XMLHttpRequest, textStatus, errorThrown) {
        console.log(XMLHttpRequest);
        console.log(textStatus);
        console.log(errorThrown);
      },
    });
  }
  