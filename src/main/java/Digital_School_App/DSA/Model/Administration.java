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
@Builder
@NoArgsConstructor
public class Administration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true, nullable = false)
    private String emailId;

    private String addressOfAdministration;

    private String nameOfHeadOfficer;

    private String mobNo;

    private int year;

    @OneToMany(mappedBy = "administration", cascade = CascadeType.ALL)
    private List<School> schools = new ArrayList<>();



}
