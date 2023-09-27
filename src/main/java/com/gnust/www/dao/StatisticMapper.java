package com.gnust.www.dao;

import com.gnust.www.model.domain.Article;
import com.gnust.www.model.domain.Statistic;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @BelongsProject: blog_system
 * @BelongsPackage: com.gnust.www.dao
 * @FileName: StatisticMapper
 * @Author: Sube
 * @Date: 2023/9/5
 * @Version: 1.0
 * @Description: 1
 */
@Mapper
public interface StatisticMapper {
    //新增文章对应的统计信息
    @Insert("INSERT INTO t_statistic(article_id,hits,comments_num) values(#{id},0,0)")
    public void addStatistic(Article article);
    //根据文章的ID查询点击量和评论量相关信息
    @Select("SELECT * FROM t_statistic WHERE article_id=#{articleId}")
    public Statistic selectStatisticWithArticleId(Integer articleId);
    //通过文章id更新点击量

}
