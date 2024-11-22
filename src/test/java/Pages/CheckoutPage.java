package Pages;

import Runners.RunCucumberTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static Utils.Utils.clicar;
import static Utils.Utils.pegarTexto;

public class CheckoutPage extends RunCucumberTest {
    @FindBy(css = "#cart > form > div:nth-child(1) > div.row > div.six.columns.alpha.description > div > h3")
    private WebElement titlePedido;


    public CheckoutPage() {
        PageFactory.initElements(getDriver(), this );
    }

    public String pegarTituloProduto(){
    return pegarTexto(titlePedido);
    }





}
