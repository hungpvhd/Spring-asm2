package t1708e.springassignment.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coin {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String baseAsset;
  private String quoteAsset;
  private String lastPrice;
  private String volumn24h;
  private int marketId;
  private long createdAt;
  private long updatedAt;
  private int status;

  public Coin() {
  }

  public Coin(String name, String baseAsset, String quoteAsset, String lastPrice, String volumn24h, int marketId, long createdAt, long updatedAt, long deletedAt, int status) {
    this.name = name;
    this.baseAsset = baseAsset;
    this.quoteAsset = quoteAsset;
    this.lastPrice = lastPrice;
    this.volumn24h = volumn24h;
    this.marketId = marketId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.status = status;
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

  public String getBaseAsset() {
    return baseAsset;
  }

  public void setBaseAsset(String baseAsset) {
    this.baseAsset = baseAsset;
  }

  public String getQuoteAsset() {
    return quoteAsset;
  }

  public void setQuoteAsset(String quoteAsset) {
    this.quoteAsset = quoteAsset;
  }

  public String getLastPrice() {
    return lastPrice;
  }

  public void setLastPrice(String lastPrice) {
    this.lastPrice = lastPrice;
  }

  public String getVolumn24h() {
    return volumn24h;
  }

  public void setVolumn24h(String volumn24h) {
    this.volumn24h = volumn24h;
  }

  public int getMarketId() {
    return marketId;
  }

  public void setMarketId(int marketId) {
    this.marketId = marketId;
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

  public static final class CoinBuilder {
    private int id;
    private String name;
    private String baseAsset;
    private String quoteAsset;
    private String lastPrice;
    private String volumn24h;
    private int marketId;
    private long createdAt;
    private long updatedAt;
    private int status;

    private CoinBuilder() {
    }

    public static CoinBuilder aCoin() {
      return new CoinBuilder();
    }

    public CoinBuilder withId(int id) {
      this.id = id;
      return this;
    }

    public CoinBuilder withName(String name) {
      this.name = name;
      return this;
    }

    public CoinBuilder withBaseAsset(String baseAsset) {
      this.baseAsset = baseAsset;
      return this;
    }

    public CoinBuilder withQuoteAsset(String quoteAsset) {
      this.quoteAsset = quoteAsset;
      return this;
    }

    public CoinBuilder withLastPrice(String lastPrice) {
      this.lastPrice = lastPrice;
      return this;
    }

    public CoinBuilder withVolumn24h(String volumn24h) {
      this.volumn24h = volumn24h;
      return this;
    }

    public CoinBuilder withMarketId(int marketId) {
      this.marketId = marketId;
      return this;
    }

    public CoinBuilder withCreatedAt(long createdAt) {
      this.createdAt = createdAt;
      return this;
    }

    public CoinBuilder withUpdatedAt(long updatedAt) {
      this.updatedAt = updatedAt;
      return this;
    }

    public CoinBuilder withStatus(int status) {
      this.status = status;
      return this;
    }

    public Coin build() {
      Coin coin = new Coin();
      coin.setId(id);
      coin.setName(name);
      coin.setBaseAsset(baseAsset);
      coin.setQuoteAsset(quoteAsset);
      coin.setLastPrice(lastPrice);
      coin.setVolumn24h(volumn24h);
      coin.setMarketId(marketId);
      coin.setCreatedAt(createdAt);
      coin.setUpdatedAt(updatedAt);
      coin.setStatus(status);
      return coin;
    }
  }
}

