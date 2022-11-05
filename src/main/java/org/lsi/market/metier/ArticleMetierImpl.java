package org.lsi.market.metier;

import java.util.List;

import org.lsi.market.dao.ArticleRepository;
import org.lsi.market.entities.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ArticleMetierImpl implements ArticleMetier {

@Autowired
private ArticleRepository ArticleRepository; 
@Override
public Article saveArticle(Article c) { 
	 // TODO Auto-generated method stub
	 return ArticleRepository.save(c); 
	 } 
	@Override
	public List<Article> listArticle() { 
	 // TODO Auto-generated method stub
	 return ArticleRepository.findAll(); 
	 } 
	} 

