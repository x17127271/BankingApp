$(function () {
    getAndDisplayLodgement();
  });
  
  function getAndDisplayLodgement() {
    $.ajax({
      url: "http://127.0.0.1:49000/api/customers/1/lodgements",
      type: "GET",
      contentType: "application/json;",
      success: function (lodgements) {
        console.log(lodgements);
        $("#lodgement-table tbody").empty();
        $(lodgements).each(function (index, item) {
          console.log(item);
  
          $("#lodgement-table tbody").append(
            "<tr><td>" +
              item.id +
              "</td><td>" +
              item.created +
              "</td><td>" +
              item.creditCardDebited +
              "</td><td>" +
              item.amount +
              '</td><td><a class="btn btn-dark btn-sm" href="lodgement-details.html?id=' +
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
  
  function createLodgement() {
    var lCreated = new Date($.now());
    var lCreditCardDebited = $("#forCreditCardDebited").val();   
    var lAmount = $("#forAmount").val();
  
    var lodgementData = {
      created: lCreated,
      creditCardDebited: lCreditCardDebited,     
      amount: lAmount,
    };
  
    console.log(lodgementData);
  
    $.ajax({
      type: "POST",
      url: "http://127.0.0.1:49000/api/customers/1/lodgements",
      data: JSON.stringify(lodgementData),
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
  