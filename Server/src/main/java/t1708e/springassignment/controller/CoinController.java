package t1708e.springassignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import t1708e.springassignment.entity.Coin;
import t1708e.springassignment.entity.rest.RESTResponse;
import t1708e.springassignment.service.CoinService;

@RestController
@RequestMapping(value = "/api/v1/coins")
public class CoinController {

    @Autowired
    CoinService coinService;

    @PostMapping
    public ResponseEntity<Object> saveCoin(@RequestBody Coin coin){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.create(coin))
                .build(),
                HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Object> getListCoin(){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.getListCoin())
                .build(),
                HttpStatus.OK);
    }


    @GetMapping(value = "/{id}")
    public ResponseEntity<Object> getCoinByMarketId(@PathVariable int id){
        return new ResponseEntity<>(new RESTResponse.Success()
                .setStatus(HttpStatus.OK.value())
                .setMessage("Success")
                .addData(coinService.getListCoinByMarketId(id))
                .build(),
                HttpStatus.OK);
    }
}
