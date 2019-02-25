package com.flchen.multiple_datasource_demo.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


/**
 * @author feilongchen
 * @since 2019-01-29 4:08 PM
 */
@Data
@Entity
@Table(name = "t_users")
public class UserDO {
    @Id
    @GeneratedValue(
            strategy= GenerationType.AUTO,
            generator="native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private Long id;
    private String userId;
    private String account;
    private String username;
    private String avatar;
    private String mobile;
    private String email;
    private String qq;
}
