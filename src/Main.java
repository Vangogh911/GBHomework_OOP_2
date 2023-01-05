//–еализовать, с учетом ооп подхода, приложение
//ƒл€ проведени€ исследований с генеалогическим древом.
//»де€: описать некоторое количество компонент, например:
//      модель человека
//компонента хранени€ св€зей и отношений между людьми: родитель, ребЄнок - классика,
//      но можно подумать и про отношение, брат, свекровь, сестра и т. д.
//компонента дл€ проведени€ исследований
//дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранени€ в файл,
//      получение\построение отдельных моделей человека c Упроведением исследовани€Ф
//      можно понимать получение всех детей выбранного человека.
//
//»спользуй€ код написанный выше, необходимо гарантированно продумать иерархию компонент и взаимодействи€
//      их между собой.
//
//ќбеспечить переход от использовани€ €вных классов в сторону использовани€ абстрактных типов.
//      “ е работаем не с: конкретным экземпл€ром генеалогического древа,
//      а с интерфейсом У генеалогическое древоФ
//      конкретным экземпл€ром котика, а с интерфейсом УкотикФ,
//      лучше уйти от взаимодействи€ с конкретными питомцами
//      и повысить уровень абстракции до взаимодействи€ с котиком,
//      собачкой или хом€ком т е с интерфейсом УживотноеФ

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Men tom = new Men("Tom");
        Women sandra = new Women("Sandra");
        Men jerry = new Men("Jerry");
        Men bill = new Men("Bill");
        jerry.addParent(tom);
        jerry.addParent(sandra);
        jerry.addChild(bill);
        Reserch reserch = new Reserch();
        reserch.showParents(jerry);
        reserch.showChilds(jerry);
    }
}

interface Human {
    String getName();
    ArrayList<Human> getParents();
    void addParent(Human parent);
    ArrayList<Human> getChilds();
    void addChild(Human child);
}

class Men implements Human {
    String name;
    ArrayList<Human> parents = new ArrayList<>();
    ArrayList<Human> childs = new ArrayList<>();

    Men(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addParent(Human parent) {
        this.parents.add(parent);
    }

    @Override
    public void addChild(Human child) {
        this.childs.add(child);
    }

    @Override
    public ArrayList<Human> getParents() {
        return parents;
    }

    @Override
    public ArrayList<Human> getChilds() {
        return childs;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Women implements Human {
    String name;
    ArrayList<Human> parents = new ArrayList<>();
    ArrayList<Human> childs = new ArrayList<>();

    Women(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addParent(Human parent) {
        this.parents.add(parent);
    }

    @Override
    public void addChild(Human child) {
        this.childs.add(child);
    }

    @Override
    public ArrayList<Human> getParents() {
        return parents;
    }

    @Override
    public ArrayList<Human> getChilds() {
        return childs;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Reserch {
    public void showParents (Human human) {
        System.out.println(human.getParents().toString());
    }

    public void showChilds (Human human) {
        System.out.println(human.getChilds().toString());
    }
}
