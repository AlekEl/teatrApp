package com.codecool.teatr.model.play;

import javax.persistence.*;
import java.util.List;

@Entity
public class Play {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String name;
    @OneToMany
    private List<RoleToPlay> roleToPlays;
//    private List<String> authors;
}
