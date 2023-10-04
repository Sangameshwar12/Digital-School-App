package Digital_School_App.DSA.Model;

import Digital_School_App.DSA.Enum.Gender;
import Digital_School_App.DSA.Enum.Subject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobNo;

    private String emailId;

    @Enumerated(EnumType.STRING)
    private Subject subject;

    @ManyToOne
    @JoinColumn
    private School school;


}
