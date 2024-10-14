package me.choiduyong.springbootdeveloper.repository;

import me.choiduyong.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {

}
