package io.t11.orderValidation.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@NoArgsConstructor
@ToString
@Data
public class CurrentStockBid implements Serializable{

    private Double last_traded_price;
    private Double bid_price;
    private Integer sell_limit;
    private Double max_price_shift;
    private String ticker;
    private Double ask_price;
    private Integer buy_limit;

    public CurrentStockBid(
            @JsonProperty("LAST_TRADED_PRICE") Double last_traded_price,
            @JsonProperty("BID_PRICE") Double bid_price,
            @JsonProperty("SELL_LIMIT") int sell_limit,
            @JsonProperty("MAX_PRICE_SHIFT") Double max_price_shift,
            @JsonProperty("TICKER") String ticker,
            @JsonProperty("ASK_PRICE")Double ask_price,
            @JsonProperty("BUY_LIMIT") int buy_limit) {
        this.last_traded_price = last_traded_price;
        this.bid_price = bid_price;
        this.sell_limit = sell_limit;
        this.max_price_shift = max_price_shift;
        this.ticker = ticker;
        this.ask_price = ask_price;
        this.buy_limit = buy_limit;
    }
}
