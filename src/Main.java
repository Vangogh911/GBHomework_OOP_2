//�����������, � ������ ��� �������, ����������
//��� ���������� ������������ � ��������������� ������.
//����: ������� ��������� ���������� ���������, ��������:
//      ������ ��������
//���������� �������� ������ � ��������� ����� ������: ��������, ������ - ��������,
//      �� ����� �������� � ��� ���������, ����, ��������, ������ � �. �.
//���������� ��� ���������� ������������
//�������������� ����������, �������� ���������� �� ����� ������ � �������, �������� � ���������� � ����,
//      ���������\���������� ��������� ������� �������� c ������������ �������������
//      ����� �������� ��������� ���� ����� ���������� ��������.
//
//���������� ��� ���������� ����, ���������� �������������� ��������� �������� ��������� � ��������������
//      �� ����� �����.
//
//���������� ������� �� ������������� ����� ������� � ������� ������������� ����������� �����.
//      � � �������� �� �: ���������� ����������� ���������������� �����,
//      � � ����������� � ��������������� �����
//      ���������� ����������� ������, � � ����������� ������,
//      ����� ���� �� �������������� � ����������� ���������
//      � �������� ������� ���������� �� �������������� � �������,
//      �������� ��� ������� � � � ����������� ���������

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
