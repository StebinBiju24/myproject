package com.sa.springbootrestdemo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sa.springbootrestdemo.entities.MobilePhone;

@Repository
public interface MobilePhoneRepository extends JpaRepository<MobilePhone, Long>{

	//in built methods or Query - SQL/HQL/JPQL
	
//	@Query(value = "select p from Product p") //HQL/JPQL
	//Or
//	@Query(value = "select * from product", nativeQuery = true) //SQL
//	public List<Mobilephone> getProducts();
	
//	@Query(value = "select * from product p where p.product_id=id", nativeQuery = true)
	//Or
//	@Query(value = "select p from Product p where p.productId=:id")
//	public Product getProductById(@Param (value = "id") long id);
	
	
}
