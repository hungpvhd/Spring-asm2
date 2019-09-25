package t1708e.springassignment.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import t1708e.springassignment.entity.Market;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer>, JpaSpecificationExecutor<Market> {
    Market findById(int id);
}
