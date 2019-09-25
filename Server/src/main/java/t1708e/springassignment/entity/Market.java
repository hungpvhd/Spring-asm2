package t1708e.springassignment.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Market {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String description;
  private long createdAt;
  private long updatedAt;
  private int status;

  public Market() {
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(long createdAt) {
    this.createdAt = createdAt;
  }

  public long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }


  public static final class MarketBuilder {
    private int id;
    private String name;
    private String description;
    private long createdAt;
    private long updatedAt;
    private int status;

    private MarketBuilder() {
    }

    public static MarketBuilder aMarket() {
      return new MarketBuilder();
    }

    public MarketBuilder withId(int id) {
      this.id = id;
      return this;
    }

    public MarketBuilder withName(String name) {
      this.name = name;
      return this;
    }

    public MarketBuilder withDescription(String description) {
      this.description = description;
      return this;
    }

    public MarketBuilder withCreatedAt(long createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public MarketBuilder withUpdatedAt(long updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public MarketBuilder withStatus(int status) {
      this.status = status;
      return this;
    }

    public Market build() {
      Market market = new Market();
      market.setId(id);
      market.setName(name);
      market.setDescription(description);
      market.setCreatedAt(createdAt);
      market.setUpdatedAt(updatedAt);
      market.setStatus(status);
      return market;
    }
  }
}
