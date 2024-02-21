package sn.esmt.produit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.produit.entity.ProduitEntity;

@Repository
public interface ProduitRepository extends JpaRepository<ProduitEntity,String> {


}
