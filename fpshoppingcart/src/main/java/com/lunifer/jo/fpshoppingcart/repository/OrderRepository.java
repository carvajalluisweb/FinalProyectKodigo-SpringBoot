package com.lunifer.jo.fpshoppingcart.repository;

import com.lunifer.jo.fpshoppingcart.dto.ProductDTO;
import com.lunifer.jo.fpshoppingcart.entity.Order;
import com.lunifer.jo.fpshoppingcart.entity.Product;
import com.lunifer.jo.fpshoppingcart.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findOrdersByUser(User user);
    List<Order> findOrdersByUserUserId(long userId);
    void deleteAllByProductListIn(Collection<List<Product>> productList);

}
