package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.entities.Article;

public interface ArticleMetier {
	public Article saveArticle(Article c); 
	public List<Article> listArticle(); 

}
