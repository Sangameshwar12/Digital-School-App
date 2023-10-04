package Digital_School_App.DSA.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nameOfSchool;

    @Column(unique = true, nullable = false)
    private int codeOfSchool;

    private String addressOfSchool;

    private int year;

    private int noOfStudents;

    @OneToOne(mappedBy = "school", cascade = CascadeType.ALL)
    private Principal principal;

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<>();

    @OneToMany(mappedBy = "school", cascade = CascadeType.ALL)
    private List<Teacher> teachers = new ArrayList<>();

    @ManyToOne
    @JoinColumn
    private Administration administration;

}
