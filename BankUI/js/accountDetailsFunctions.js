$(function () {
  const urlParams = new URLSearchParams(window.location.search);
  const accountId = urlParams.get("id");

  showAccount(accountId);
});

function showAccount(accountId) {
  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1/accounts/" + accountId,
    type: "GET",
    contentType: "application/json;",
    success: function (account) {
      //show Account Sortcode value
      $("#account-short-code").append(
        "<label><b>Sort Code: </b></label><label> " + account.shortCode + "</label>"
      );
      //show Account number value
      $("#account-number").append(
        "<label><b>Account Number: </b></label><label> " +
          account.accountNumber +
          "</label>"
      );
      //show Account type value
      $("#account-type").append(
        "<label><b>Account Type: </b></label><label> " +
          account.accountType +
          "</label>"
      );      
      //show Account balance value
      $("#account-balance").append(
        "<label><b>Balance: </b></label><label> " + account.balance + "</label>"
      );
    },
    error: function (XMLHttpRequest, textStatus, errorThrown) {
      console.log(XMLHttpRequest);
      console.log(textStatus);
      console.log(errorThrown);
    },
  });
}
