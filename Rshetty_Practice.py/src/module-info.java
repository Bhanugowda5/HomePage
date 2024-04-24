module test_duplictes.py {
	driver.find_element(By.ID, "password").send_keys("shreesachin!5")
	driver.find_element(By.XPATH, "//a[@class='button oauth-button col-12-xs m-v-3-xs dsp-flex-xs flex-align-items-center-xs flex-justify-content-center-xs']").click()
	driver.find_element(By.XPATH, "//input[@type='email']").send_keys("shreebgowda5@gmail.com")

}
import time
from threading import Thread

from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from selenium.webdriver.common.by import By

service_obj = Service("C:\Drivers\chromedriver-win64\chromedriver.exe")
driver = webdriver.Chrome(service=service_obj)

#driver.get("https://sso.teachable.com/secure/9521/identity/login/password")
driver.get("https://rahulshettyacademy.com/angularpractice/")

driver.maximize_window()

#driver.find_element(By.ID, "email").send_keys("shreebgowda5@gmail.com")
driver.find_element(By.ID, "password").send_keys("shreesachin!5")
driver.find_element(By.XPATH, "//a[@class='button oauth-button col-12-xs m-v-3-xs dsp-flex-xs flex-align-items-center-xs flex-justify-content-center-xs']").click()
driver.find_element(By.XPATH, "//input[@type='email']").send_keys("shreebgowda5@gmail.com")

#xpath syntax:- //tagname[@attribute='value']
#driver.find_element(By.XPATH, "//input[@name= 'commit']").click()
#driver.find_element(By.XPATH, "//input[@type= 'checkbox']").click()

#CSS Selector :- tagname[attribute='value']
driver.find_element(By.CSS_SELECTOR, "input[name='email']").send_keys("bhanushree@gmail.com")



time.sleep(100);


















