package io.agileinteligence.ppmtool.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.lang.reflect.GenericArrayType;
import java.util.Date;

/**
 * @author : Viraj Wickramasinghe
 * @email : viraj.wickramasinghe@axiatadigitallabs.com
 * @date : 3/2/2020
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Project {

    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String projectName;

    private String projectIdentifier;

    private String description;

    private Date startDate;

    private Date endDate;

    private Date createdAt;

    private Date updatedAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = createdAt;
    }

    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = updatedAt;
    }
}
