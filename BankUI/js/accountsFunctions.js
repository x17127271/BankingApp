$(function () {
    
    getAndDisplayAccounts();
});

function createAccount() {
    var accountData = {
        accountNumber: Math.floor(Math.random() * (55555555 - 11111111 + 10) + 11111111),
        balance: 3255.64,
        shortCode: Math.floor(Math.random() * (666 - 111 + 8) + 111)
    };

  $.ajax({
    type: "POST",
    url: "http://127.0.0.1:49000/api/customers/1/accounts",
    data: JSON.stringify(accountData),
    dataType : "json",
    contentType: 'application/json',
    success: function( data){
        location.reload();
    },
    error: function( jqXhr, textStatus, errorThrown ){
        console.log( errorThrown );
    }
});
}
