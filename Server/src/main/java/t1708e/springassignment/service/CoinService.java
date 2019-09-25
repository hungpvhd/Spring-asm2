package t1708e.springassignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import t1708e.springassignment.dto.CoinDTO;
import t1708e.springassignment.entity.Coin;
import t1708e.springassignment.repository.CoinRepository;
import t1708e.springassignment.repository.MarketRepository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
public class CoinService {
    @Autowired
    CoinRepository coinRepository;

    @Autowired
    MarketRepository marketRepository;


    public List<CoinDTO> getListCoin(){
        List<CoinDTO> list = new ArrayList<>();
        for (Coin coin: coinRepository.findAll()){
            list.add(new CoinDTO.CoinDTOBuilder()
                    .withName(coin.getName())
                    .withBaseAsset(coin.getBaseAsset())
                    .withQuoteAsset(coin.getQuoteAsset())
                    .withLastPrice(coin.getLastPrice())
                    .withVolumn24h(coin.getVolumn24h())
                    .withMarket(marketRepository.findById(coin.getMarketId()))
                    .build());
        }
        return list;
    }

    public Coin create(Coin coin) {
        coin.setStatus(1);
        coin.setCreatedAt(Calendar.getInstance().getTimeInMillis());
        coin.setUpdatedAt(Calendar.getInstance().getTimeInMillis());
        return coinRepository.save(coin);
    }

    public List<CoinDTO> getListCoinByMarketId(int marketId){
        List<CoinDTO> list = new ArrayList<>();
        for (Coin coin: coinRepository.findAllByMarketId(marketId)){
            list.add(new CoinDTO.CoinDTOBuilder()
                    .withName(coin.getName())
                    .withBaseAsset(coin.getBaseAsset())
                    .withQuoteAsset(coin.getQuoteAsset())
                    .withLastPrice(coin.getLastPrice())
                    .withVolumn24h(coin.getVolumn24h())
                    .withMarket(marketRepository.findById(coin.getMarketId()))
                    .build());
        }
        return list;
    }
}
