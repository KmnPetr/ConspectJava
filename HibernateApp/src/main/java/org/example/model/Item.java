package org.example.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Item")
public class Item {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "person_id",insertable=false, updatable=false)//тут добавились послед.2 параметра не показанных в видео без них не заводилось
    private int person_id;
    @Column(name = "item_name")
    private String item_name;
    @ManyToOne
    @JoinColumn(name = "person_id",referencedColumnName = "id")
    private Person ovner;//создадим еще геттеры и сеттеры

    public Item() {}
    public Item(int person_id, String item_name) {
        this.person_id = person_id;
        this.item_name = item_name;
    }



    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public int getPerson_id() {return person_id;}

    public void setPerson_id(int person_id) {this.person_id = person_id;}

    public String getItem_name() {return item_name;}

    public void setItem_name(String item_name) {this.item_name = item_name;}

    public Person getOvner() {return ovner;}

    public void setOvner(Person ovner) {this.ovner = ovner;}

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", person_id=" + person_id +
                ", item_name='" + item_name + '\'' +
                '}';
    }
}
