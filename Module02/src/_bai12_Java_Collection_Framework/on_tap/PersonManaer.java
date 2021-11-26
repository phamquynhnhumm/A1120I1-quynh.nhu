package _bai12_Java_Collection_Framework.on_tap;

import java.util.List;

public class PersonManaer {
   private   List<Person> personList;

    public PersonManaer(List<Person> personList) {
        this.personList = personList;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public  void Them(Person person)

    {
        this.personList.add(person);
    }
    public  void  sua(Person person )
    {
        int index= personList.indexOf(person);
        // nếu chưa tồn tại person đó
        if( index == -1)
        {
            // thêm đối tượng vào
            Them(person);
        }
        else {
            personList.set(index, person);
        }
    }
    public void  Xoa(Person person)
    {
        int index = this.personList.indexOf(person);
        if( index == -1)
        {
            System.out.println("Không tìm thấy " +person.getName());
        }
        else
        {
            this.personList.remove(person);
        }
    }

}
