package net.youssfi.bdccfsmspringmvc.repository;

import net.youssfi.bdccfsmspringmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
