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
      //show Account Shortcode value
      $("#account-short-code").append(
        "<label><b>Short Code: </b></label><label> " + account.shortCode + "</label>"
      );
      //show Account Shortcode value
      $("#account-number").append(
        "<label><b>Account Number: </b></label><label> " +
          account.accountNumber +
          "</label>"
      );
      //show Account Shortcode value
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
