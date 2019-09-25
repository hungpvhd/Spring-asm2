package t1708e.springassignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import t1708e.springassignment.entity.Coin;

import java.util.List;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Integer>, JpaSpecificationExecutor<Coin> {
    List<Coin> findAllByMarketId(int id);
}
