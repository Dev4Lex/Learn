import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private WebElement tableElement; //таблица
    private WebDriver driver; //драйвер

    //Создаем конструктор класса
    public Table(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }
    //Метод для получения всех строк в таблице
    public List<WebElement> getRows() {
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr")); //поиск всех строк таблицы
        rows.remove(0); //удаление строки заголовков
        return rows; //возвращает List строк
    }

    //Метод для получения всех заголовков таблицы
    public List<WebElement> getHeadings() {
        WebElement headingsRow = tableElement.findElement(By.xpath(".//tr[1]")); //поиск строки с заголовками
        List<WebElement> headingsColumns = headingsRow.findElements(By.xpath(".//th")); //поиск заголовков внутри строки
        return headingsColumns; //возвращает List заголовков
    }

    //Метод разбиения строк на колонки
    public List<List<WebElement>> getRowsWithColumns() {
        List<WebElement> rows = getRows(); //получаем все строки
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>(); //создаем переменную строк со столбцами
        for (WebElement row : rows) {
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td")); //в каждой строке ищем столбцы
            rowsWithColumns.add(rowWithColumns); //каждую разбитую строку добавляем в список
        }
        return rowsWithColumns; //возвращаем список строк, разбитых а столбцы
    }


    //Метод получения значения ячейки по номеру строки и заголовку
    public List<Map<String, WebElement>> getRowsWithColumnsByHeadings() {   //List - список всех строку; Map-каждая строка; Ключ String(заголовок), WebElement(значение ячейки)
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns(); //получаем список строк, разбитых на заголовки
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = new ArrayList<Map<String, WebElement>>(); //создаем строки, разбитые на заголовки
        Map<String, WebElement> rowByHeadings; //создаем строку, разбитую на столбцы по заголовкам
        List<WebElement> headingColumns = getHeadings(); //получаем список заголовков

        //пробегаем по всем строкам
        for (List<WebElement> row : rowsWithColumns) {
            rowByHeadings = new HashMap<String, WebElement>(); //создаем новый HashMap для строки, разбитой на столбцы
            //перебираем все колонки в строке заголовков, чтобы получить текст заголовка
            for (int i = 0; i < headingColumns.size(); i++) {
                String heading = headingColumns.get(i).getText(); //переменная, хранящая заголовок
                WebElement cell = row.get(i); //переменная, первая ячейка в строку
                rowByHeadings.put(heading, cell); //помещаем в мапу заголовок и ячейку
            }
            rowsWithColumnsByHeadings.add(rowByHeadings); //добавляем в список полученную строку

        }
        return rowsWithColumnsByHeadings; //возвращаем необходимый List
    }

    //Метод для получения значения ячейки по номеру строки и номеру столбца
    public String getValueFromCell(int rowNumber, int columnNumber) {  //принимает номер строки и номер столбца
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        WebElement cell = rowsWithColumns.get(rowNumber - 1).get(columnNumber - 1);
        return cell.getText(); //получить текст ячейки
    }

    //Метод для получения значения ячейки по номеру строки и имени столбца
    public String getValueFromCell(int rowNumber, String columnName) {  //принимает номер строки и имя столбца
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = getRowsWithColumnsByHeadings(); //получаем все строки со столбцами, привязанными к заголовкам
        return rowsWithColumnsByHeadings.get(rowNumber - 1).get(columnName).getText();
    }

}
