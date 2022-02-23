# Gjun Finance 20211212 Spring Core Coursework

`Tags:` `Gjun` `Coursework` `Java` `SpringFramework` `Maven` `Version:` `1.0` `SpringMVC`

---

[**題目**](#題目)
  - [2021/12/19 - Coursework 1](#20211219---coursework-1)
  - [2021/12/26 - Coursework 2](#20211226---coursework-2)
  - [2021/12/19 - Coursework 3](#20211219---coursework-3)
  - [2021/12/19 - Coursework 4](#20211219---coursework-4)
  - [2021/12/19 - Coursework 5](#20211219---coursework-5)

---

## 題目

### 2021/12/19 - Coursework 1

- [x] 請使用 **Java 8 stream** 進行資料分析並取得 mary 的老師有誰? (印出 name)

  程式碼: [Test01](./springcore-coursework/src/test/java/pers/yifanchi/coursework/SpringCoreCoursework_20211212/coursework_1/Test01.java)

### 2021/12/26 - Coursework 2

- [x] 完成 JsonDB.java 如果 person 已存在則 return false (name、age、birth 皆與目前資料庫某一 person 資料相同)

  程式碼: [JsonDB](./springcore-coursework/src/main/java/pers/yifanchi/coursework/SpringCoreCoursework_20211212/coursework_2/JsonDB.java)

- [x] 完成 PersonSystem.java 選項3 ~ 7資料分析與處理

  程式碼: [PersonSystem](./springcore-coursework/src/main/java/pers/yifanchi/coursework/SpringCoreCoursework_20211212/coursework_2/PersonSystem.java)

### 2021/12/19 - Coursework 3

- [x] 將每次調用 查詢 queryAll() 方法的調用時間 Log 紀錄下來(透過切面導向程式設計 AOP)

  程式碼: [Logger](./springcore-coursework/src/main/java/pers/yifanchi/coursework/SpringCoreCoursework_20211212/coursework_3/aop/Logger.java)

### 2021/12/19 - Coursework 4

- [x] 1. 建立交易紀錄 order_log 資料表，試問: 資料表應如何創建 (注意: 若 book 的 price 欄位有變動，order_log 則不影響)，請完成整段資料庫 log 寫入機制
    例如:
    Vincent在2020/01/23 PM 2:07:51 買了Java書2本共300元
    Vincent在2020/01/23 PM 2:08:51 買了Python書2本共200元
    Vincent在2020/01/23 PM 2:10:51 買了Java書4本共600元

  程式碼: [Application](./springcore-coursework/src/main/java/pers/yifanchi/coursework/SpringCoreCoursework_20211212/coursework_4/Application.java)
  DB備份: [all_data_backup](./springcore-coursework/src/main/java/pers/yifanchi/coursework/SpringCoreCoursework_20211212/coursework_4/sql/all_data_backup.sql)

### 2021/12/19 - Coursework 5

- [x] 1. 統計每個號碼出現的次數
      範例：9(7),8(5),31(3)...

  程式碼: [Lottery](./springmvc-coursework/src/main/java/pers/yifanchi/coursework/springmvc20211212/coursework_5)