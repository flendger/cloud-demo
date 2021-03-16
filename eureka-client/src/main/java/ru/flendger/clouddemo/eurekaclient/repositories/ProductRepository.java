package ru.flendger.clouddemo.eurekaclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.flendger.clouddemo.eurekaclient.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
