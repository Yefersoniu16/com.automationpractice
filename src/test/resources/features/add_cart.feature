Feature: as a user myself in automation practice web page
  i need to add products to the cart

  Background:

    Given the user is on the automation practice page


  @AddCart
  Scenario: The user sends a product to the cart of the women's section
    When Product selection and shipment to the cart
    Then Verify that the product is in the cart


  @ColorChange
  Scenario: The user sends a product to the cart and changes the color of the women's section
    When Product selection and color change
    Then Verify that the product is in the cart with the color modified


  @CheckPressure
  Scenario: The user enters the page adds several products
    When Select products from the page
    Then Check the pressure