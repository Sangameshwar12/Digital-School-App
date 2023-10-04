package Digital_School_App.DSA.Model;

import Digital_School_App.DSA.Enum.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfStudent;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @CreationTimestamp
    private Date dob;

    private int Standard;

    private String previousResult;

    @ManyToOne
    @JoinColumn
    private School school;
}
