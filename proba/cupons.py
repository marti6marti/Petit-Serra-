from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
import time

# Configurar Selenium con Chrome
options = webdriver.ChromeOptions()
options.add_argument("--headless")  # Ejecutar en segundo plano
options.add_argument("--no-sandbox")
options.add_argument("--disable-dev-shm-usage")

# Iniciar navegador
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=options)

# URL de Amazon (cambia a la sección de ofertas)
amazon_url = "https://www.amazon.es/deals"
driver.get(amazon_url)
time.sleep(3)  # Esperar a que cargue la página

# Extraer productos con descuento
productos = driver.find_elements(By.CSS_SELECTOR, "div.puisg-row")

for producto in productos[:5]:  # Limitar a los primeros 5 productos
    try:
        nombre = producto.find_element(By.CSS_SELECTOR, "span.a-text-normal").text
        precio_descuento = producto.find_element(By.CSS_SELECTOR, "span.a-price-whole").text
        precio_original = producto.find_element(By.CSS_SELECTOR, "span.a-text-price").text

        print(f"📌 {nombre} - Precio original: {precio_original}, Precio con descuento: {precio_descuento}")
    except:
        continue  # Saltar si falta algún dato

# Cerrar navegador
driver.quit()
