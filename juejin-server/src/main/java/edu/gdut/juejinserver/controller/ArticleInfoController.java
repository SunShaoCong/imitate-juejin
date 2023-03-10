package edu.gdut.juejinserver.controller;

import edu.gdut.juejinserver.service.ArticleInfoService;
import edu.gdut.juejinserver.utils.Result;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/juejinserver/index_data")
@CrossOrigin
public class ArticleInfoController {

    @Resource
    private ArticleInfoService articleInfoService;

    /**
     * 分页查询首页文章
     * @param current 当前页
     * @param limit 每页记录数
     * @return 统一返回结果
     */
    @GetMapping("/find_article/{current}/{limit}")
    public Result findIndexArticle(@PathVariable Integer current, @PathVariable Integer limit) {
        return Result.success().data("article_info", articleInfoService.queryArticleInfoList(current, limit));
    }

    @GetMapping("/findArticleDetail/{articleId}")
    public Result findArticleDetailById(@PathVariable String articleId) {
        return Result.success().data("articleDetail", articleInfoService.getArticleDetailById(articleId));
    }

    @GetMapping("/findArticleTags/{articleId}")
    public Result findArticleTagsById(@PathVariable String articleId) {
        return Result.success().data("tags", articleInfoService.getArticleTagsById(articleId));
    }

}

