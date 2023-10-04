package Digital_School_App.DSA.Model;

import Digital_School_App.DSA.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfParent;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobNo;

    private String emailId;


}
