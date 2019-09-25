package t1708e.springassignment.dto;


import t1708e.springassignment.entity.Coin;
import t1708e.springassignment.entity.Market;
import t1708e.springassignment.util.DateTimeUtil;

public class CoinDTO {

    private int id;
    private String name;
    private String baseAsset;
    private String quoteAsset;
    private String lastPrice;
    private String volumn24h;
    private Market market;
    private String createdAt;
    private String updatedAt;
    private int status;

    public CoinDTO() {
    }

    public CoinDTO(Coin coin) {
        this.createdAt = DateTimeUtil.formatDateFromLong(coin.getCreatedAt());
        this.updatedAt = DateTimeUtil.formatDateFromLong(coin.getUpdatedAt());
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

    public Market getMarket() {
        return market;
    }

    public void setMarket(Market market) {
        this.market = market;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public static final class CoinDTOBuilder {
        private int id;
        private String name;
        private String baseAsset;
        private String quoteAsset;
        private String lastPrice;
        private String volumn24h;
        private Market market;
        private String createdAt;
        private String updatedAt;
        private int status;

        public CoinDTOBuilder() {
        }

        public static CoinDTOBuilder aCoinDTO() {
            return new CoinDTOBuilder();
        }

        public CoinDTOBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public CoinDTOBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CoinDTOBuilder withBaseAsset(String baseAsset) {
            this.baseAsset = baseAsset;
            return this;
        }

        public CoinDTOBuilder withQuoteAsset(String quoteAsset) {
            this.quoteAsset = quoteAsset;
            return this;
        }

        public CoinDTOBuilder withLastPrice(String lastPrice) {
            this.lastPrice = lastPrice;
            return this;
        }

        public CoinDTOBuilder withVolumn24h(String volumn24h) {
            this.volumn24h = volumn24h;
            return this;
        }

        public CoinDTOBuilder withMarket(Market market) {
            this.market = market;
            return this;
        }

        public CoinDTOBuilder withCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CoinDTOBuilder withUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CoinDTOBuilder withStatus(int status) {
            this.status = status;
            return this;
        }

        public CoinDTO build() {
            CoinDTO coinDTO = new CoinDTO();
            coinDTO.setId(id);
            coinDTO.setName(name);
            coinDTO.setBaseAsset(baseAsset);
            coinDTO.setQuoteAsset(quoteAsset);
            coinDTO.setLastPrice(lastPrice);
            coinDTO.setVolumn24h(volumn24h);
            coinDTO.setMarket(market);
            coinDTO.setCreatedAt(createdAt);
            coinDTO.setUpdatedAt(updatedAt);
            coinDTO.setStatus(status);
            return coinDTO;
        }
    }
}
