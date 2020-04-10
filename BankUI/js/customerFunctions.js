$(function () {
  getCustomerDetails();
});

function getCustomerDetails() {
  $.ajax({
    url: "http://127.0.0.1:49000/api/customers/1",
    type: "GET",
    contentType: "application/json;",
    success: function (customer) {
      console.log(customer);
      //show customer name value
      $("#customer-name").append(
        "<label><b>Name: </b></label><label> " + customer.name + "</label>"
      );
      //show customer email value
      $("#customer-email").append(
        "<label><b>Email:</b> </label><label> " + customer.email + "</label>"
      );
      //show customer address value
      $("#customer-address").append(
        "<label><b>Address:</b> </label><label> " + customer.address + "</label>"
      );
      //show customer created value
      $("#customer-created").append(
        "<label><b>Created:</b> </label><label> " + customer.created + "</label>"
      );
    },
    error: function (XMLHttpRequest, textStatus, errorThrown) {
      console.log(XMLHttpRequest);
      console.log(textStatus);
      console.log(errorThrown);
    },
  });
}
