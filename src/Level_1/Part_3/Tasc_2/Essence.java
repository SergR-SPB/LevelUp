package Level_1.Part_3.Tasc_2;

import java.util.Date;

/*Создать класс, который обозначает какую-либо сущность.
Определить у него несколько конструкторов - конструктор по умолчанию и конструктор со всеми параметрами.
Определить для него несколько параметров.
Создать массив объектов класса, который вы написали ранее.
Вывести его на экран (строку придется формировать вручную
- что-то типа array[i].brand + « » + array[i].wheelSize и т.д.).

Создать класс, спецификация которого приведена ниже.
Определить конструктор и методы setТип(), getТип(), showИнформ().
Реализовать класс в консольном приложении.
Определить дополнительно методы в классе, создающем массив объектов.
Задать критерий выбора данных и вывести эти данные на консоль.
Student: id, Фамилия, Имя, Отчество, Дата рождения, Адрес,
Телефон, Факультет, Курс, Группа.
Создать массив объектов. Вывести:
1 список студентов заданного факультета;
2 списки студентов для каждого факультета и курса;
3 список студентов, родившихся после заданного года;
4 список учебной группы.
 */
public class Essence {


    /**
     *
     * @author USER
     */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        student[] stu = new student[4];
        stu[0] = new student(1, "Abdiev", "Salamat", "Rustembayevich", new Date(1990, 9, 9), "sergeli-7", 6667606, "Ekonomicheskiy", 3, "AT-12");
        stu[1] = new student(2, "Abdullaye", "Abduhakim", "Abdurashidovich", new Date(1991, 5, 6), "mirobod", 9277606, "OPiU", 4, "AB-177");
        stu[2] = new student(3, "Lapasov", "Furqat", "Gaybullayevich", new Date(1992, 6, 19), "chuqursoy", 7277190, "Ekonomicheskiy", 2, "AT-12");
        stu[3] = new student(4, "Ermatov", "Anvar", "Abdumalikovich", new Date(1988, 11, 19), "chuqursoy", 6667190, "Mexanika", 3, "MF-162");

        Date p = new Date(1990, 9, 9);

        for (int i = 0; i <= 3; i++) {
            stu[i].show();
        }
//вывод на екран
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].fakultet();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].fakkurs();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].date_roj(p);
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].groupp();
        }


        // TODO code application logic here


    }
}

// создаем класс
class student {

    public int id;
    public String surname;
    public String name;
    public String otchestva;
    public Date data_rojdeniya;
    public String adres;
    public int telefon;
    public String fakultet;
    public int kurs;
    public String gruppa;

    public student() {
    }

    public student(int id, String surname, String name, String otchestva, Date data_rojdeniya, String adres, int telefon, String fakultet, int kurs, String gruppa) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.otchestva = otchestva;
        this.data_rojdeniya = data_rojdeniya;
        this.adres = adres;
        this.telefon = telefon;
        this.fakultet = fakultet;
        this.kurs = kurs;
        this.gruppa = gruppa;
    }

    public String getAdres() {
        return adres;
    }

    public Date getData_rojdeniya() {
        return data_rojdeniya;
    }

    public String getFakultet() {
        return fakultet;
    }

    public String getGruppa() {
        return gruppa;
    }

    public int getId() {
        return id;
    }

    public int getKurs() {
        return kurs;
    }

    public String getName() {
        return name;
    }

    public String getOtchestva() {
        return otchestva;
    }

    public String getSurname() {
        return surname;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public void setData_rojdeniya(Date data_rojdeniya) {
        this.data_rojdeniya = new Date(1990, 9, 9);
    }

    public void setFakultet(String fakultet) {
        this.fakultet = fakultet;
    }

    public void setGruppa(String gruppa) {
        this.gruppa = gruppa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOtchestva(String otchestva) {
        this.otchestva = otchestva;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public void show() {
        System.out.println("id: " + getId());
        System.out.println("Familya: " + getSurname());
        System.out.println("Imya: " + getName());
        System.out.println("Otchestva: " + getOtchestva());
        System.out.println("data rojdeniya: " + getData_rojdeniya().getYear() + "." + getData_rojdeniya().getMonth() + "." + getData_rojdeniya().getDay());
        System.out.println("adres: " + getAdres());
        System.out.println("telefon: " + getTelefon());
        System.out.println("fakultet: " + getFakultet());
        System.out.println("kurs: " + getKurs());
        System.out.println("gruppa: " + getGruppa());


    }

    //список студентов заданного факультета
    public void fakultet() {
        if ((this.getFakultet()).equals("Ekonomicheskiy")) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestva: " + getOtchestva());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear() + "." + getData_rojdeniya().getMonth() + "." + getData_rojdeniya().getDay());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());

        }

    }

    //списки студентов для каждого факультета и курса
    public void fakkurs() {
        if (((this.getFakultet()).equals("Ekonomicheskiy")) && (this.getKurs() == 3)) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestva: " + getOtchestva());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear() + "." + getData_rojdeniya().getMonth() + "." + getData_rojdeniya().getDay());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());
        }
    }

    //список студентов, родившихся после заданного года
    public void date_roj(Date p) {
        if ((this.getData_rojdeniya().getYear()) > (p.getYear())) {
            System.out.println("id: " + getId());
            System.out.println("Familya: " + getSurname());
            System.out.println("Imya: " + getName());
            System.out.println("Otchestva: " + getOtchestva());
            System.out.println("data rojdeniya: " + getData_rojdeniya().getYear());
            System.out.println("adres: " + getAdres());
            System.out.println("telefon: " + getTelefon());
            System.out.println("fakultet: " + getFakultet());
            System.out.println("kurs: " + getKurs());
            System.out.println("gruppa: " + getGruppa());
        }
    }

    // список учебной группы, ну исправить
    public void groupp() {
        if (!this.getGruppa().equals("AT-12")) {
            System.out.println("gruppa: " + getGruppa());

        }
    }
}
