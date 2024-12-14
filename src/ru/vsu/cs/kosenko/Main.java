package ru.vsu.cs.kosenko;

import ru.vsu.cs.kosenko.classes.Faculty;
import ru.vsu.cs.kosenko.classes.Institute;
import ru.vsu.cs.kosenko.classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{piit, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(
                1,
                "Преподаватель 1",
                "философия");
        ResearchAssociate emp2 = new ResearchAssociate(
                2,
                "Преподаватель 2",
                "теория систем");
        ResearchAssociate emp3 = new ResearchAssociate(
                3,
                "Преподаватель 3",
                "Useless Modeling Language");
        ResearchAssociate emp4 = new ResearchAssociate(
                4,
                "Преподаватель 4",
                "теория информации");
        piit.setEmployees(new ResearchAssociate[]{emp1, emp2, emp3, emp4});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] toizi_employees = piit.getEmployees();
        System.out.println("Сотрудники кафедры " + piit.getName() + ": \n");
        for (int i = 0; i < toizi_employees.length; i++) {
            System.out.println(toizi_employees[i].getName());
        }
    }
}
