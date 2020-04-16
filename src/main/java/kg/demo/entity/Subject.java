package kg.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "subject")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "subject")
    private String subject;
    @Column(name = "marks_obtained")
    private Integer marksObtained;
    @Column(name = "is_passed")
    private Boolean isPassed;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;


}
