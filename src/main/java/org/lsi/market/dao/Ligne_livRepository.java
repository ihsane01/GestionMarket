package org.lsi.market.dao;

import org.lsi.market.entities.Article;
import org.lsi.market.entities.Ligne_liv;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  Ligne_livRepository extends JpaRepository<Ligne_liv,Article>{

}
