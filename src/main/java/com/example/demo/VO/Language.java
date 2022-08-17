package com.example.demo.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "language")
@DynamicInsert //insert 시 null 필드 제외하기 위해 사용
@DynamicUpdate // update 시 null 필드 제외하기 위해 사용
@Getter
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int language_id;

    @Column(name = "name")
    private String name;

    @Column(name = "last_update")
    private String last_update;
}
