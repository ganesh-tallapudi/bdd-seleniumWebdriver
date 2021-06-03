package com.ganesh.businessObjects;

public class HomePageRepo {

    public final String homePageLogo = "//img[@alt='My Store']";
    public final String tShirtTab = "//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]";
    public final String tShirtImage = "//img[@title='Faded Short Sleeve T-shirts']";
    public final String addToCartButton = "//span[normalize-space()='Add to cart']";
    public final String initialProceedToCheckoutButton = "//span[normalize-space()='Proceed to checkout']";
    public final String proceedToCheckoutButtonSummaryPage = "//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]";
    public final String proceedToCheckoutButtonAddressPage = "//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]";
    public final String agreeTermsCheckBox = "cgv";
    public final String proceedToCheckoutButtonShippingPage = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]";
    public final String payByCheckLink = "//a[@title='Pay by check.']";
    public final String confirmOrderButton = "//span[normalize-space()='I confirm my order']";
    public final String alterOrderCompletionSuccessMessage = "//p[@class='alert alert-success']";
    public final String messageForOrderId = "//div[@class='box order-confirmation']";
    public final String userTitleLink = "//a[@title='View my customer account']";
    public final String OrderHistoryButton = "//span[normalize-space()='Order history and details']";
    public final String OrderIdLink = "//a[normalize-space()='$OrderId$']";

}
