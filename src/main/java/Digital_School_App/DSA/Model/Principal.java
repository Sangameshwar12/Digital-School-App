package Digital_School_App.DSA.Model;

import Digital_School_App.DSA.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Principal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int age;

    @Column(unique = true, nullable = false)
    private String emailId;

    private String mobNo;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne
    @JoinColumn
    private School school;
}
