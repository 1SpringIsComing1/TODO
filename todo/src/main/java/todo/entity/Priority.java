package todo.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "priority")
public class Priority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String publicId;
    @ManyToOne
    @JoinColumn(name="priorityTypeId")
    private PriorityType priorityType;
    @ManyToOne
    @JoinColumn(name="colorPriorityId")
    private ColorPriority colorPriority;
}
