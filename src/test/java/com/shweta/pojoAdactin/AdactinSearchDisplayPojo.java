package com.shweta.pojoAdactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.shweta.base.AdactinBase;

public class AdactinSearchDisplayPojo extends AdactinBase {
	
	
	public AdactinSearchDisplayPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="radiobutton_2")
	private WebElement radbtnselect;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy(id="cancel")
	private WebElement btnCancel;

	public WebElement getRadbtnselect() {
		return radbtnselect;
	}

	public void setRadbtnselect(WebElement radbtnselect) {
		this.radbtnselect = radbtnselect;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void setBtnContinue(WebElement btnContinue) {
		this.btnContinue = btnContinue;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(WebElement btnCancel) {
		this.btnCancel = btnCancel;
	}

}
