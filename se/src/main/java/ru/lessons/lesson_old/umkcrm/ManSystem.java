package by.umk.umkCrm;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class ManSystem {

    private List<Group> groups;
    private Collection<User> users;

    // Для шаблона Singletone статическая переменная
    private static ManSystem instance;

    // закрытый конструктор
    private ManSystem() {
        loadGroups();
        loadUsers();
    }

    // метод getInstance - проверяет, инициализирована ли статическая
    // переменная (в случае надобности делает это) и возвращает ее
    public static synchronized ManSystem getInstance() {
        if (instance == null) {
            instance = new ManSystem();
        }
        return instance;
    }

    // Метод, который вызывается при запуске класса
    public static void main(String[] args) {
        // Этот код позволяет нам перенаправить стандартный вывод в файл
        // Т.к. на экран выводится не совсем удобочитаемая кодировка,
        // файл в данном случае более удобен
        try {
            System.setOut(new PrintStream("out.txt"));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            return;
        }

        ManSystem ms = ManSystem.getInstance();

        // Просмотр полного списка групп
        printString("Полный список групп");
        printString("*******************");
        List<Group> allGroups = ms.getGroups();
        for (Group gi : allGroups) {
            printString(gi);
        }
        printString();


        // Просмотр полного списка студентов
        printString("Полный список пользователей");
        printString("***********************");
        Collection<User> allUsers = ms.getAllUsers();
        for (User si : allUsers) {
            printString(si);
        }
        printString();

        // Вывод списков пользователей по группам
        printString("Список пользователей по группам");
        printString("***************************");
        List<Group> groups = ms.getGroups();
        // Проверяем все группы
        for (Group gi : groups) {
            printString("---> Группа:" + gi.getNameGroup());
            // Получаем список студентов для конкретной группы
            Collection<User> users = ms.getUsersFromGroup(gi);
            for (User si : users) {
                printString(si);
            }
        }
        printString();

        // Создадим нового студента и добавим его в список
        User s = new User();
        s.setId("5");
        s.setFirstName("Игорь");
        s.setMiddleName("Владимирович");
        s.setLastName("Перебежкин");
        //s.setSex('М');
        Calendar c = Calendar.getInstance();
        c.set(1991, 8, 31);
        //s.setDateOfBirth(c.getTime());
        s.setGroupId(1);
        //s.setEducationYear(2006);
        printString("Добавление студента:" + s);
        printString("********************");
        ms.insertUser(s);
        printString("--->> Полный список студентов после добавления");
        allUsers = ms.getAllUsers();
        for (User si : allUsers) {
            printString(si);
        }
        printString();

        // Изменим данные о студенте - Перебежкин станет у нас Новоперебежкиным
        // Но все остальное будет таким же - создаем студента с таким же ИД
        s = new User();
        s.setId("5");
        s.setFirstName("Игорь");
        s.setMiddleName("Владимирович");
        s.setLastName("Новоперебежкин");
        //s.setSex('М');
        c = Calendar.getInstance();
        c.set(1991, 8, 31);
        //s.setDateOfBirth(c.getTime());
        s.setGroupId(1);
        //s.setEducationYear(2006);
        printString("Редактирование данных студента:" + s);
        printString("*******************************");
        ms.updateUser(s);
        printString("--->> Полный список студентов после редактирования");
        allUsers = ms.getAllUsers();
        for (User si : allUsers) {
            printString(si);
        }
        printString();

        // Удалим нашего студента
        printString("Удаление студента:" + s);
        printString("******************");
        ms.deleteUser(s);
        printString("--->> Полный список студентов после удаления");
        allUsers = ms.getAllUsers();
        for (User si : allUsers) {
            printString(si);
        }
        printString();

        // Здесь мы переводим всех студентов одной группы в другую
        // Мы знаем, что у нас 2 группы
        // Не совсем элегантное решение, но пока сделаем так
        Group g1 = groups.get(0);
        Group g2 = groups.get(1);
        printString("Перевод студентов из 1-ой во 2-ю группу");
        printString("***************************************");
        ms.moveUsersToGroup(g1, g2);
        printString("--->> Полный список студентов после перевода");
        allUsers = ms.getAllUsers();
        for (User si : allUsers) {
            printString(si);
        }
        printString();

        // Удаляем студентов из группы
        printString("Удаление студентов из группы:" + g2 + " в 2006 году");
        printString("*****************************");
        ms.removeUsersFromGroup(g2);
        printString("--->> Полный список студентов после удаления");
        allUsers = ms.getAllUsers();
        for (Iterator i = allUsers.iterator(); i.hasNext(); ) {
            printString(i.next());
        }
        printString();
    }

    // Метод создает две группы и помещает их в коллекцию для групп
    public void loadGroups() {
        // Проверяем - может быть наш список еще не создан вообще
        if (groups == null) {
            groups = new ArrayList<Group>();
        } else {
            groups.clear();
        }
        Group g = null;

        g = new Group();
        g.setGroupId(1);
        g.setNameGroup("Первая");
        g.setCurator("Доктор Борменталь ув");
        g.setSpeciality("Создание собачек из человеков");
        groups.add(g);

        g = new Group();
        g.setGroupId(2);
        g.setNameGroup("Вторая");
        g.setCurator("Профессор Преображенский");
        g.setSpeciality("Создание человеков из собачек");
        groups.add(g);
    }

    // Метод создает несколько пользователей и помещает их в коллекцию
    public void loadUsers() {
        if (users == null) {
            // Мы используем коллекцию, которая автоматически сортирует свои элементы
            users = new TreeSet<User>();
        } else {
            users.clear();
        }

        User s = null;
        Calendar c = Calendar.getInstance();

        // Вторая группа
        s = new User();
        s.setId("1");
        s.setFirstName("Андрей");
        s.setLastName("Слесарчук");
        s.setMiddleName("Васильевич");
        c.set(1972, 8, 27);
        //s.setDateOfBirth(c.getTime());
        s.setGroupId(2);
        users.add(s);

        s = new User();
        s.setId("2");
        s.setFirstName("Татьяна");
        s.setLastName("Нефедова");
        s.setMiddleName("Николаевна");
        c.set(1972, 7, 28);
        //s.setDateOfBirth(c.getTime());
        s.setGroupId(2);
        users.add(s);

        // Первая группа
        s = new User();
        s.setId("3");
        s.setFirstName("Мария");
        s.setLastName("Слесарчук");
        s.setMiddleName("Андреевна");
        c.set(2002, 10, 13);
        //s.setDateOfBirth(c.getTime());
        s.setGroupId(1);
        users.add(s);

        s = new User();
        s.setId("4");
        s.setFirstName("Михаил");
        s.setLastName("Слесарчук");
        s.setMiddleName("Андреевич");
        c.set(2008, 11, 10);
        //s.setDateOfBirth(c.getTime());
        s.setGroupId(1);
        users.add(s);

    }

    // Получить список групп
    public List<Group> getGroups() {
        return groups;
    }

    // Получить список всех студентов
    public Collection<User> getAllUsers() {
        return users;
    }

    // Получить список пользователей для определенной группы
    public Collection<User> getUsersFromGroup(Group group) {
        Collection<User> l = new TreeSet<User>();
        for (User si : users) {
            if (si.getGroupId() == group.getGroupId()) {
                l.add(si);
            }
        }
        return l;
    }

    // Перевести студентов из одной группы с одним годом обучения в другую группу с другим годом обучения
    public void moveUsersToGroup(Group oldGroup, Group newGroup) {
        for (User si : users) {
            if (si.getGroupId() == oldGroup.getGroupId()) {
                si.setGroupId(newGroup.getGroupId());
            }
        }
    }

    // Удалить всех пользователей из определенной группы
    public void removeUsersFromGroup(Group group) {
        // Мы создадим новый список пользователей БЕЗ тех, кого мы хотим удалить.
        // Возможно не самый интересный вариант. Можно было бы продемонстрировать
        // более элегантный метод, но он требует погрузиться в коллекции более глубоко
        // Здесь мы не ставим себе такую цель
        Collection<User> tmp = new TreeSet<User>();
        for (User si : users) {
            if (si.getGroupId() != group.getGroupId()) {
                tmp.add(si);
            }
        }
        users = tmp;
    }

    // Добавить пользователя
    public void insertUser(User user) {
        // Просто добавляем объект в коллекцию
        users.add(user);
    }

    // Обновить данные о студенте
    public void updateUser(User user) {
        // Надо найти нужного пользователя (по его ИД) и заменить поля
        User updUser = null;
        for (User si : users) {
            if (si.getId() == user.getId()) {
                // Вот этот пользователь - запоминаем его и прекращаем цикл
                updUser = si;
                break;
            }
        }
        updUser.setId(user.getId());
        updUser.setUserName(user.getUserName());
        updUser.setUserHash(user.getUserHash());
        updUser.setIsGroup(user.getIsGroup());
        updUser.setIsAdmin(user.getIsAdmin());
        updUser.setFirstName(user.getFirstName());
        updUser.setLastName(user.getLastName());
        updUser.setPhoneMobile(user.getPhoneMobile());

    }

    // Удалить студента
    public void deleteUser(User user) {
        // Надо найти нужного студента (по его ИД) и удалить
        User delUser = null;
        for (User si : users) {
            if (si.getId() == user.getId()) {
                // Вот этот студент - запоминаем его и прекращаем цикл
                delUser = si;
                break;
            }
        }
        users.remove(delUser);
    }

    // Этот код позволяет нам изменить кодировку
    // Такое может произойти если используется IDE - например NetBeans.
    // Тогда вы получаете просто одни вопросы, что крайне неудобно читать
    public static void printString(Object s) {
        try {
            //System.out.println(new String(s.toString().getBytes("windows-1251"), "windows-1252"));
            System.out.println(new String(s.toString().getBytes("utf-8"), "utf-8"));
        } catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }

    }

    public static void printString() {
        System.out.println();
    }
}
