package blogging.System.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "blogs")
public class BlogPost {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Title shouldn't be Empty")
    private String title;
    @NotBlank(message = "Content shouldn't be Empty")
    private String content;

    @NotBlank(message = "Category shouldn't be Empty")
    private String Category;
    @NotNull(message = "createdAt is required")
    private LocalDateTime createdAt=LocalDateTime.now();
    private LocalDateTime updatedAt=LocalDateTime.now();
    @ElementCollection
    private List<String>tags;
}
