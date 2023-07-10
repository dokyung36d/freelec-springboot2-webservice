package com.jojoldu.book.springboot.domain.posts;

import com.jojoldu.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter //클래스 내 모든 필드의 Getter 메소드를 자동으로 생성
@NoArgsConstructor //기본 생성자 자동 생성
@Entity //JPA annotation, 테이블과 링크될 클래스임을 나타냄
public class Posts extends BaseTimeEntity {

    @Id //해당 테이블의 pk임을 알림(PK = primary key)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //pk의 생성 규칙을 나타냄, 해당 설정을 통해 auto_increment가 됨
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
